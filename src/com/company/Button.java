package com.company;

public class Button {

    private String description;
    private int height;
    private int width;
    private int x;
    private int y;

    public Button(String description, int height, int width, int x, int y) {
        this.description = description;
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public Button(String description) {
        this.description = description;
    }

    public Button(String description, int width, int x, int y) {
        this.description = description;
        this.width = width;
        this.x = x;
        this.y = y;
        this.height = width;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public static void main(String[] args) {

    }
}
