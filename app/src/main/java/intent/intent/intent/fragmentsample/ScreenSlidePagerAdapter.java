package intent.intent.intent.fragmentsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ScreenSlidePagerAdapter extends FragmentPagerAdapter {
    int numbOfTabs;
    public ScreenSlidePagerAdapter(FragmentManager fm, int numbOfTabs) {
        super(fm);
        this.numbOfTabs = numbOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return new FramentA();
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return new FragmentB();
            default:
                return new FramentA();
        }
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}
