public class Main {
    public static void main(String[] args) {
        MagicBox<String> box = new MagicBox<>(5);
        box.add("Apple");
        box.add("Orange");
        box.add("Banana");
        box.add("Pear");
        box.add("Mango");

        System.out.println(box.pick());
        System.out.println(box.pick());
    }
}