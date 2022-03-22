package com.example.myapplication;

public class Item_entity {
    private String name;
    private String comment;
    private double gia;
    private int img;

    public Item_entity(String name, String comment, double gia, int img) {
        this.name = name;
        this.comment = comment;
        this.gia = gia;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
