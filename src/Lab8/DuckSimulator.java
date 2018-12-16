package Lab8;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory echoDuckFactory = new EchoDuckFactory();

        simulator.simulate(duckFactory);
        System.out.println();
        simulator.simulate(countingDuckFactory);
        System.out.println();
        simulator.simulate(echoDuckFactory);

    }
    private void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Flock flock1 = new Flock();
        flock1.add(goose);
        flock1.add(mallardDuck);
        flock1.add(redheadDuck);
        flock1.add(rubberDuck);
        flock1.add(pigeon);

        Flock flock2 = new Flock();
        flock2.add(pigeon);
        flock2.add(rubberDuck);
        flock2.add(redheadDuck);
        flock2.add(mallardDuck);
        flock2.add(goose);

        flock2.add(flock1);

        System.out.println("**Lab8.Flock 1**");
        simulate(flock1);
        System.out.println("The ducks quacked " + QuackCounter.getNumberQuacks() + " times.");
        System.out.println();

        System.out.println("**Lab8.Flock 2**");
        simulate(flock2);
        System.out.println("The ducks quacked " + QuackCounter.getNumberQuacks()+ " times.");
        System.out.println();

    }
    private void simulate(Quackable duck){
        duck.quack();

    }


}
