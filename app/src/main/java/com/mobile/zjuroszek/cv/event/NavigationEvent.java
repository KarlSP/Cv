package com.mobile.zjuroszek.cv.event;

/**
 * Created by zjuroszek on 15.10.15.
 */
public class NavigationEvent {

    private int activityId;
    private int fragmentId;
    private int position;


    public NavigationEvent(int activityId, int fragmentId, int position) {
        this.activityId = activityId;
        this.fragmentId = fragmentId;
        this.position = position;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getFragmentId() {
        return fragmentId;
    }

    public void setFragmentId(int fragmentId) {
        this.fragmentId = fragmentId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
