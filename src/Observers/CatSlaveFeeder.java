package Observers;

import java.util.Observable;

public class CatSlaveFeeder extends Observable {

    public void feedCat(int foodAmount) {
        CatFeederMassage massage = new CatFeederMassage();
        massage.setFoodAmount(foodAmount);
        setChanged();
        notifyObservers();


    }
}
