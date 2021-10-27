public class Main {
    public static void main(String[] args) {
        Integer[] ints = { 1, 2, 3, 4, 5, 6 };
        Swapper<Integer> intSwapper = new Swapper<>();
        intSwapper.swap(ints, 1, 3);
        for (Integer i: ints) {
            System.out.print(i + " ");
        }
        System.out.println();

        Float[] floats = { 1.f, 2.f, 3.f, 4.f, 5.f, 6.f };
        Swapper<Float> floatSwapper = new Swapper<>();
        floatSwapper.swap(floats, 1, 3);
        for (Float i: floats) {
            System.out.print(i + " ");
        }
        System.out.println();

        Box<Apple> appleBox = new Box<>();
        Box<Apple> newAppleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> newOrangeBox = new Box<>();

        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple();
            appleBox.addFruitToBox(apple);
        }

        for (int i = 0; i < 30; i++) {
            Orange orange = new Orange();
            orangeBox.addFruitToBox(orange);
        }

        for (int i = 0; i < 5; i++) {
            Orange orange = new Orange();
            newOrangeBox.addFruitToBox(orange);
        }

        System.out.println("Масса коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Масса коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Массы коробок равны: " + appleBox.compare(orangeBox));

        System.out.println("В первой коробке: " + appleBox.fruits.size() + " яблок, а во второй : " +  newAppleBox.fruits.size());
        appleBox.transfer(newAppleBox);
        System.out.println("В первой коробке: " + appleBox.fruits.size() + " яблок, а во второй : " +  newAppleBox.fruits.size());

        System.out.println("В первой коробке: " + orangeBox.fruits.size() + " апельсинов, а во второй : " +  newOrangeBox.fruits.size());
        orangeBox.transfer(newOrangeBox);
        System.out.println("В первой коробке: " + orangeBox.fruits.size() + " апельсинов, а во второй : " +  newOrangeBox.fruits.size());
    }
}
