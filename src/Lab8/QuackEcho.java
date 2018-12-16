package Lab8;

public class QuackEcho implements Quackable {
    protected Quackable quackable;

    public QuackEcho(Quackable quackable){
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.println("Echo: ");
        quackable.quack();

    }
}
