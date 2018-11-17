package reagodjj.example.com.imtao.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import reagodjj.example.com.imtao.R;
import reagodjj.example.com.imtao.adapter.MainHeaderAdvertisementAdapter;
import reagodjj.example.com.imtao.adapter.MainMenuAdapter;
import reagodjj.example.com.imtao.util.DataUtil;

public class MainFragment extends Fragment {
    private ViewPager vpAdvertisement;
    private RecyclerView rvMainMenu;
    private int[] icons = {R.mipmap.header_pic_ad1, R.mipmap.header_pic_ad2, R.mipmap.header_pic_ad1,
            R.mipmap.header_pic_ad2};
    private int[] itemIcons = {R.mipmap.menu_airport, R.mipmap.menu_hotel, R.mipmap.menu_trav,
            R.mipmap.menu_nearby, R.mipmap.menu_ticket, R.mipmap.menu_train, R.mipmap.menu_car,
            R.mipmap.menu_course};
    private String itemNames[];

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        vpAdvertisement = Objects.requireNonNull(getView()).findViewById(R.id.vp_advertisement);
        rvMainMenu = getView().findViewById(R.id.rv_main_menu);
        itemNames = Objects.requireNonNull(getActivity()).getResources()
                .getStringArray(R.array.main_fragment_menu_item_name);

        MainHeaderAdvertisementAdapter mainHeaderAdvertisementAdapter =
                new MainHeaderAdvertisementAdapter(getActivity(),
                        DataUtil.getHeaderAdvertisementInfo(getActivity(), icons));
        vpAdvertisement.setAdapter(mainHeaderAdvertisementAdapter);

        //设置布局样式
        rvMainMenu.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        MainMenuAdapter mainMenuAdapter = new MainMenuAdapter(getActivity(),
                DataUtil.getMainFragmentMenus(itemNames, itemIcons));
        rvMainMenu.setAdapter(mainMenuAdapter);
    }
}
