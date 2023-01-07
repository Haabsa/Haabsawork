//quwstion E
public class MyOwnAutoShop{
    

    public Static void main(String[]args){ 

        Sedan sedan1 = new Sedan(112, 300000, "Cyan", 40);
        Ford ford1 = new Ford(123,3333.0,"Blue",2022, 30);
        Ford ford2 = new Ford(120,8000.0,"Grey",2020, 9);
        Car car2 = new Car(252, 56345.0,"Yellow");
        System.out.println("Sedan Price "+sedan1.getSalePrice());
        System.out.println("Ford1 Price "+ford1.getSalePrice());
        System.out.println("Ford2 Price "+ford2.getSalePrice());
        System.out.println("Car Price "+car2.getSalePrice());
    }
}
