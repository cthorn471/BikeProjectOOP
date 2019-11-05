package io.github.profvanselow;

import java.util.ArrayList;
import java.util.Random;

public class BikeDriver {

  public static void main(String[] args) {

    ArrayList<Bike> bikes = new ArrayList();
    fillArray(bikes);
    int mountainBikeSales = 0;
    int roadBikeSales = 0;

    displayBikeNumbers(bikes);
    displayStock(bikes);



  }//end method main

    public static void displayStock(ArrayList<Bike> bikes){
      //enhanced for loop to go through bikes list
      for(Bike bike : bikes) {
          //System.out.println(bike.toString());
      }
    }
    public static int calculateStock(ArrayList<Bike> bikes){
      int bikesSold = 0;
        for(Bike bike : bikes) {
            if(bike instanceof MountainBike){
                //adds 1 to bikes sold a COOL WAY
                bikesSold -= -1;

            }
        }
      return bikesSold;

        }
    public static int displayBikeNumbers(ArrayList<Bike> bikes){
      int mb = calculateStock(bikes);
      int rb = bikes.size() - mb;
        System.out.println("stock levels");
        System.out.println("We have "+ mb +" Mountain bikes in stock");
        System.out.println("we have "+ rb +" Road bikes in stock");
        return mb;
    }
  public static void fillArray(ArrayList<Bike> bikes){
    Random rand = new Random();
    rand.nextInt(2);
    for (int bike = 0; bike <= 10; bike++){
    if (rand.nextInt(2)< 1 ){
      bikes.add(new MountainBike());
    }
    else {
      bikes.add(new RoadBike());
      }
     // System.out.println(bike);
    //System.out.println(bikes);

    }
  }
}//end class BikeDriver
