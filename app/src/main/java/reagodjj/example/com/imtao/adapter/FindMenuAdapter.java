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
import reagodjj.example.com.imtao.entity.FindFragmentMenu;

public class FindMenuAdapter extends RecyclerView.Adapter<FindMenuViewHolder> {
    private Context context;
    private List<FindFragmentMenu> findFragmentMenus;

    public FindMenuAdapter(Context context, List<FindFragmentMenu> findFragmentMenus) {
        this.context = context;
        this.findFragmentMenus = findFragmentMenus;
    }

    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public FindMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FindMenuViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.fragment_find_menu_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull FindMenuViewHolder holder, int position) {
        holder.tvItemName.setText(findFragmentMenus.get(position).getItemName());
        holder.ivMenuIcon.setImageResource(findFragmentMenus.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return findFragmentMenus != null ? findFragmentMenus.size() : 0;
    }
}

class FindMenuViewHolder extends RecyclerView.ViewHolder {
    ImageView ivMenuIcon;
    TextView tvItemName;

    FindMenuViewHolder(View itemView) {
        super(itemView);

        ivMenuIcon = itemView.findViewById(R.id.iv_find_item_icon);
        tvItemName = itemView.findViewById(R.id.tv_find_item_name);
    }
}
