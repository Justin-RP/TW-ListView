package com.myapplicationdev.android.tw_listview;

/**
 * Created by 16022916 on 24/4/2018.
 */

public class Modules {
    private String name;
    private boolean img;

    public Modules(String name, boolean img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isImg() {
        return img;
    }

    public void setImg(boolean img) {
        this.img = img;
    }
}
