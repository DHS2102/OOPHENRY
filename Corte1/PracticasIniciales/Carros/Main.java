
package Carros;

public class Main {
    
    public static void main (String[] args){
        //create an instace of car
        Car car = new Car();
        
        //set the values using the setter method
        car.setcompany_name("chevrolet");
        car.setmodel_name("cruze");
        car.setyear(2009);
        
        String company_name = car.getmodel_name();
        String model_name = car.getmodel_name();
        int year = car.getyear();
        double mileage = car.getmileage();
        
        System.out.println("company name: "+company_name);
        System.out.println("model name: "+model_name);
        System.out.println("year: "+ year);
        System.out.println("mileage"+ mileage);
    }
    
    
}
