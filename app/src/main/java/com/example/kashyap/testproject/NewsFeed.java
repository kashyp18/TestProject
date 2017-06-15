package com.example.kashyap.testproject;

/**
 *
 * Created by kashyap on 15/6/17.
 */

public class NewsFeed {

    private String userName;
    private String count;
    private String time;
    private String likeCount;
    private String text;

    public NewsFeed (String userName,String count, String time,String text) {
        this.userName = userName;
        this.count = count;
        this.time = time;
       // this.likeCount = likeCount;
        this.text = text;
    }

    public String getUserName() {
        return userName;
    }

    public String getCount() {
        return count;
    }

    public String getTime() {
        return time;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public String getText() {
        return text;
    }
}
