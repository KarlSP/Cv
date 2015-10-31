package com.mobile.zjuroszek.cv.model;

/**
 * Created by zjuroszek on 12.10.15.
 */
public class NavigationDrawerItem {
    // zmienna inicjowana w klasie BaseActivity
    private boolean hasHeader = true;
    private boolean isContract;
    private int iconId = 0;
    private String title;
    private int activityId;
    private int fragmentId;

    public NavigationDrawerItem() {

    }

    public NavigationDrawerItem(boolean hasHeader, boolean isContract, int iconId, String title, int activityId, int fragmentId) {
        this.hasHeader = hasHeader;
        this.isContract = isContract;
        this.iconId = iconId;
        this.title = title;
        this.activityId = activityId;
        this.fragmentId = fragmentId;
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


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public boolean isHasHeader() {
        return hasHeader;
    }

    public void setHasHeader(boolean hasHeader) {
        this.hasHeader = hasHeader;
    }

    public boolean isContract() {
        return isContract;
    }

    public void setIsContract(boolean isContract) {
        this.isContract = isContract;
    }

    @Override
    public String toString() {
        return "NavigationDrawerItem{" +
                "hasHeader=" + hasHeader +
                ", isContract=" + isContract +
                ", iconId=" + iconId +
                ", title='" + title + '\'' +
                ", activityId=" + activityId +
                ", fragmentId=" + fragmentId +
                '}';
    }
}
