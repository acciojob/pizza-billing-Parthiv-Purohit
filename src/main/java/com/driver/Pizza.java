package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill  = "";

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price = 300;
            bill = bill + "Base Price Of The Pizza: 300" + "\n";
        }
        else
        {
            this.price = 400;
            bill = bill + "Base Price Of The Pizza: 400" + "\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price = this.price + 80;
        bill = bill + "Extra Cheese Added = 80"+ "\n";

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            this.price = this.price + 70;
            bill = bill + "Extra Toppings Added = 70" + "\n";
        }
        else
        {
            this.price = this.price + 120;
            bill = bill + "Extra Toppings Added = 70" + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price  =this.price + 20;
        bill = bill + "Paperbag Added: 20" + "\n";
    }

    public String getBill(){
        // your code goes here
        bill = bill + "Total Price: " + this.price +"\n";
        return this.bill;
    }
}

