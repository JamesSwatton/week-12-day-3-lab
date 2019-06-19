package Components;

public class Tyre {

    private String type;
    private int diameter;
    private int price;

    public Tyre(String type, int diameter, int price){
        this.type = type;
        this.diameter = diameter;
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public int getPrice() {
        return this.price;
    }
}
