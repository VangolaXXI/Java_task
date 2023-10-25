public class mission_3_1 {
    public static void main(String[] args) {
        int[] arr = {-4, 2, 3,-2 ,6, 8};
        selectionSort(arr);
        printArray(arr, "Отсортированный массив:");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Обмен элементов: текущий элемент и минимальный элемент
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // Распечатываем состояние массива на каждой итерации, включая обмен элементами
            printArray(arr, "Итерация " + (i + 1) + ":");
        }
    }

    public static void printArray(int[] arr, String message) {
        System.out.print(message + " ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
