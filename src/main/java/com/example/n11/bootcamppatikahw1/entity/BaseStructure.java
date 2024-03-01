package com.example.n11.bootcamppatikahw1.entity;

import lombok.Getter;
import lombok.Setter;


public class BaseStructure {

    int id;
    double price;
    double squareByMeter;
    int roomCount;
    int livingRoomCount;

    public BaseStructure(int id,double price,double squareByMeter,int roomCount,int livingRoomCount){
        this.id = id;
        this.price = price;
        this.squareByMeter = squareByMeter;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }


    public double getSquareMeter() {
        return squareByMeter;
    }

    public double getPrice() {
        return price;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    public int getId(){
        return  id;
    }
}
