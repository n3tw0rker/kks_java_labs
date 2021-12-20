public class zashita {

    public static int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
    private static void swap( String[] arr, int i, int j)
    {
        String t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private static int partition(String[] arr, int begin, int end)
    {
        String pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (compare(arr[j], pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    public static void quicksort(String[] arr)
    {
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(String[] arr, int begin, int end)
    {
        if (begin < end) {
            int partitionIdx = partition(arr, begin, end);
            quicksort(arr, begin, partitionIdx - 1);
            quicksort(arr, partitionIdx + 1, end);
        }
    }
}
