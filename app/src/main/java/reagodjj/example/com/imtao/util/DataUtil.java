package reagodjj.example.com.imtao.util;

import android.content.Context;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import reagodjj.example.com.imtao.entity.MainFragmentMenu;

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
    public static List<MainFragmentMenu> getMainFragmentMenus(String itemNames[], int icons[]) {
        List<MainFragmentMenu> menus = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            MainFragmentMenu mainFragmentMenu = new MainFragmentMenu(itemNames[i], icons[i]);
            menus.add(mainFragmentMenu);
        }
        return menus;
    }
}
