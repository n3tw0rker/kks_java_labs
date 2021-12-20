import java.util.Arrays;

public class EffectiveSortsTest
{
	public static void main(String[] args)
	{
		int[] intArray = {2, 10, 15, 20, - 20, 16, 17, 40, 15, -25, 46};
		int[] intArray2 = {2, 10, 15, 20, - 20, 16, 17, 40, 15, -25, 46};

		System.out.println("Быстрая сортировка целочисленного массива:");
		System.out.println(Arrays.toString(intArray));
		EffectiveSorts.quickSort(intArray);
		System.out.println(Arrays.toString(intArray));

		System.out.println("Быстрая сортировка подпоследовательности 0 - 7");
		int[] copyOfArr = Arrays.copyOfRange(intArray2, 0, 7);
		System.out.println(Arrays.toString(intArray2));
		EffectiveSorts.quickSort(copyOfArr);
		System.out.println(Arrays.toString(copyOfArr));


		System.out.println("Быстрая сортировка с любым типом данных");
		String[] quickString = {"Orange", "Apple", "Juice", "Fruit", "Computer", "Name"};
		System.out.println(Arrays.toString(quickString));
		EffectiveSorts.quickSort(quickString);
		System.out.println(Arrays.toString(quickString));
		System.out.println();


		System.out.println("Сортировка целочисленного массива слиянием:");
		int[] intArrayInsert = {2, 10, 15, 20, - 20, 16, 17, 40, 15, -25, 46};
		System.out.println(Arrays.toString(intArrayInsert));
		EffectiveSorts.mergeSort(intArrayInsert);
		System.out.println(Arrays.toString(intArrayInsert));


		int[] intArrayInsert2 = {2, 10, 15, 20, - 20, 16, 17, 40, 15, -25, 46};
		System.out.println("Сортировка подпоследовательности 2 - 9 слиянием");
		int[] copyOfIAI2 = Arrays.copyOfRange(intArrayInsert2, 2, 9);
		System.out.println(Arrays.toString(intArrayInsert2));
		EffectiveSorts.mergeSort(copyOfIAI2);
		System.out.println(Arrays.toString(copyOfIAI2));


		System.out.println("Сортировка любого типа данных слиянием");
		String[] mergeString = {"Orange", "Apple", "Juice", "Fruit", "Computer", "Name"};
		System.out.println(Arrays.toString(mergeString));
		EffectiveSorts.mergeSort(mergeString);
		System.out.println(Arrays.toString(mergeString));
		System.out.println();


		System.out.println("Пирамидальная сортировка целочисленного массива");
		int[] intArraySelect = {2, 10, 15, 20, - 20, 16, 17, 40, 15, -25, 46};
		System.out.println(Arrays.toString(intArraySelect));
		EffectiveSorts.heapSort(intArraySelect);
		System.out.println(Arrays.toString(intArrayInsert));


		System.out.println("Пирамидальная сортировка подпоследовательности 4 - 9");
		int[] intArraySelect2 = {2, 10, 15, 20, - 20, 16, 17, 40, 15, -25, 46};
		System.out.println(Arrays.toString(intArraySelect2));
		int[] copyOfIAS2 = Arrays.copyOfRange(intArraySelect2, 4, 9);
		EffectiveSorts.heapSort(copyOfIAS2);
		System.out.println(Arrays.toString(copyOfIAS2));


		System.out.println("Пирамидальная сортировка любого типа данных");
		String[] heapString = {"Orange", "Apple", "Juice", "Fruit", "Computer", "Name"};
		System.out.println(Arrays.toString(heapString));
		EffectiveSorts.heapSort(heapString);
		System.out.println(Arrays.toString(heapString));

	}
}
