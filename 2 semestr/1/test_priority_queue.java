import java.util.*;
import java.io.*;

public class test_priority_queue {
    public static void main(String[] args) {
        priority_queue<Integer> c = new priority_queue<>();
        c.add(1);
        c.add(2);
        c.add(5);
        c.add(4);
        c.add(3);
        c.add(7);

        System.out.println("Проверяем очередь на пустоту");
        if (c.check() == true)
            System.out.println("В очереди есть элементы");
        System.out.println("Вытаскиваем максимальный элемент из очереди " + c.delete_element());
        System.out.println("Максимальный элемент: " + c.max());
        System.out.println("Число элементов в очереди: " + c.quantity());
        System.out.println("Вывод очереди: ");
        c.queue();
    }
}
