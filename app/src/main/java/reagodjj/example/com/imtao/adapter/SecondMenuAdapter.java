package reagodjj.example.com.imtao.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import reagodjj.example.com.imtao.R;
import reagodjj.example.com.imtao.entity.MainFragmentSecondMenu;

public class SecondMenuAdapter extends RecyclerView.Adapter<SecondMenuViewHolder> {
    private Context context;
    private List<MainFragmentSecondMenu> mainFragmentSecondMenus;

    public SecondMenuAdapter(Context context, List<MainFragmentSecondMenu> mainFragmentSecondMenus) {
        this.context = context;
        this.mainFragmentSecondMenus = mainFragmentSecondMenus;
    }

    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public SecondMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondMenuViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.fragment_main_second_menu_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondMenuViewHolder holder, int position) {
        holder.tvItemName.setText(mainFragmentSecondMenus.get(position).getItemName());
        holder.ivMenuIcon.setImageResource(mainFragmentSecondMenus.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return mainFragmentSecondMenus != null ? mainFragmentSecondMenus.size() : 0;
    }
}

class SecondMenuViewHolder extends RecyclerView.ViewHolder {
    ImageView ivMenuIcon;
    TextView tvItemName;

    SecondMenuViewHolder(View itemView) {
        super(itemView);

        ivMenuIcon = itemView.findViewById(R.id.iv_second_item_icon);
        tvItemName = itemView.findViewById(R.id.tv_second_item_name);
    }
}
