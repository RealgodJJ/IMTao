package reagodjj.example.com.imtao.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import reagodjj.example.com.imtao.R;
import reagodjj.example.com.imtao.adapter.MainHeaderAdvertisementAdapter;
import reagodjj.example.com.imtao.util.DataUtil;

public class MainFragment extends Fragment {
    private ViewPager vpAdvertisement;
    private int[] icons = {R.mipmap.header_pic_ad1, R.mipmap.header_pic_ad2, R.mipmap.header_pic_ad1,
            R.mipmap.header_pic_ad2};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        vpAdvertisement = Objects.requireNonNull(getView()).findViewById(R.id.vp_advertisement);

        MainHeaderAdvertisementAdapter mainHeaderAdvertisementAdapter =
                new MainHeaderAdvertisementAdapter(getActivity(), DataUtil.getHeaderAdvertisementInfo(getActivity(), icons));
        vpAdvertisement.setAdapter(mainHeaderAdvertisementAdapter);
    }
}
