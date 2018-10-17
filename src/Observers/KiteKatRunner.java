package Observers;

import java.util.ArrayDeque;

import java.util.Queue;

public class KiteKatRunner {

    public static void main(String [] args) {

        Queue<HouseCat> catGang = new ArrayDeque<>();

        catGang.add(new HouseCat("Chubas"));
        catGang.add(new HouseCat("Gash"));
        catGang.add(new HouseCat("Shikardos"));

        CatSlaveFeeder miserableHuman = new CatSlaveFeeder();
            for(HouseCat cat : catGang) {
                miserableHuman.addObserver(cat);
            }

            System.out.println("Cat party in progress ... " + "\n");
            miserableHuman.feedCat(10);

    }
}
