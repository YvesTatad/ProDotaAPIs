package com.sombright.vizix.prodotaapis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button proPlayersButton = (Button) findViewById(R.id.playersButton);
        proPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proPlayersIntent = new Intent(MainActivity.this, ProPlayerActivity.class);
                startActivity(proPlayersIntent);
            }
        });

        Button proMatchesButton = (Button) findViewById(R.id.matchesButton);
        proMatchesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reposIntent = new Intent(MainActivity.this, ProMatchActivity.class);
                startActivity(reposIntent);
            }
        });

//        Button matchDetailsButton = (Button) findViewById(R.id.testButton);
//        matchDetailsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent rIntent = new Intent(MainActivity.this, MatchDetailsActivity.class);
//                startActivity(rIntent);
//            }
//        });
    }
}
