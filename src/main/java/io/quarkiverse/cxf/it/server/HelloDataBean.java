package io.quarkiverse.cxf.it.server;

import java.util.Date;
import java.util.List;

public class HelloDataBean {
    private String text;
    private Date date;
    private List<String> list;
    private CustomObject customObject;
    private List<CustomObject> customObjectList;

    // Getters and Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public CustomObject getCustomObject() {
        return customObject;
    }

    public void setCustomObject(CustomObject customObject) {
        this.customObject = customObject;
    }

    public List<CustomObject> getCustomObjectList() {
        return customObjectList;
    }

    public void setCustomObjectList(List<CustomObject> customObjectList) {
        this.customObjectList = customObjectList;
    }

    @Override
    public String toString() {
        return "HelloDataBean{" +
                "text='" + text + '\'' +
                ", date=" + date +
                ", list=" + list +
                ", customObject=" + customObject +
                ", customObjectList=" + customObjectList +
                '}';
    }
}
