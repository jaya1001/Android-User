package com.code.yashladha.android_user.Models;

public class Item {

    private long item_id;
    private String order_date;
    private String uid;
    private long pid;
    private long order_id;
    private int ratings;

    public Item(long item_id, String order_date, String uid, long pid, long order_id, int ratings) {
        this.item_id = item_id;
        this.order_date = order_date;
        this.uid = uid;
        this.pid = pid;
        this.order_id = order_id;
        this.ratings = ratings;
    }

    public long getItem_id() {
        return item_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public String getUid() {
        return uid;
    }

    public long getPid() {
        return pid;
    }

    public long getOrder_id() {
        return order_id;
    }

    public int getRatings() {
        return ratings;
    }

}
