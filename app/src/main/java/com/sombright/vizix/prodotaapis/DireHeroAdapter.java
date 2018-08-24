//package com.sombright.vizix.prodotaapis;
//
//import android.content.Context;
//import android.graphics.Color;
//import android.support.v7.widget.CardView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//
//import com.sombright.vizix.prodotaapis.detailedmatch.MatchDetailsGsonViewer;
//import com.sombright.vizix.prodotaapis.detailedmatch.Player;
//import com.squareup.picasso.Picasso;
//
//import java.util.List;
//
//public class DireHeroAdapter extends ArrayAdapter<Player> {
//
//    public DireHeroAdapter(Context context, List<Player> players) {
//        super(context, 0, players);
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View listItemView = convertView;
//        if (listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(
//                    R.layout.dire_hero_list_item, parent, false);
//        }
//
//        Player players = getItem(position);
//
//        ImageView heroAvatarImage = (ImageView) listItemView.findViewById(R.id.direHeroAvatar);
//
//        String heroAvatar = players.getHeroId().toString();
//
//        //region HeroAvatar SwitchCase
//        switch (heroAvatar) {
//            case "1":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/antimage_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "2":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/axe_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "3":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/bane_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "4":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/bloodseeker_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "5":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/crystal_maiden_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "6":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/drow_ranger_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "7":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/earthshaker_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "8":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/juggernaut_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "9":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/mirana_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "10":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/morphling_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "11":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/nevermore_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "12":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/phantom_lancer_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "13":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/puck_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "14":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/pudge_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "15":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/razor_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "16":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/sand_king_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "17":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/storm_spirit_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "18":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/sven_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "19":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/tiny_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "20":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/vengefulspirit_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "21":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/windrunner_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "22":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/zuus_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "23":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/kunkka_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "25":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lina_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "26":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lion_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "27":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/shadow_shaman_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "28":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/slardar_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "29":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/tidehunter_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "30":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/witch_doctor_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "31":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lich_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "32":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/riki_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "33":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/enigma_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "34":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/tinker_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "35":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/sniper_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "36":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/necrolyte_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "37":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/warlock_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "38":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/beastmaster_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "39":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/queenofpain_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "40":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/venomancer_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "41":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/faceless_void_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "42":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/skeleton_king_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "43":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/death_prophet_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "44":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/phantom_assassin_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "45":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/pugna_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "46":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/templar_assassin_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "47":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/viper_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "48":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/luna_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "49":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/dragon_knight_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "50":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/dazzle_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "51":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/rattletrap_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "52":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/leshrac_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "53":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/furion_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "54":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/life_stealer_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "55":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/dark_seer_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "56":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/clinkz_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "57":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/omniknight_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "58":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/enchantress_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "59":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/huskar_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "60":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/night_stalker_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "61":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/broodmother_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "62":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/bounty_hunter_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "63":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/weaver_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "64":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/jakiro_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "65":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/batrider_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "66":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/chen_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "67":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/spectre_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "68":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/ancient_apparition_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "69":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/doom_bringer_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "70":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/ursa_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "71":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/spirit_breaker_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "72":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/gyrocopter_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "73":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/alchemist_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "74":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/invoker_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "75":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/silencer_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "76":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/obsidian_destroyer_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "77":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lycan_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "78":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/brewmaster_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "79":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/shadow_demon_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "80":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/lone_druid_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "81":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/chaos_knight_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "82":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/meepo_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "83":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/treant_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "84":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/ogre_magi_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "85":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/undying_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "86":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/rubick_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "87":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/disruptor_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "88":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/nyx_assassin_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "89":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/naga_siren_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "90":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/keeper_of_the_light_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "91":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/wisp_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "92":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/visage_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "93":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/slark_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "94":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/medusa_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "95":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/troll_warlord_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "96":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/centaur_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "97":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/magnataur_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "98":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/shredder_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "99":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/bristleback_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "100":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/tusk_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "101":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/skywrath_mage_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "102":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/abaddon_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "103":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/elder_titan_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "104":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/legion_commander_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "105":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/techies_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "106":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/ember_spirit_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "107":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/earth_spirit_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "108":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/abyssal_underlord_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "109":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/terrorblade_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "110":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/phoenix_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "111":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/oracle_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "112":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/winter_wyvern_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "114":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/monkey_king_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "119":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/dark_willow_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "120":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/pangolier_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//            case "127":
//                Picasso.get().load("http://cdn.dota2.com/apps/dota2/images/heroes/target_dummy_lg.png").fit().centerCrop().into(heroAvatarImage);
//                break;
//        }
//        //endregion
//
//        TextView direPlayerNameView = listItemView.findViewById(R.id.direPlayerNameText);
//        TextView direPlayerStatsView = listItemView.findViewById(R.id.direPlayerStatsText);
//        TextView direPlayerGoldView = listItemView.findViewById(R.id.direPlayerGoldText);
//        TextView direPlayerLastHitsView = listItemView.findViewById(R.id.direPlayerLastHitsText);
//        TextView direPlayerLevelView = listItemView.findViewById(R.id.direPlayerLevelText);
//        String playerName = players.getPersonaname();
//        String kills = players.getKills().toString();
//        String deaths = players.getDeaths().toString();
//        String assists = players.getAssists().toString();
//        String level = players.getLevel().toString();
//        String lasthits = players.getLastHits().toString();
//        String totalGold = players.getTotalGold().toString();
//
//        direPlayerNameView.setText(playerName);
//        direPlayerStatsView.setText(kills + "/" + deaths + "/" + assists);
//        direPlayerGoldView.setText("Total Gold: " + totalGold);
//        direPlayerLastHitsView.setText("LH: " + lasthits);
//        direPlayerLevelView.setText("Lvl: " + level);
//
//        LinearLayout direPlayerListItemHolderView = listItemView.findViewById(R.id.direPlayerListItemHolder);
//        boolean isPlayerRadiant = players.getIsRadiant();
//
//        if (isPlayerRadiant){
//            direPlayerListItemHolderView.setVisibility(View.GONE);
//        }
//
//        else if (!isPlayerRadiant){
//            direPlayerListItemHolderView.setVisibility(View.VISIBLE);
//        }
//
//        return listItemView;
//    }
//
//}
