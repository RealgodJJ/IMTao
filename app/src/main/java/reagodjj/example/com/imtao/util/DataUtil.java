package reagodjj.example.com.imtao.util;

import android.content.Context;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    //获取图片
    public static List<ImageView> getHeaderAdvertisementInfo(Context context, int icons[]) {
        List<ImageView> datas = new ArrayList<>();
        for (int i : icons) {
            ImageView icon = new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(i);
            datas.add(icon);
        }
        return datas;
    }
}
