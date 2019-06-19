package Components;

public class PetrolEngine extends Engine {

    private double size;

    public PetrolEngine(int price, double size){
        super("Petrol", price);
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }

    public String rev(){
        return "VROOM VROOM";
    }
}
