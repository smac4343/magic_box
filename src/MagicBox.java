import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private int size;
    private int index = 0;
    private Random random = new Random();

    @SuppressWarnings("unchecked")
    public MagicBox(int size) {
        this.size = size;
        this.items = (T[]) new Object[size]; // создаем массив нужного размера
    }

    public boolean add(T item) {
        if (index < size) {
            items[index++] = item; // добавляем элемент и увеличиваем индекс
            return true;
        } else {
            return false; // коробка полна, добавление невозможно
        }
    }

    public T pick() {
        if (index < size) {
            throw new RuntimeException("Коробка не полна. Осталось " + (size - index) + " ячеек заполнить.");
        } else {
            return items[random.nextInt(size)]; // возвращаем случайный элемент
        }
    }
}