//package com.sombright.vizix.prodotaapis;
//
//import android.content.Context;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//
//public class CategoryAdapter extends FragmentPagerAdapter {
//
//    private Context mContext;
//
//    public CategoryAdapter(Context context, FragmentManager fm) {
//        super(fm);
//        mContext = context;
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        if (position == 0) {
//            return new MatchSummaryFragment();
//        } else {
//            return new MatchDetailsFragment();
//        }
//    }
//
//    @Override
//    public int getCount() {
//        return 2;
//    }
//
//    @Override
//    public CharSequence getPageTitle(int position) {
//        if (position == 0) {
//            return mContext.getString(R.string.match_summary);
//        } else {
//            return mContext.getString(R.string.match_details);
//        }
//    }
//}
