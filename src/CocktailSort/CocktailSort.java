/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CocktailSort;

/**
 *
 * @author Inspion
 */
class CocktailSort {
    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void cocktailSort(int arr[]) {
        boolean isSwapped = true;
        int begin = 0;
        int last = arr.length-1;

        while (isSwapped == true) {
            isSwapped = false;

            for(int i = begin; i < last; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    isSwapped = true;
                }
            }
            
            if (isSwapped == false)
                break;
            
            isSwapped = false;
            
            last -= 1;

            for (int i = last; i >= begin; i--) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    isSwapped = true;
                }
            }
            
            begin++;
        }
    }

}
