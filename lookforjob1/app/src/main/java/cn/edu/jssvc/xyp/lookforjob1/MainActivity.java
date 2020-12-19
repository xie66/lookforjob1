package cn.edu.jssvc.xyp.lookforjob1;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //1定义java对象
    private ViewPager view_pager;
    private RadioButton radio_one;
    private RadioButton radio_two;
    private RadioButton radio_three;
    private RadioButton radio_four;
    private RadioGroup radio_group;

    //创建3张卡片对应的对象
    private Fragment onefragment, twofragment, threefragment, fourfragment;
    //创建卡片数组
    private List<Fragment> fragarrlist = new ArrayList<>();
    //默认显示第一张卡片
    private int position = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2绑定控件
        initView();

        //3创建初始化数据方法
        initData();

        //4处理滑屏事件
        initMove();

        //5单击事件
        initOnclick();

    }


    private void initView() {
        view_pager = (ViewPager) findViewById(R.id.view_pager);
        radio_one = (RadioButton) findViewById(R.id.radio_one);
        radio_two = (RadioButton) findViewById(R.id.radio_two);
        radio_three = (RadioButton) findViewById(R.id.radio_three);
        radio_four = (RadioButton) findViewById(R.id.radio_four);
        radio_group = (RadioGroup) findViewById(R.id.radio_group);
    }

    private void initData() {
        //创建相应的卡片对象
        onefragment = new OneFragment();
        twofragment = new TwoFragment();
        threefragment = new ThreeFragment();
        fourfragment = new FourFragment();

        //将3个卡片对象放入到数组内
        fragarrlist.add(onefragment);
        fragarrlist.add(twofragment);
        fragarrlist.add(threefragment);
        fragarrlist.add(fourfragment);

        //创建适配器对象
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager(), fragarrlist);
        //给ViewPager滑屏设置适配器
        view_pager.setAdapter(adapter);

        //默认显示第一张卡片
        ((RadioButton) radio_group.getChildAt(position)).setChecked(true);


//        ((RadioButton)radio_group.getChildAt(positon)).setChecked(true);

    }

    private void initMove() {
        //给viewpager添加滑屏事件
        view_pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                ((RadioButton) radio_group.getChildAt(position)).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initOnclick() {
        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_one:
                        position = 0;
                        view_pager.setCurrentItem(position);
                        break;
                    case R.id.radio_two:
                        position = 1;
                        view_pager.setCurrentItem(position);
                        break;
                    case R.id.radio_three:
                        position = 2;
                        view_pager.setCurrentItem(position);
                        break;
                    case R.id.radio_four:
                        position = 3;
                        view_pager.setCurrentItem(position);
                        break;
                    default:
                        position = 0;
                        view_pager.setCurrentItem(position);
                        break;
                }
            }
        });
    }
}