import java.util.Scanner;

public class test_avl {
    public static void main(String[] args) throws Exception {
        int key;
        boolean A;
        Scanner in = new Scanner(System.in);
        avl<String> tree = new avl<String>();
        avl<String> tree1 = new avl<String>();

        System.out.println("Добавляем элементы в дерево");
        for (int i = 0; i < 10000; i++)
            tree.root = tree.insert(tree.root, i, "user");
        System.out.println("Наше дерево");
        tree.print();

        System.out.println("Удаляем элементы");
        for (int i = 0; i < 5000; i++)
            tree.root = tree.remove(tree.root, i);

        System.out.println("Дерево после удаления");
        tree.print();

        System.out.println("Поиск элемента по ключу и получение элемента");
        key = in.nextInt();
        System.out.println(tree.search(tree.root, key));

        System.out.println("Поиск элемента по ключу");
        key = in.nextInt();
        System.out.println(tree.search_key(tree.root, key));

        System.out.println("Проверка на пустоту");
        A = tree.check(tree.root);
        if (A)
            System.out.println("В дереве присутствуют элементы");
        else
            System.out.println("Дерево пусто");

        System.out.println("Копирование дерева");
        tree1 = tree.copyTree(tree.root);
        tree1.print();

        System.out.println("Добавление элемента в новое дерево");
        tree1.root = tree1.insert(tree.root, 100, "user");
        tree1.root = tree1.insert(tree1.root, 101, "user");
        tree1.print();

        System.out.println("Удаление всех элементов дерева");
        tree.delete_all();

        System.out.println("Вывод дерева через итераторы");
        itr a = new itr(tree1.root);
        while (a.hasNext()) {
            System.out.println(a.next_element());

        }

        System.out.println("Проверка на сбалансированность дерева");
        Height height = new Height();
        if (tree1.Balanced(tree1.root, height))
            System.out.println("Дерево сбалансировано");
        else
            System.out.println("Дерево не сбалансировано");

    }
}
