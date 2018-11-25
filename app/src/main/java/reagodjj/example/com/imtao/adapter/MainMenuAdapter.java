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
import reagodjj.example.com.imtao.entity.MainFragmentMainMenu;

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuViewHolder> {
    private Context context;
    private List<MainFragmentMainMenu> mainFragmentMenus;

    public MainMenuAdapter(Context context, List<MainFragmentMainMenu> mainFragmentMenus) {
        this.context = context;
        this.mainFragmentMenus = mainFragmentMenus;
    }

    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public MainMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainMenuViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.fragment_main_main_menu_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull MainMenuViewHolder holder, int position) {
        MainFragmentMainMenu mainFragmentMenu = mainFragmentMenus.get(position);
        holder.ivMenuIcon.setImageResource(mainFragmentMenu.getIcon());
        holder.tvItemName.setText(mainFragmentMenu.getItemName());
    }

    @Override
    public int getItemCount() {
        return mainFragmentMenus != null ? mainFragmentMenus.size() : 0;
    }
}

class MainMenuViewHolder extends RecyclerView.ViewHolder {
    ImageView ivMenuIcon;
    TextView tvItemName;

    MainMenuViewHolder(View itemView) {
        super(itemView);

        ivMenuIcon = itemView.findViewById(R.id.iv_main_item_icon);
        tvItemName = itemView.findViewById(R.id.tv_main_item_name);
    }
}
