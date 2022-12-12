/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.MealandShelterDistributor;


import java.util.ArrayList;

/**
 *
 * @author ShubhamSingh
 */
public class MealDirectory {
    private ArrayList<Meal> foodList;

    public MealDirectory() {
        foodList = new ArrayList<>();
    }

    public ArrayList<Meal> getMealList() {
        return foodList;
    }

    public void setMealList(ArrayList<Meal> foodList) {
        this.foodList = foodList;
    }
    
        public Meal addMealType() {
        Meal food = new Meal();
        foodList.add(food);
        return food;
    }
    
    //Removing a MealType from the Directory
    public void removeMealType(Meal food) {
        foodList.remove(food);
    }
}
