import java.util.Random;

public class MagicBox<T> {

    T[] items;
    protected int sizeMagicBox;

    protected MagicBox(int sizeMagicBox) {
        this.sizeMagicBox = sizeMagicBox;
        this.items = (T[]) new Object[sizeMagicBox];
    }

    boolean add(T item) {


        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }

        }
        return false;
    }

    public T pick() {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                int x = items.length - i;
                throw new RuntimeException("Коробка неполная! Нужно добавить " + x + " объектов");
            }

        }
        Random random = new Random();
        int randomInt = random.nextInt(sizeMagicBox + 1);

        return items[randomInt];
    }
}


