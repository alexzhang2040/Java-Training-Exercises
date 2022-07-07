public class Abstraction {
    public static void main(String[] args) {
        T_Shirt alex1 = new T_Shirt("Grey", "Medium", 12.59);
        Jacket alex2 = new Jacket("Black", "Medium", 30.0, "Team Optix");

        System.out.println(alex1.get_description());
        System.out.println(alex2.get_description());
    }
}
abstract class Shirt{
    public String color;
    
    public Shirt(String color){
        this.color = color;
    }
    
    public String get_color() {
        return this.color;
    }
    abstract String get_description();
}
class T_Shirt extends Shirt {
    public String size;
    public double price;

    public T_Shirt(String color, String size, double price){
        super(color);
        this.size = size;
        this.price = price;
    }

    @Override
    public String get_description() {
        return "This is a " + super.get_color() + ", " + this.size + " T-Shirt that costs " + this.price + ".";
    }
}
class Jacket extends Shirt {
    public double price;
    public String brand;
    private String size;

    public Jacket(String color, String size, double price, String brand){
        super(color);
        this.price = price;
        this.color = color;
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String get_description() {
        return "This is a " + this.color + ", " + this.size + " Jacket that costs " + this.price + " from " + this.brand + ".";
    }
}