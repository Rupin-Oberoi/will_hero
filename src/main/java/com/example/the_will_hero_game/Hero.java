package com.example.the_will_hero_game;

import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Hero {
    private ImageView imageView;
    private int pos_x;
    private int pos_y;
    private boolean resurrection_done;
    private Helmet helmetType;
    private ArrayList<Weapon> weapons;
    private Weapon currentWeapon;
    //serial version UID: long

    public Hero(ImageView imageView){
        // a parametrized construtor to continue a

        //y=?
        //x=?
        this.imageView=imageView;
        this.resurrection_done=false;
        this.helmetType=new Mouse();
        this.weapons= new ArrayList<>();

    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public boolean isResurrection_done() {
        return resurrection_done;
    }

    public void setResurrection_done(boolean resurrection_done) {
        this.resurrection_done = resurrection_done;
    }

    public Helmet getHelmetType() {
        return helmetType;
    }

    public void setHelmetType(Helmet helmetType) {
        this.helmetType = helmetType;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void addWeapons(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

}
