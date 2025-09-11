
package Carros;

public class Main {
    
    public static void main (String[] args){
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        
        car1.setcompany_name("chevrolet");
        car1.setmodel_name("cruze");
        car1.setyear(2009);
        car1.setmileage(10000);
        
        car2.setcompany_name("Ferrari");
        car2.setmodel_name("Laferrari");
        car2.setyear(2021);
        car2.setmileage(1000); 
        
        car3.setcompany_name("porche");
        car3.setmodel_name("911");
        car3.setyear(2022);
        car3.setmileage(1200); 
       
            
        System.out.println("company name: "+ car1.getcompany_name());
        System.out.println("model name: "+ car1.getmodel_name());
        System.out.println("year: "+ car1.getyear());
        System.out.println("mileage"+ car1.getmileage());
        
         System.out.println("company name: "+ car2.getcompany_name());
        System.out.println("model name: "+ car2.getmodel_name());
        System.out.println("year: "+ car2.getyear());
        System.out.println("mileage"+ car2.getmileage()); 
        
        System.out.println("company name: "+ car3.getcompany_name());
        System.out.println("model name: "+ car3.getmodel_name());
        System.out.println("year: "+ car3.getyear());
        System.out.println("mileage"+ car3.getmileage());       
    } 
}
