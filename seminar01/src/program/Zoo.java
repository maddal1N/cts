package program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zookeeper zookeeper;
    private List<Animal> animals;

    public Zoo() {
        this.zookeeper = new Zookeeper("Gigel");
        this.animals = new ArrayList<>();
    }

    public Zoo(Zookeeper zookeeper, List<Animal> animals) {
        this.zookeeper = zookeeper;
        this.animals = animals;
    }

    public void Add(Animal animal){
        this.animals.add(animal);
    }

    public void feedAllAnimals(){
        for(Animal animal : animals){
            zookeeper.feed(animal);
        }
    }

}
