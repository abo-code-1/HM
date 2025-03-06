package lecture_package.Lecture4;

import java.util.ArrayList;

public class HW_from_Lecture_4_1 {
    public static void main(String[] args) {

        ArrayList<Food> foods = new ArrayList<>();
        Chocolate snickers = new Chocolate("Snickers", 232);
        Chocolate twix = new Chocolate("Twix", 232);
        Burger burger_king = new Burger("Burger King", 1, 2);
        Burger mcDonalds = new Burger("McDonalds", 1, 1);
        Coke cocaCola = new Coke("Coca Cola", 2, true);
        Coke fuseTea = new Coke("Fuse Tea", 2, false);

        foods.add(snickers);
        foods.add(twix);
        foods.add(burger_king);
        foods.add(mcDonalds);
        foods.add(cocaCola);
        foods.add(fuseTea);


        Food maxCalorieFood = foods.get(0);
        double maxCalories = maxCalorieFood.getCalories();
        System.out.println("Список продуктов с калорийностью:");
        for (Food food : foods) {
            double calories = food.getCalories();
            System.out.println(food.name + ": " + calories + " ккал");

            if (calories > maxCalories) {
                maxCalories = calories;
                maxCalorieFood = food;
            }
        }
    }
}


abstract class Food{
    String name;
    public Food(String name) {
        this.name = name;
    }
    public abstract double getCalories();

}


class Chocolate extends Food{
    double weight;

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public double getCalories() {
        return (weight * 740);
    }

}

class Burger extends Food {
    double meatAmount;
    int meatType;

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }


    @Override
    public double getCalories() {
        if (meatType == 1) {
            return meatAmount * 840;
        } else if (meatType == 2) {
            return meatAmount * 560;
        }
        return 0;
    }
}


class Coke extends Food {
    double volumeLiters;
    boolean isSparkling;

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }


    @Override
    public double getCalories() {
        if (isSparkling) {
            return (volumeLiters * 400);
        } else {
            return (volumeLiters * 100);
        }
    }
}
