public class Pizza {
    private int Price;
    private boolean veg;

    private int addExtraCheesePrice = 100;

    private int addExtraToppingsPrice = 150;

    private int takeAwayPrice = 50;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeaway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.Price = 300;
        }else{
            this.Price = 500;
        }
        basePizzaPrice = this.Price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
//        System.out.println("Extra Cheese Added");
        this.Price += this.addExtraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
//        System.out.println("Extra Toppings Added");
        this.Price += this.addExtraToppingsPrice;
    }

    public void takeAway(){
        isTakeaway = true;
//        System.out.println("Item is ready to Take Away");
        this.Price += this.takeAwayPrice;
    }

    public void getBill(){
        String Bill = "";
        System.out.println("Pizza :" + " " + basePizzaPrice + "\n");
        if(isExtraCheeseAdded){
            Bill += "Extra Cheese Added : " + addExtraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded){
            Bill += "Extra Toppings Added : " + addExtraToppingsPrice + "\n";
        }
        if (isTakeaway){
            Bill += "Order is Takeaway : : " + takeAwayPrice + "\n";
        }
        Bill += "Bill :" + this.Price + "\n";
        System.out.println(Bill);
    }
}
