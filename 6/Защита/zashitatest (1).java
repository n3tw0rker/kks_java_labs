import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class zashitatest {
    public static void main(String[] args) {
        String[] sArray4 = {"xyttttz", "jk", "efg", "c", "qiiiiiwr", "vuo"};
        for (String j : sArray4)
            System.out.print(j + " ");
        System.out.println();
        System.out.println("\n");
        zashita.quicksort(sArray4);
        for (String j : sArray4)
            System.out.print(j + " ");
        System.out.println();
        System.out.println("\n");
    }
}
