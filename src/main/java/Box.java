import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<T>();
    }

    public void addFruitToBox(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        return fruits.get(0).getWeight() * fruits.size();
    }

    public boolean compare(Box otherBox) {
        return getWeight() == otherBox.getWeight();
    }

    public void transfer(Box<T> otherBox) {
        for(T fruit : fruits) {
            otherBox.addFruitToBox(fruit);
        }
        fruits.clear();
    }
}
