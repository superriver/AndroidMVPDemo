package com.river.test.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Created by Administrator on 2016/8/25.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsBean {

  /**
   * allList : ["足球，有着\u201c世界第一运动\u201d的美誉，是全球体育界最具影响力的单项体育运动。就在几天前，一场足球盛宴\u2014\u2014欧洲杯完美落幕，回首历时近一个月的赛程，足球所带来的热血与激情，伴随着球迷朋友们一起见证了一个个不眠之夜，其魅力自然可见一斑。","而在漳州，也有一批热爱足球运动的青少年，这些小足球员们\u201c小荷才露尖尖角\u201d，他们挥洒汗水，正义无反顾地向着\u201c足球梦\u201d追逐奔跑。","张梦丽与其他踢球的孩子一样，为了足球她也笑过、也哭过。学校里女子足球队成立的时候，是她最开心的时候，因为球队的创立代表着自己有展示自我风采的舞台，可以出去比赛了。后来因为年龄大了几个月，她没有办法进入省队，也没能去参加省里的比赛，这些都成了她的遗憾。","一路走来，足球成了张梦丽最喜欢的东西。有时，她会梦到自己到省队了，或者去参加比赛了，这时她甚至会激动得醒来。学习成绩在班级排名中上的她表示，未来自己想考到好的学校，但同时不会放弃对足球的执着与热爱。"]
   * pubDate : 2016-07-14 11:36:05
   * title : 漳州足球大数据：拥有足球特色学校91所国家级46所
   * channelName : 社会最新
   * imageurls : []
   * desc : 就在几天前，一场足球盛宴——欧洲杯完美落幕，回首历时近一个月的赛程，足球所带来的热血与激情，伴随着球迷朋友们一起见证了一个个不眠之夜，其魅力自然可见一斑。在漳州，也有一批热爱足球运动的青少年，这些小足球员们“小荷才露尖尖角”，他们挥洒汗水，正义无反顾地向着“足球梦”追逐奔跑。
   * source : 手机中国
   * channelId : 5572a10bb3cdc86cf39001f8
   * nid : 10427894029754912460
   * link : http://m.china.com.cn/baidu/doc_1_3_1596740.html
   */
  @JsonProperty("pubDate")
  private String pubDate;
  @JsonProperty("title")
  private String title;
  @JsonProperty("channelName")
  private String channelName;
  @JsonProperty("desc")
  private String desc;
  @JsonProperty("source")
  private String source;
  @JsonProperty("channelId")
  private String channelId;
  @JsonProperty("nid")
  private String nid;
  @JsonProperty("link")
  private String link;
  @JsonProperty("allList")
  private List<String> allList;
  @JsonProperty("imageurls")
  private List<?> imageurls;

  //public String getPubDate() {
  //  return pubDate;
  //}
  //
  //public void setPubDate(String pubDate) {
  //  this.pubDate = pubDate;
  //}
  //
  //public String getTitle() {
  //  return title;
  //}
  //
  //public void setTitle(String title) {
  //  this.title = title;
  //}
  //
  //public String getChannelName() {
  //  return channelName;
  //}
  //
  //public void setChannelName(String channelName) {
  //  this.channelName = channelName;
  //}
  //
  //public String getDesc() {
  //  return desc;
  //}
  //
  //public void setDesc(String desc) {
  //  this.desc = desc;
  //}
  //
  //public String getSource() {
  //  return source;
  //}
  //
  //public void setSource(String source) {
  //  this.source = source;
  //}
  //
  //public String getChannelId() {
  //  return channelId;
  //}
  //
  //public void setChannelId(String channelId) {
  //  this.channelId = channelId;
  //}
  //
  //public String getNid() {
  //  return nid;
  //}
  //
  //public void setNid(String nid) {
  //  this.nid = nid;
  //}
  //
  //public String getLink() {
  //  return link;
  //}
  //
  //public void setLink(String link) {
  //  this.link = link;
  //}
  //
  //public List<String> getAllList() {
  //  return allList;
  //}
  //
  //public void setAllList(List<String> allList) {
  //  this.allList = allList;
  //}
  //
  //public List<?> getImageurls() {
  //  return imageurls;
  //}
  //
  //public void setImageurls(List<?> imageurls) {
  //  this.imageurls = imageurls;
  //}
}
