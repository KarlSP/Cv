package com.mobile.zjuroszek.cv.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by zjuroszek on 17.10.15.
 */
public class Form {

    private String form_name;
    private String form_label;
    private Collection<Field> fields = new ArrayList<Field>();

    public Form() {
    }

    public Form(String form_name, String form_label, List<Field> fields) {
        this.form_name = form_name;
        this.form_label = form_label;
        this.fields = fields;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public String getForm_label() {
        return form_label;
    }

    public void setForm_label(String form_label) {
        this.form_label = form_label;
    }

    public Collection<Field> getFieldItems() {
        return fields;
    }

    public void setFieldItems(List<Field> fields) {
        this.fields = fields;
    }
}
