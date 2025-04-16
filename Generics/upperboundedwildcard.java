

import java.util.ArrayList;
import java.util.List;

class animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class cat extends animal{
    void eat(){
        System.out.println("cat Eats");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("dog Eats");
    }
}

class rat{
    void eat(){
        System.out.println("rat Eats");
    }
}

public class upperboundedwildcard {
    public static void feed(List<? extends animal> list){
        for(animal i : list){
            i.eat();//its calling the numerous obkject which are stored into the (lsit) by using for each loop.
        }
    }

    public static void feedlower(List<? super cat> list){
        for(Object i : list){
            ((animal)i).eat();//its calling the numerous obkject which are stored into the (lsit) by using for each loop.
        }
    }

    public static void main(String[] args) {
        ArrayList<animal> animal = new ArrayList<>();
        animal.add(new animal());
        animal.add(new animal());
        animal.add(new animal());

        ArrayList<dog> dog = new ArrayList<>();
        animal.add(new dog());
        animal.add(new dog());
        animal.add(new dog());

        ArrayList<cat> cat = new ArrayList<>();
        animal.add(new cat());
        animal.add(new cat());
        animal.add(new cat());

        feed(animal);
        feed(cat);
        feed(dog);
        feedlower(cat);
        // feedlower(dog);
        feedlower(animal);
    }
}
