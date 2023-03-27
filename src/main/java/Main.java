
import com.mycompany.week8_skeletoncode_lab.BinarySearch;

import com.mycompany.week8_skeletoncode_lab.BubbleSort;
import com.mycompany.week8_skeletoncode_lab.LinearSearch;
import com.mycompany.week8_skeletoncode_lab.Problem01;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariana
 */
public class Main {
      public static void main(String[] args) {
          LinearSearch linear = new LinearSearch();
         Problem01 problem = new Problem01();
         BubbleSort bubble =new BubbleSort();
         BinarySearch binary = new BinarySearch();
        int n = 10;
//problem01 call
        long sumOfPrimes = problem.getSumOfPrimes(n);

        System.out.println("The sum of primes between 1 and " + n + " is " + sumOfPrimes);

        // call linear search
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        
        int result = LinearSearch.search(arr, x);
        
        if (result == 3) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index " + result);
            
            
            //call binary search
            
        int[] binaryArr = {1, 2, 3, 4, 5};
int key = 3;
int low = 0;
int high = arr.length - 1;
int index = binary.binarySearch(arr, key, low, high);
System.out.println("Index of " + key + " is " + index);
            
        
      
      //call bubblesort
      
int[] bubbleArr = {5, 2, 9, 1, 5, 6};
int size = arr.length;
bubble.bubbleSort(arr, size);      
      
     for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    
      
            
            
        }
    }
        
        
        
        
        
        
        
    }

