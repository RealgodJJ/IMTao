package reagodjj.example.com.imtao.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Objects;

import reagodjj.example.com.imtao.R;
import reagodjj.example.com.imtao.adapter.FindHeadlineAdapter;
import reagodjj.example.com.imtao.adapter.FindMenuAdapter;
import reagodjj.example.com.imtao.adapter.FindSecondMenuAdapter;
import reagodjj.example.com.imtao.entity.FindFragmentPopularHeadline;
import reagodjj.example.com.imtao.util.DataUtil;

public class FindFragment extends Fragment {
    private RecyclerView rvFindMenu, rvFindSecondMenu, rvPopularHeadlines;
    private ProgressBar pbProcessPk1, pbProcessPk2;
    private int maxPraise = 149, leftPraise = 51, rightPraise = 98;
    private int lookNum[] = {10526, 10002, 895};
    private int praiseNum[] = {23, 15, 0};

    private ImageView ivHobbyRed, ivHobbyBlue;
    private TextView tvRedLike, tvBlueLike, tvRedPercent, tvBluePercent;


    private int icons[] = {R.mipmap.find_main_travel, R.mipmap.find_main_square,
            R.mipmap.find_main_hotwind, R.mipmap.find_main_way};
    private int secondIcons[] = {R.mipmap.find_channel_partner, R.mipmap.find_channel_me,
            R.mipmap.find_channel_online};
    private int popularHeadlines[] = {R.mipmap.find_hot_city, R.mipmap.find_hot_home, R.mipmap.find_hot_jiangnan};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_find, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        rvFindMenu = Objects.requireNonNull(getView()).findViewById(R.id.rv_find_menu);
        rvFindSecondMenu = getView().findViewById(R.id.rv_find_second_menu);
        rvPopularHeadlines = getView().findViewById(R.id.rv_popular_headlines);
        tvRedPercent = getView().findViewById(R.id.tv_red_percent);
        tvBluePercent = getView().findViewById(R.id.tv_blue_percent);
        pbProcessPk1 = getView().findViewById(R.id.pb_process_pk1);
        pbProcessPk2 = getView().findViewById(R.id.pb_process_pk2);
        ivHobbyRed = getView().findViewById(R.id.iv_hobby_red);
        ivHobbyBlue = getView().findViewById(R.id.iv_hobby_blue);
        tvRedLike = getView().findViewById(R.id.tv_red_like);
        tvBlueLike = getView().findViewById(R.id.tv_blue_like);

        pbProcessPk1.setMax(maxPraise);
        pbProcessPk2.setMax(maxPraise);
        pbProcessPk1.setProgress(leftPraise);
        pbProcessPk2.setProgress(rightPraise);

        tvRedPercent.setText(String.format(getResources().getString(R.string.red_percent),
                leftPraise * 100 / maxPraise));
        tvBluePercent.setText(String.format(getResources().getString(R.string.blue_percent),
                rightPraise * 100 / maxPraise));
        tvRedLike.setText(String.format(getResources().getString(R.string.red_like), leftPraise));
        tvBlueLike.setText(String.format(getResources().getString(R.string.blue_like), rightPraise));

        String itemNames[] = Objects.requireNonNull(getActivity()).getResources()
                .getStringArray(R.array.find_fragment_menu_item_name);
        String secondItemNames[] = getActivity().getResources()
                .getStringArray(R.array.find_fragment_second_menu_item_name);
        String popularTitles[] = getActivity().getResources()
                .getStringArray(R.array.find_fragment_popular_headlines_item_titles);
        String popularComeFroms[] = getActivity().getResources()
                .getStringArray(R.array.find_fragment_popular_headlines_item_come_from);


        rvFindMenu.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        FindMenuAdapter findMenuAdapter = new FindMenuAdapter(getActivity(),
                DataUtil.getFindFragmentMenus(itemNames, icons));
        rvFindMenu.setAdapter(findMenuAdapter);

        rvFindSecondMenu.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        FindSecondMenuAdapter findSecondMenuAdapter = new FindSecondMenuAdapter(getActivity(),
                DataUtil.getFindFragmentSecondMenus(secondItemNames, secondIcons));
        rvFindSecondMenu.setAdapter(findSecondMenuAdapter);

        rvPopularHeadlines.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        FindHeadlineAdapter findHeadlineAdapter = new FindHeadlineAdapter(
                getActivity(), DataUtil.getFindFragmentPopularHeadline(popularHeadlines, lookNum,
                praiseNum, popularTitles, popularComeFroms));
        rvPopularHeadlines.setAdapter(findHeadlineAdapter);

        ivHobbyRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftPraise += 1;
                maxPraise += 1;
                tvRedPercent.setText(String.format(getResources().getString(R.string.red_percent),
                        leftPraise * 100 / maxPraise));
                tvBluePercent.setText(String.format(getResources().getString(R.string.blue_percent),
                        rightPraise * 100 / maxPraise));
                pbProcessPk1.setMax(maxPraise);
                pbProcessPk2.setMax(maxPraise);
                pbProcessPk1.incrementProgressBy(1);
                tvRedLike.setText(String.format(getResources().getString(R.string.red_like), leftPraise));
            }
        });

        ivHobbyBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightPraise += 1;
                maxPraise += 1;
                tvRedPercent.setText(String.format(getResources().getString(R.string.red_percent),
                        leftPraise * 100 / maxPraise));
                tvBluePercent.setText(String.format(getResources().getString(R.string.blue_percent),
                        rightPraise * 100 / maxPraise));
                pbProcessPk1.setMax(maxPraise);
                pbProcessPk2.setMax(maxPraise);
                pbProcessPk2.incrementProgressBy(1);
                tvBlueLike.setText(String.format(getResources().getString(R.string.blue_like), rightPraise));
            }
        });
    }
}
