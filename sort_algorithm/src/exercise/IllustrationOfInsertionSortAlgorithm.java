package exercise;

public class IllustrationOfInsertionSortAlgorithm {
    static int[] list = {7, 3, 2, 5, 6, 1, -2, 3, 14, 4};

    static void inserttionSort(int[] list){
        for (int i = 0; i < list.length; i++) {
            int temp;
            System.out.println("Loop: " + i);
            for (int j = list.length - 1; j > i; j--) {
                for (int k = 0; k < list.length; k++) {
                    System.out.print(list[k] + " ");
                }

                if (list[j] < list[j-1]){
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                    System.out.println("Swap: " + list[j -1] + "  " + list[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        inserttionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
