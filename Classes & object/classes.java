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
