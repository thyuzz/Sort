//сортировка кучей
public class HeapSort {
    public void sort(int arr[]){
        int n = arr.length;

        // формирование кучи
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // извлечение элементов из кучи
        for (int i = n - 1; i >= 0; i--){
            // перемещение текущего корня в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0); // вызов процедуры на уменьшенной куче
        }
    }

    // процедура перегруппировки с корнем i в кучу размером n
    void heapify(int arr[], int n, int i){
        int largest = i; //инициализация наибольшего элемента в корень

        int l = 2 * i + 1; // левый потомок узла
        int r = 2 * i + 2; // правый

        if (l < n && arr[l] > arr[largest]) largest = l; // если левый больше корня
        if (r < n && arr[r] > arr[largest]) largest = r; // если правый

        // если наибольший не корень
        if (largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // рекурсия
            heapify(arr, n, largest);
        }


    }
}
