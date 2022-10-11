package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraToppings;
    private int extraCheese;
    private int takeAway;
    private boolean isTakeAway;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private  boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheese=80;
        this.isCheeseAdded=false;
        this.isTakeAway=false;
        this.isToppingAdded=false;
        this.isBillGenerated=false;
        this.takeAway=20;
        if(isVeg)
        {
            this.price=300;
            this.extraToppings=70;

        }
        else {
            this.price=400;
            this.extraToppings=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!isCheeseAdded){
            this.price=this.price+extraCheese;
            isCheeseAdded=true;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded)
        {
            this.price=this.price+extraToppings;
            isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price=this.price+takeAway;
            isTakeAway=true;

        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            isBillGenerated=true;
            if(isCheeseAdded){
                this.bill=this.bill+"Extra Cheese Added: "+this.extraCheese+"\n";
            }
            if(isToppingAdded){
                this.bill=this.bill+"Extra Toppings Added: "+this.extraToppings+"\n";
            }
            if(isTakeAway){
                this.bill=this.bill+"Paperbag Added: "+this.takeAway+"\n";
            }
        }

        this.bill=this.bill+"Total Price: "+this.price+"\n";
        return this.bill;
    }
}
