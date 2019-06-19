package Components;

public abstract class Engine {

    private String type;
    private int price;

    public Engine(String type, int price){
        this.type = type;
        this.price = price;
    }

    public String getType(){
        return this.type;
    }

    public int getPrice(){
        return this.price;
    }
}
