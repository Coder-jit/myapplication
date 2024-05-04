package com.example.myapplication2.Model;

public class Model {
    private String name;
    private boolean ischecked;

    public Model() {
    }

    public Model(String name, boolean ischecked) {
        this.name = name;
        this.ischecked = ischecked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIschecked() {
        return ischecked;
    }

    public void setIschecked(boolean ischecked) {
        this.ischecked = ischecked;
    }
}
