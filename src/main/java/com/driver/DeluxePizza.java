package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese();
//        this.isCheese = false;
        addExtraToppings();
//        this.isTopping = false;
        //addTakeaway();
       getBill();
    }
}
