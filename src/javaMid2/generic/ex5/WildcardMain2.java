package javaMid2.generic.ex5;

import javaMid2.generic.animal.Animal;
import javaMid2.generic.animal.Cat;
import javaMid2.generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        
        //Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
        writeBox(animalBox);
//        writeBox(dogBox); // 하한이 Animal
        Animal animal1 = animalBox.get();
        System.out.println("animal1 = " + animal1);
    }

    private static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이",100));
    }
}
