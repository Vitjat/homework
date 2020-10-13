package homework6.animals;

import java.util.Random;

public class Animal {
    protected String name;
    protected String type;
    protected int run;
    protected int swim;


    protected int randomSwim;
    protected int randomRun;
    public Random random = new Random();

    public Animal() {
    }

    public Animal (String type, String name, int run, int swim) {
        this.type = type;
        this.name = name;
        this.run = run;
        this.swim = swim;
    }


//    /** вывод рандомных значений в пределах соответствующих заданию*/
//    public void animalInfo() {
//        System.out.println(this.type + " " + this.name + " Run: " + this.randomRun + " m., Swim: " + this.randomSwim);
//    }


    public void animalInfo(){
        System.out.printf("type %s, name %s. %s run %d m., swim %d m.\n", type, name, name, run, swim);
    }

}
