package com.river.test.http;

import com.river.test.bean.NewsChannel;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/8/26.
 */
public class RetrofitManager {
  private NewsService mNewsService;
  private volatile OkHttpClient mOkHttpClient;

  public  RetrofitManager(){
    Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.NEWS_URL).client(getOkHttpClient())
        .addConverterFactory(JacksonConverterFactory.create())
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .build();
    mNewsService = retrofit.create(NewsService.class);
  }
  public OkHttpClient getOkHttpClient(){
    if(mOkHttpClient==null)
    {
      synchronized (RetrofitManager.class)
      {
        if(mOkHttpClient==null)
        {
          mOkHttpClient = new OkHttpClient.Builder().retryOnConnectionFailure(true)
              .connectTimeout(30, TimeUnit.SECONDS).build();
        }
      }
    }
    return mOkHttpClient;
  }
  public Observable<NewsChannel> getNewsChannel(String appId,String timesamp, String sign){
    return mNewsService.getNewsChannel(appId,timesamp,sign).subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread()).unsubscribeOn(Schedulers.io());
  }
}
