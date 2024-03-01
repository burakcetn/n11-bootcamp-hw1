package com.example.n11.bootcamppatikahw1;

import com.example.n11.bootcamppatikahw1.entity.House;
import com.example.n11.bootcamppatikahw1.entity.SummerHouse;
import com.example.n11.bootcamppatikahw1.entity.Villa;
import com.example.n11.bootcamppatikahw1.service.PropertyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampPatikaHw1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootcampPatikaHw1Application.class, args);


		House house1 = new House(1,100000,105,3,1);
		House house2 = new House(2,200000,75,1,1);
		House house3 = new House(3,3500000,250,8,2);

		PropertyService.houseList.add(house1);
		PropertyService.houseList.add(house2);
		PropertyService.houseList.add(house3);

		SummerHouse summerHouse1 = new SummerHouse(1,100000000,95,2,1);
		SummerHouse summerHouse2 = new SummerHouse(2,500000000,505,8,3);
		SummerHouse summerHouse3 = new SummerHouse(3,200000000,155,3,1);

		PropertyService.summerHouseList.add(summerHouse1);
		PropertyService.summerHouseList.add(summerHouse2);
		PropertyService.summerHouseList.add(summerHouse3);

		Villa villa1 = new Villa(1,300000000,155,4,2);
		Villa villa2 = new Villa(2,100000000,85,2,2);
		Villa villa3 = new Villa(3,500000000,250,6,2);

		PropertyService.villaList.add(villa1);
		PropertyService.villaList.add(villa2);
		PropertyService.villaList.add(villa3);


		System.out.println("Total House price   : " + PropertyService.getTotalHousePrice());
		System.out.println("Total SummerHouse price   : " + PropertyService.getTotalSummerHousePrice());
		System.out.println("Total villa price   : " + PropertyService.getTotalVillaPrice());
		System.out.println("Total price   : " + PropertyService.getTotalPropertyPrice());

		System.out.println("|---------------------------------|");

		System.out.println("Average House squareByMeter   : " + PropertyService.getAverageHouseSquareMeter());
		System.out.println("Average summerhouse squareByMeter   : " + PropertyService.getAverageSummerHouseSquareMeter());
		System.out.println("Average villa squareByMeter   : " + PropertyService.getAverageVillaSquareMeter());
		System.out.println("Total average squarebymeter   : " + PropertyService.getAveragePropertySquareMeter());

		System.out.println("|---------------------------------|");

		System.out.println("Filtered Structure by room and living room   : " + PropertyService.filterHouseByRoomAndLivingRoom(3,1));




	}

}
