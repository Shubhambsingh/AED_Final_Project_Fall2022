/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.HelpingHands.Meal;

import Model.MealandShelterDistributor.Meal;
import java.util.ArrayList;

/**
 *
 * @author ShubhamSingh
 */
public class MealInventory extends Meal {
    
    private ArrayList<Meal> foodInventory;

    public MealInventory() {
        foodInventory = new ArrayList<>();
    }

    public ArrayList<Meal> getMealInventory() {
        return foodInventory;
    }

    public void setMealInventory(ArrayList<Meal> foodInventory) {
        this.foodInventory = foodInventory;
    }
    
    public Meal addMeal() {
        Meal food = new Meal();
        foodInventory.add(food);
        return food;
    }
    
    //Removing a MealType from the Directory
    public void removeMeal(Meal food) {
        foodInventory.remove(food);
    }
    
}
