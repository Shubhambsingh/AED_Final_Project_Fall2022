/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author ShubhamSingh
 */
public class MealOrgWorkRequest extends WorkRequest{
    
    private int foodReqId;
    private int quantity;
    private String foodType;
    private double totalPrice;
    
    private static int counter = 1;
    

    public MealOrgWorkRequest(String foodType,int quantity) {
        this.quantity = quantity;
        this.foodType = foodType;
        this.foodReqId = counter++;
    }

    public String getMealType() {
        return foodType;
    }

    public void setMealType(String foodType) {
        this.foodType = foodType;
    }

    public int getMealReqId() {
        return foodReqId;
    }

    public void setMealReqId(int foodReqId) {
        this.foodReqId = foodReqId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
