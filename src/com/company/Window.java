package com.company;

import java.util.ArrayList;
import java.util.List;

public class Window {

    private int height;
    private int width;
    private String title;
    private List<String> options = new ArrayList<>();


    public Window(int height, int width, String title) {
        this.height = height;
        this.width = width;
        this.title = title;
    }
    public Window(String title) {
        this.title = title;
    }
    public Window(String title, List<String> options) {
        this.title = title;
        this.options = options;
    }




    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }



    public static void main(String[] args) {

    }
}