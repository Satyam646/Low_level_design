public class car{
   
    private String brand;
    private String model;
    private String speed;

    public car(String brand, String model,String speed){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getSpeed(){
        return speed;
    }
}
public main class Main {

    public static void main(String[] args){
        car car1 = new car("BMW","X5","200km/h");
        car car2 = new car("Audi","A6","250km/h");
        System.out.println(car1.getBrand()+" "+car1.getModel()+" "+car1.getSpeed());
        System.out.println(car2.getBrand()+" "+car2.getModel()+" "+car2.getSpeed());
    }

}