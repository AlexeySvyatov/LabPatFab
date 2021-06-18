package com.company;
import java.util.ArrayList;
import java.util.List;

abstract class logistic{
    String name;

    public String toString(){
        return "This trasport is " + name;
    }}
abstract class CreaterLogistic{
    public abstract logistic CreaterLogistic();
}
class SeaCreater extends CreaterLogistic{
    public logistic CreaterLogistic(){
        return new Seadeliver();
    }}
class Seadeliver extends logistic{
    public Seadeliver(){
        name = "Sea deliver transport";
    }}
class RoadCreater extends CreaterLogistic{
    public logistic CreaterLogistic(){
        return new Roaddeliver();
    }}
class Roaddeliver extends logistic{
    public Roaddeliver(){
        name = "Road deliver transport";
    }}
class AirCreater extends CreaterLogistic{
    public logistic CreaterLogistic(){
        return new Airdeliver();
    }}
class Airdeliver extends logistic{
    public Airdeliver(){
        name = "Air deliver transport";
    }}
class Main{
    public static void main(String[] args) {
        CreaterLogistic mySeaCreater = new SeaCreater();
        logistic mySea = mySeaCreater.CreaterLogistic();
        System.out.println(mySea);

        CreaterLogistic myRoadCreater = new RoadCreater();
        logistic myRoad = myRoadCreater.CreaterLogistic();
        System.out.println(myRoad);

        CreaterLogistic myAirCreater = new AirCreater();
        logistic myAir = myAirCreater.CreaterLogistic();
        System.out.println(myAir);
    }}
