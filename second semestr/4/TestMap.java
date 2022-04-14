import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        hashMap<Integer, String> H = new hashMap<Integer, String>(12);
        Integer key;
        Scanner sc = new Scanner(System.in);

        H.add(302, "100");
        H.add(12, "1412");
        H.add(14, "5125");
        H.add(119, "2632");
        H.add(9, "154363");
        H.add(41, "12412");
        H.add(64, "6346");
        H.add(212, "93");
        H.add(42, "124");
        H.add(5, "1634");
        H.add(9, "7548");

        System.out.println("Выводим элементы из таблицы");
        H.print();
        System.out.println("ВВедите ключ для удаления");
        key = (Integer) sc.nextInt();
        System.out.println("Удален " + H.delete_key(key));
        key = null;
        System.out.println("Таблица после удаления ключа");
        H.print();
        System.out.println(H.size);
        System.out.println("Ключ для поиска");
        key = (Integer) sc.nextInt();
        System.out.println(H.search(key));
        H.delete_all();
        System.out.println("Таблица после очистки");
        H.print();
        System.out.println("Число элементов в таблице");
        System.out.println(H.N());
        System.out.println("Уровень загруженности");
        System.out.println(H.load());
        System.out.println("Изменение уровня загруженности");
        System.out.println(H.change_load());

    }
}
