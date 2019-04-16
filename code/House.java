import java.util.*;

public class House {

    private String city;
    private String street;
    private int number;
    private int area;
    private String floor;
    private String rooms;
    private double price;
    private static int numOfHouses;
    private static double averagePrice;
    private static ArrayList<House> listHouses = new ArrayList<>();



    House(){}

    House(String city, String street, int number, int area, String floor, String rooms, double price){
        this.city=city;
        this.street=street;
        this.number=number;
        this.area=area;
        this.floor=floor;
        this.rooms=rooms;
        this.price=price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*  public void setPrice(double price) {
       Money tmp=new Money(price);
       this.price = (double) Money.getMoney();
    }*/

    public int getNumOfHouses() {
        return listHouses.size();
    }

    public static double getAveragePrice() {
        if (listHouses.size() == 0){
            System.out.println("There are no registered houses yet.");
            return 0;
        } //controller

        double sum = 0;

        for(House h : listHouses){
            sum += h.getPrice();
        }

        averagePrice= sum/listHouses.size();
        return averagePrice;
    }



}
