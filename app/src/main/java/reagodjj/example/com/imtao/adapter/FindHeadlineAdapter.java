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
import reagodjj.example.com.imtao.entity.FindFragmentPopularHeadline;

public class FindHeadlineAdapter extends RecyclerView.Adapter<FindHeadlineViewHolder> {
    private Context context;
    private List<FindFragmentPopularHeadline> findFragmentPopularHeadlines;

    public FindHeadlineAdapter(Context context, List<FindFragmentPopularHeadline> findFragmentPopularHeadlines) {
        this.context = context;
        this.findFragmentPopularHeadlines = findFragmentPopularHeadlines;
    }

    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public FindHeadlineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FindHeadlineViewHolder(LayoutInflater.from(context).
                inflate(R.layout.fragment_find_popular_headlines, null));
    }

    @Override
    public void onBindViewHolder(@NonNull FindHeadlineViewHolder holder, int position) {
        holder.tvLookNum.setText(String.valueOf(findFragmentPopularHeadlines.get(position).getLookNum()));
        holder.tvPraiseNum.setText(String.valueOf(findFragmentPopularHeadlines.get(position).getPraiseNum()));
        holder.tvContent.setText(findFragmentPopularHeadlines.get(position).getContent());
        holder.tvComeFrom.setText(findFragmentPopularHeadlines.get(position).getComeFrom());
        holder.ivIcon.setImageResource(findFragmentPopularHeadlines.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return findFragmentPopularHeadlines != null ? findFragmentPopularHeadlines.size() : 0;
    }
}

class FindHeadlineViewHolder extends RecyclerView.ViewHolder {
    TextView tvLookNum, tvPraiseNum, tvContent, tvComeFrom;
    ImageView ivIcon;

    FindHeadlineViewHolder(View itemView) {
        super(itemView);
        tvLookNum = itemView.findViewById(R.id.tv_look);
        tvPraiseNum = itemView.findViewById(R.id.tv_praise);
        tvContent = itemView.findViewById(R.id.tv_content);
        tvComeFrom = itemView.findViewById(R.id.tv_come_from);
        ivIcon = itemView.findViewById(R.id.iv_icon);
    }
}
