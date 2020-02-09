package com.mattaparty.s;
import java.util.ArrayList;
public class task{
	public class allSweets{
	double weight;
	double price;
	public allSweets() {
		super();}
	public allSweets(double weight,double price) {
		super();
		this.weight=weight;
		this.price=price;}
	public double getWeight() {
		return weight;
	}
	public double getPrice() {
		return price;
	}
	public allSweets setWeight(double weight) {
		this.weight=weight;
		return this;
	}
	public allSweets setPrice(double price) {
		this.price=price;
		return this;
	}
}

	public class NewYearGift{
	    String name;
	    double weight;
	    ArrayList<allSweets> newyeargift;
	    NewYearGift(){
	        newyeargift = new ArrayList<allSweets>();
	    }
	    NewYearGift(String name, allSweets...components){
	        this.name=name;
	        newyeargift=new ArrayList<allSweets>();
	        for (allSweets s : components){
	            this.newyeargift.add(s);
	        }
	    }
	    String getName(){return name;}

	    public NewYearGift setName(String name){
	        this.name=name;
	        return this;
	    }
	    public NewYearGift setComponent(allSweets s){
	        this.newyeargift.add(s);
	        return this;
	    }

	    void getWeight(double weight){
	        this.weight+=weight;
	    }

	    double getWeight(){
	        for (allSweets w:newyeargift){
	            weight+=w.getWeight();
	        }
	        return weight;
	    }
	    public String toString(){
	        final StringBuilder sb = new StringBuilder("New Years Gift created with");
	   
	        sb.append(" weight ").append(getWeight());
	        return sb.toString();
	    }
	}
	class GulabJamun extends allSweets{
	    GulabJamun(){
	    }

	    GulabJamun(double weight,double price){
	        super(weight,price);
	    }
	    
	}
	class Lollipop extends allSweets{
	    Lollipop(){
	    }

	    Lollipop(double weight,double price){
	        super(weight,price);
	    }
	    
	}
	class Candies extends allSweets{
	    Candies(){}
	    Candies(double weight,double price){
	    	super(weight,price);
	    }
	        
	    }
class Chocolate extends allSweets{
	    Chocolate(){
	    }
	    Chocolate(double weight, double price){
	    	super(weight,price);
	    }
	       
	    }
	class SoanPapdi extends allSweets{
	    SoanPapdi(){
	    }

	    SoanPapdi(double weight,double price){
	        super(weight,price);
	    }
	    
	}
	class Kajukatli extends allSweets{
		Kajukatli(){
	    }

		Kajukatli(double weight,double price){
	        super(weight,price);
	    }
	    
	}
	
	
   
}