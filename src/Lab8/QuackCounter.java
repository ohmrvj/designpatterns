package Lab8;

public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static int numberQuacks;

    public QuackCounter(Quackable quackable){
        this.quackable = quackable;
    }


    @Override
    public void quack() {
        quackable.quack();
        numberQuacks++;

    }
    public static int getNumberQuacks(){
        return numberQuacks;
    }
}
