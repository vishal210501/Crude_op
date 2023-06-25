package com.bean;
import java.util.Arrays;
public class Bookinfo {
	private  int id;
	 private String name;
      private  int bprice;

	public void setId(int id) {
		this.id = id;

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setPrice(int price) {
		this.bprice = price;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public int getBPrice() {
		return bprice;
	}

	

       
      public String toString() {
  	  return id+" "+name+" "+bprice;
   	  
     }
    	   
    	   
       }



