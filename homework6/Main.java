package homework6;

import homework6.animals.*;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat", "Timon", 200, 0);
        Dog dog1 = new Dog("dog","Pumba", 500, 10);
        Cat cat2 = new Cat("cat", "Cot", 100, 0);

        cat1.animalInfo();
        dog1.animalInfo();
        cat2.animalInfo();

//        Animal[] animal = {
//                new Cat("cat", "Timon", "200", 0),
//                new Dog("dog", "Pumba", "500", 10),
//                new Cat("cat", "Cot", 100, 0)
//        };
    }

}