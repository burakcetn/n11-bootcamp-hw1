package com.example.n11.bootcamppatikahw1.entity;

import com.fasterxml.jackson.databind.ser.Serializers;

public class House extends BaseStructure {


    public House(int id,double price,double squareByMeter,int roomCount, int livingRoomCount){
        super(id,price,squareByMeter,roomCount,livingRoomCount);
    }
}
