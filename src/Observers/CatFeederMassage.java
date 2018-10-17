package Observers;

public class CatFeederMassage {

    public int foodAmount;

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    @Override
    public String toString() {
        return "CatFeederMassage{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
