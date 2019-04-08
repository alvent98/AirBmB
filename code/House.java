public class House {

    private String city;
    private String street;
    private int number;
    private int area;
    private String floor;
    private String rooms;
    private Money price;
    private int numOfHouses;
    private Money averagePrice;

    House(){}

    House(String city, String street, int number, int area, String floor, String rooms, Money price){
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

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public static int getNumOfHouses() {
        return numOfHouses;
    }

    public static void setNumOfHouses(int numOfHouses) {
        this.numOfHouses = numOfHouses;
    }

    public static Money getAveragePrice() {
        return averagePrice;
    }

    public static void setAveragePrice(Money averagePrice) {
        this.averagePrice = averagePrice;
    }
}
