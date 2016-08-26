package com.river.test.module.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import com.river.test.R;
import com.river.test.bean.NewsBean;
import com.river.test.module.view.INewsListView;
import java.util.List;

/**
 * Created by Administrator on 2016/8/25.
 */
public class NewsActivity extends AppCompatActivity implements INewsListView{
  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @Override public void updateNewsList(List<NewsBean> newsList) {

  }
}
