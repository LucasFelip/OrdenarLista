/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BucketSort;

/**
 *
 * @author Inspion
 */
class BucketSort {
    public void bucketSort(int[] arr){
        int n = arr.length;
        
        if(n <= 0) 
            return;
        
        int min = arr[0];
        int max = min;
        
        for(int i = 1; i < n; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        
        int bucket[] = new int[max - min + 1];
        for(int i = 0; i < n; i++)
            bucket[arr[i] -min]++;
        
        int i = 0;
        
        for(int b = 0, len = bucket.length; b < len; b++){
            for(int j = 0; j < bucket[b]; j++)
                arr[i++] = b + min;
        }
    }
}
