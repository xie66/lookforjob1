package cn.edu.jssvc.xyp.lookforjob1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    List<Job> mJobList;

    public JobAdapter(List<Job> firstlist) {
        mJobList = firstlist;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView jobImage;
        TextView jobName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobImage = (ImageView) itemView.findViewById(R.id.job_image);
            jobName = (TextView) itemView.findViewById(R.id.job_name);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_two, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Job job = mJobList.get(position);
        holder.jobImage.setImageResource(job.getImgID());
        holder.jobName.setText(job.getName());
    }

    @Override
    public int getItemCount() {
        return mJobList.size();
    }


}
