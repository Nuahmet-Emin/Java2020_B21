package WarmpUps.day38;

public class Pizza {

    public String size;
    public int numOfCheese, numOfPepperoni;
    public double tips;

    public void customizeOrder(String size, int numOfCheese, int numOfPepperoni, double tips){
        this.size = size;
        this.numOfCheese = numOfCheese;
        this.numOfPepperoni = numOfPepperoni;
        this.tips =tips;
    }

    public double calcCost(){
        double costBySize= (size.equalsIgnoreCase("small") )? 10 : (size.equalsIgnoreCase("medium")? 12 : 14);
        return ( costBySize + numOfCheese * 1 + numOfPepperoni * 1.5 + tips);
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numOfCheese=" + numOfCheese +
                ", numOfPepperoni=" + numOfPepperoni +
                ", tips=" + tips +
                "\nTotal cost: $" + calcCost()+
                '}';
    }

}



/*
1. create a custom class for Pizza that should contain the following:
            variables:
                    size (either small, medium, large)
                    number of cheese topping
                    number of pepperoni topping
                    tips
            methods:
                    customizeOrder(): allows user to set the size and toppings of Pizza
                    calcCost(): returns the total cost  as double
                    toString(): get the full information and total cost of Pizza
            Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping

 */
