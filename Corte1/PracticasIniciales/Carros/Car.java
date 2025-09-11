
package Carros;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;
    
    public String getcompany_name(){
        return company_name;
    }
    
    public void setcompany_name(String company_name){
        this.company_name= company_name;
        
    }
    
    public String getmodel_name(){
        return model_name;
    }
    
    public void setmodel_name(String model_name){
        this.model_name = model_name;
    }
    
    public int getyear(){
        return year;
        
    }
    
    public void setyear(int year){
        this.year = year;
    }
    
    public double getmileage(){
        return mileage;
    }
}
