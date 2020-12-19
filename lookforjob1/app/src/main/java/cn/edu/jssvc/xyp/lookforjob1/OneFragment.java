package cn.edu.jssvc.xyp.lookforjob1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class OneFragment extends Fragment {

    // 定义java对象
    private RecyclerView recy_view1;   //菜谱的列表
    private RecyclerView recy_view_tags;  //菜谱的类型


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //关联ragment这个布局文件
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        //2将布局对象和控件进行绑定
        initView(view);
        return view;
    }


    private void initView(View view) {
//        recy_view1 = (RecyclerView) view.findViewById(R.id.recy_view1);
//        recy_view_tags = (RecyclerView) view.findViewById(R.id.recy_view_tags);
    }

}
