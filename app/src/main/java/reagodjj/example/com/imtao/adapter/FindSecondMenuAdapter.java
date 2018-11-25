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
import reagodjj.example.com.imtao.entity.FindFragmentSecondMenu;


public class FindSecondMenuAdapter extends RecyclerView.Adapter<FindSecondMenuViewHolder> {
    private Context context;
    private List<FindFragmentSecondMenu> findFragmentSecondMenus;

    public FindSecondMenuAdapter(Context context, List<FindFragmentSecondMenu> findFragmentSecondMenus) {
        this.context = context;
        this.findFragmentSecondMenus = findFragmentSecondMenus;
    }

    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public FindSecondMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FindSecondMenuViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.fragment_find_second_menu_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull FindSecondMenuViewHolder holder, int position) {
        holder.tvItemName.setText(findFragmentSecondMenus.get(position).getItemName());
        holder.ivMenuIcon.setImageResource(findFragmentSecondMenus.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return findFragmentSecondMenus != null ? findFragmentSecondMenus.size() : 0;
    }
}

class FindSecondMenuViewHolder extends RecyclerView.ViewHolder {
    ImageView ivMenuIcon;
    TextView tvItemName;

    FindSecondMenuViewHolder(View itemView) {
        super(itemView);

        ivMenuIcon = itemView.findViewById(R.id.iv_find_second_item_icon);
        tvItemName = itemView.findViewById(R.id.tv_find_second_item_name);
    }
}
