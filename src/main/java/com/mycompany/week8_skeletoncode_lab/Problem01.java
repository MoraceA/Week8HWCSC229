/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

import java.util.Arrays;

/**
 *
 * @author MoaathAlrajab
 */

public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    
    //The space complexity below is O(n)
    // The time complexity below is O(log(n)^2)
    
int sum = 0;
    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);

    for (int p = 2; p * p <= n; p++) {
        if (isPrime[p]) {
            for (int i = p * p; i <= n; i += p) {
                isPrime[i] = false;
            }
        }
    }

    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) {
            sum += i;
        }
    }

    return sum;
}
    
    }

    

