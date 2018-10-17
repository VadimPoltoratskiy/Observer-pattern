package Observers;

import java.util.Observable;
import java.util.Observer;

public class HouseCat implements Observer {

    private String name;

    @Override
    public void update(Observable observable, Object message) {

        if(message != null /*&& message instanceof CatFeederMassage*/ ){
            CatFeederMassage catFeederMassage = (CatFeederMassage) message;
            System.out.println( getName() +" " + "got fed " + catFeederMassage.getFoodAmount());
        }


    }

    public HouseCat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HouseCat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

