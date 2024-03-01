package com.example.n11.bootcamppatikahw1.service;

import com.example.n11.bootcamppatikahw1.entity.BaseStructure;
import com.example.n11.bootcamppatikahw1.entity.House;
import com.example.n11.bootcamppatikahw1.entity.SummerHouse;
import com.example.n11.bootcamppatikahw1.entity.Villa;

import java.util.List;
import java.util.ArrayList;

public class PropertyService {

    public static List<House> houseList = new ArrayList<>();
    public static List<Villa> villaList = new ArrayList<>();
    public static List<SummerHouse> summerHouseList = new ArrayList<>();

    public static double getTotalHousePrice() {
        double totalHousePrice = 0;
        for (House house : houseList) {
            totalHousePrice += house.getPrice();
        }
        return totalHousePrice;
    }

    public static double getTotalVillaPrice() {
        double totalVillaPrice = 0;
        for (Villa villa : villaList) {
            totalVillaPrice += villa.getPrice();
        }
        return totalVillaPrice;
    }

    public static double getTotalSummerHousePrice() {
        double totalSummerHousePrice = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            totalSummerHousePrice += summerHouse.getPrice();
        }
        return totalSummerHousePrice;
    }

    public static double getTotalPropertyPrice() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
    }

    public static double getAverageHouseSquareMeter() {
        double totalHouseSquareMeter = 0;
        for (House house : houseList) {
            totalHouseSquareMeter += house.getSquareMeter();
        }
        return totalHouseSquareMeter / houseList.size();
    }

    public static double getAverageVillaSquareMeter() {
        double totalVillaSquareMeter = 0;
        for (Villa villa : villaList) {
            totalVillaSquareMeter += villa.getSquareMeter();
        }
        return totalVillaSquareMeter / villaList.size();
    }

    public static double getAverageSummerHouseSquareMeter() {
        double totalSummerHouseSquareMeter = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            totalSummerHouseSquareMeter += summerHouse.getSquareMeter();
        }
        return totalSummerHouseSquareMeter / summerHouseList.size();
    }

    public static double getAveragePropertySquareMeter() {
        return (getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice()) / (houseList.size() + villaList.size() + summerHouseList.size());
    }

    public static List <String> filterHouseByRoomAndLivingRoom(int roomCount, int livingRoomCount) {
        List<String>  filteredPropertyList = new ArrayList<>();
        for (House house: houseList) {
            if (house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount) {
                filteredPropertyList.add("house " + house.getId());
            }
        }
        for (Villa villa: villaList) {
            if (villa.getRoomCount() == roomCount && villa.getLivingRoomCount() == livingRoomCount) {
                filteredPropertyList.add("villa " + villa.getId());
            }
        }
        for (SummerHouse summerHouse: summerHouseList) {
            if (summerHouse.getRoomCount() == roomCount && summerHouse.getLivingRoomCount() == livingRoomCount) {
                filteredPropertyList.add("summer house " + summerHouse.getId());
            }
        }
        return filteredPropertyList;
    }

}
