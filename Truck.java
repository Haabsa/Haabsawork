//question B
public class Truck extends Car{
    
    private int weight;


    public Truck (int speed,double regularprice,String color, int weight) {
        super(speed,regularprice,color);
        this.weight = weight;
}
public  double getSalePrice() {
    if  (weight > 2000){
        return super.getSalePrice() - (0.1 * super.getSalePrice());
    }
    else {
        return super.getSalePrice()-(0.2 * super.getSalePrice());;
       }
  }
}
