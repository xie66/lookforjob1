package cn.edu.jssvc.xyp.lookforjob1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TwoFragment extends Fragment {
    Toolbar toolbar;
    ImageView imageView;
    RecyclerView recyclerViewjob;
    List<Job> jobList = new ArrayList<Job>();


    private void initJob() {
        Job apple = new Job("陕西红富士", R.drawable.arrow_right, "优质苹果，香甜爽口", "￥20/kg");
        jobList.add(apple);
        Job apple1 = new Job("陕西红富士", R.drawable.arrow_right, "优质苹果，香甜爽口", "￥20/kg");
        jobList.add(apple1);
        Job apple2 = new Job("陕西红富士", R.drawable.arrow_right, "优质苹果，香甜爽口", "￥20/kg");
        jobList.add(apple2);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        recyclerViewjob = (RecyclerView) view.findViewById(R.id.recyview_job);
        imageView = (ImageView) view.findViewById(R.id.two_back);
        JobAdapter jobAdapter = new JobAdapter(jobList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity());
        recyclerViewjob.setLayoutManager(linearLayoutManager);
        recyclerViewjob.setAdapter(jobAdapter);
        initJob();
        return view;
    }


}
