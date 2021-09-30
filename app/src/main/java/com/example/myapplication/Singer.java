package com.example.animation_shareelement_recyclerview;

public class Singer {
    private String txtName;
    private String txtSinger;
    private int imgHinh;

    public Singer() {
    }

    public Singer(String txtName, String txtSinger, int imgHinh) {
        this.txtName = txtName;
        this.txtSinger = txtSinger;
        this.imgHinh = imgHinh;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtSinger() {
        return txtSinger;
    }

    public void setTxtSinger(String txtSinger) {
        this.txtSinger = txtSinger;
    }

    public int getImgHinh() {
        return imgHinh;
    }

    public void setImgHinh(int imgHinh) {
        this.imgHinh = imgHinh;
    }
}
