package reagodjj.example.com.imtao.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class MainHeaderAdvertisementAdapter extends PagerAdapter {
    private Context context;
    private List<ImageView> imageViews;

    public MainHeaderAdvertisementAdapter(Context context, List<ImageView> imageViews) {
        this.context = context;
        this.imageViews = imageViews;
    }

    //返回适配器中的页面数量
    @Override
    public int getCount() {
        return imageViews != null ? imageViews.size() : 0;
    }

    //判断PageAdapter是否能够正常运行
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(imageViews.get(position));
        return imageViews.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(imageViews.get(position));
//        container.removeViewAt(position);
    }
}
