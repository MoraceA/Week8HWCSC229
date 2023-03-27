/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */




    // Todo 01: - complete the implementation of linear search and test your code  
       
//The space complexity below is O(1)
//The time complexity below is O(N)

public class LinearSearch {
    
 
    
    
    public static int search(int arr[], int x)
    {
       
    
        
        int n = arr.length;
        for ( int i=0; i<n; i++){
            if (n ==x){
                return i;
            }
        }
        return -1;
        
        
        
        
        
    }
    
}
