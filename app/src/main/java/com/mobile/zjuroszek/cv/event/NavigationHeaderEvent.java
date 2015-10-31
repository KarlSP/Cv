package com.mobile.zjuroszek.cv.event;

/**
 * Created by zjuroszek on 15.10.15.
 */
public class NavigationHeaderEvent {
    public static final int CONTRACT_LIST = 1;
    public static final int LOG_OUT = 2;
    public static final int SETTINGS = 3;

    private final int status;

    public NavigationHeaderEvent( int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
