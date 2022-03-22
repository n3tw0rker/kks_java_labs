import java.util.ArrayList;

public class priority_queue<T extends Comparable<T>> {
    ArrayList<T> mas;
    int currentcount = 0;

    int parent(int i) {
        return (i - 1) / 2;
    }

    int leftChild(int i) {
        return 2 * i + 1;
    }

    int rightChild(int i) {
        return 2 * i + 2;
    }

    priority_queue() {
        mas = new ArrayList<T>();
    }

    public void add(T value) { // Метода добавления элемента в очередь
        mas.add(value);
        currentcount++;
        up(currentcount - 1);
    }

    private void up(int i) {
        while (i != 0 && ((mas.get(i).compareTo(mas.get(parent(i))) > 1) | (mas.get(i).compareTo(mas.get(parent(i))) == 1))) {
            T tmp = mas.get(i);
            mas.set(i, mas.get(parent(i)));
            mas.set(parent(i), tmp);
            i = parent(i);
        }
    }

    private void down(int i) {
        while (i < currentcount / 2) {
            int maxI = leftChild(i);
            if (rightChild(i) < currentcount && ((mas.get(rightChild(i)).compareTo(mas.get(leftChild(i))) > 1) | (mas.get(rightChild(i)).compareTo(mas.get(leftChild(i))) == 1)))
                maxI = rightChild(i);

            if ((mas.get(i).compareTo(mas.get(maxI)) > 1) | (mas.get(i).compareTo(mas.get(maxI)) == 1) | (mas.get(i).compareTo(mas.get(maxI)) == 0))
                return;
            T tmp = mas.get(i);
            mas.set(i, mas.get(maxI));
            mas.set(maxI, tmp);
            i = maxI;
        }
    }

    public T delete_element() { // метод удаления элемента из очереди
        if (currentcount == 0)
            throw new IllegalArgumentException("В очереди нет элементов");
        T tm;
        tm = (T) mas.get(0);
        mas.set(0, mas.get(--currentcount));
        down(0);
        return tm;
    }

    public boolean check() { // Проверка очереди на пустоту
        if (currentcount == 0)
            throw new IllegalArgumentException("В очереди нет элементов");
        return true;
    }

    public T max() { // Вывод максимального элемента
        return mas.get(0);
    }

    public int quantity() { // Число элементов в очереди
        return currentcount;

    }

    public void queue() { // Вывод очереди
        for (int i = 0; i < currentcount; i++)
            System.out.println(mas.get(i));
    }
}
