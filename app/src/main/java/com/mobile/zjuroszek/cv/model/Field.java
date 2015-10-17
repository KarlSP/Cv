package com.mobile.zjuroszek.cv.model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zjuroszek on 17.10.15.
 */


public class Field {

    private String type;

    private String name;

    private String label;

    private String required;

    private String maxLen;

    private String regex;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getMaxLen() {
        return maxLen;
    }

    public void setMaxLen(String maxLen) {
        this.maxLen = maxLen;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public String toString() {
        return "Field{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", required='" + required + '\'' +
                ", maxLen='" + maxLen + '\'' +
                ", regex='" + regex + '\'' +
                '}';
    }
}
