/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

/**
 *
 * @author Inspion
 */
class QuickSort {
    
    int partition(int arr[], int ini, int fim) { 
        int pivot = arr[fim];  
        int i = (ini-1); 
        
        for (int j=ini; j<fim; j++){ 
            if (arr[j] <= pivot){ 
                i++;
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[fim]; 
        arr[fim] = temp;
        return i+1; 
    } 
    
    void sortear(int arr[], int ini, int fim){ 
        if (ini < fim){ 
            int pi = partition(arr, ini, fim); 
            sortear(arr, ini, pi-1); 
            sortear(arr, pi+1, fim); 
        } 
    } 
}
