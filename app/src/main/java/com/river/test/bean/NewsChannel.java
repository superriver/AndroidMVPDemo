package com.river.test.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Administrator on 2016/8/25.
 */
public class NewsChannel {

  /**
   * channelId : 5572a108b3cdc86cf39001cd
   * name : 国内焦点
   */
  @JsonProperty("channelId")
  private String channelId;
  @JsonProperty("name")
  private String channeName;


}
