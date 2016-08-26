package com.river.test.http;

import com.river.test.bean.NewsBean;
import com.river.test.bean.NewsChannel;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/8/26.
 */
public interface NewsService {
  /**
   * 新闻频道请求api
   */
  @GET("109-34")
  Observable<NewsChannel>  getNewsChannel(@Query("showapi_appid") String appId,
      @Query("showapi_timestamp") String timestamp,
      @Query("showapi_sign") String sign);
  /**
   * 新闻列表请求api
   */
  @GET("109-34")
  Observable<List<NewsBean>> getNewsList(
      @Query("channelId") String channelId,
      @Query("channelName") String channelName,
      @Query("needContent") String needContent,
      @Query("needHtml") String needHtml,
      @Query("page") String page,
      @Query("showapi_appid") String appid,
      @Query("showapi_timestamp") String timestamp,
      @Query("title") String title
      );
}
