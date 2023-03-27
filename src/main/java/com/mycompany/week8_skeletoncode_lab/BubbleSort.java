/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */





//ToDo 3: complete this algorithm, test it, provide its time complexity

//The space complexity below is O(1)
//The time complexity below is O(n^2)


public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                 if (a[inner] > a[inner + 1]) {
                temp = a[inner];
                a[inner] = a[inner + 1];
                a[inner + 1] = temp;
                
                
                
                

                
                
                
                
                
                
                
            }
        }
        }
    }
}
   
    
   
