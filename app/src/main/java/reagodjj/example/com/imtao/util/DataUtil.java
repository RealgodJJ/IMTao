package reagodjj.example.com.imtao.util;

import android.content.Context;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import reagodjj.example.com.imtao.entity.FindFragmentMenu;
import reagodjj.example.com.imtao.entity.FindFragmentPopularHeadline;
import reagodjj.example.com.imtao.entity.FindFragmentSecondMenu;
import reagodjj.example.com.imtao.entity.MainFragmentMainMenu;
import reagodjj.example.com.imtao.entity.MainFragmentSecondMenu;

public class DataUtil {

    //获取广告图片
    public static List<ImageView> getHeaderAdvertisementInfo(Context context, int icons[]) {
        List<ImageView> imageViews = new ArrayList<>();
        for (int i : icons) {
            ImageView icon = new ImageView(context);
            //保证图片填充页面
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(i);
            imageViews.add(icon);
        }
        return imageViews;
    }

    //获取主菜单
    public static List<MainFragmentMainMenu> getMainFragmentMenus(String itemNames[], int icons[]) {
        List<MainFragmentMainMenu> menus = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            MainFragmentMainMenu mainFragmentMenu = new MainFragmentMainMenu(itemNames[i], icons[i]);
            menus.add(mainFragmentMenu);
        }
        return menus;
    }

    //获取二级菜单
    public static List<MainFragmentSecondMenu> getMainFragmentSecondMenus(String itemNames[], int icons[]) {
        List<MainFragmentSecondMenu> menus = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            MainFragmentSecondMenu mainFragmentSecondMenu = new MainFragmentSecondMenu(itemNames[i], icons[i]);
            menus.add(mainFragmentSecondMenu);
        }
        return menus;
    }

    public static List<FindFragmentMenu> getFindFragmentMenus(String itemNames[], int icons[]) {
        List<FindFragmentMenu> menus = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            FindFragmentMenu findFragmentMenu = new FindFragmentMenu(icons[i], itemNames[i]);
            menus.add(findFragmentMenu);
        }
        return menus;
    }

    public static List<FindFragmentSecondMenu> getFindFragmentSecondMenus(String itemNames[], int icons[]) {
        List<FindFragmentSecondMenu> menus = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            FindFragmentSecondMenu findFragmentSecondMenu = new FindFragmentSecondMenu(itemNames[i], icons[i]);
            menus.add(findFragmentSecondMenu);
        }
        return menus;
    }

    public static List<FindFragmentPopularHeadline> getFindFragmentPopularHeadline(int icons[], int lookNums[], int praiseNums[], String contents[], String comeFroms[]) {
        List<FindFragmentPopularHeadline> headlines = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            FindFragmentPopularHeadline findFragmentPopularHeadline =
                    new FindFragmentPopularHeadline(icons[i], lookNums[i], praiseNums[i], contents[i], comeFroms[i]);
            headlines.add(findFragmentPopularHeadline);
        }
        return headlines;
    }
}
