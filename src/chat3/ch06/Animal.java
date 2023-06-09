package src.chat3.ch06;

import java.util.ArrayList;

public class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
    public void eating() {

    }
}

class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이는 네 발로 뛉니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal{
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }
    public void flying() {
        System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
    }
}


class AnimalTest {
    public static void main(String[] args) {

        Animal hanimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hanimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(hanimal);
        animalsList.add(tAnimal);
        animalsList.add(eAnimal);

        for(Animal animal : animalsList) {
            animal.move();
        }
    }
    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
