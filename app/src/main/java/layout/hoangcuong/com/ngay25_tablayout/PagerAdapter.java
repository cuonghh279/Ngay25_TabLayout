package layout.hoangcuong.com.ngay25_tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Javis on 9/28/2016.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position){
            case 0:
                frag = new AndroidFragment();
                break;
            case 1:
                frag = new IOSFragment();
                break;
            case 2:
                frag = new PHPFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Android";
                break;
            case 1:
                title = "IOS";
                break;
            case 2:
                title = "PHP";
                break;
        }
        return title;
    }
}
