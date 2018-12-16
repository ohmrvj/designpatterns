package Lab8;

import java.util.ArrayList;

public class Flock implements Quackable {
    private ArrayList<Quackable> quackables = new ArrayList<>();

    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        for (int i = 0; i < quackables.size() ; i++) {
            if (i == 0){
                quackables.get(i).quack();
                quackables.get(i).quack();

            }
            quackables.get(i).quack();

        }

    }
}
