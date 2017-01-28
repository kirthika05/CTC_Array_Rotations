package com.kirthika;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        performRotations(a,k);
    }

    /*Function to perform d rotations on an array a*/
    public static void performRotations(int[] a,int d){
        int n=a.length;
        int i,j,k,temp;
        for(i=0;i<gcd(d,n);i++){
            temp=a[i];
            j=i;
            while(1!=0){
                k=j+d;
                if(k>=n){
                    k=k-n;
                }if(k==i){
                    break;
                }
                a[j]=a[k];
                j=k;
            }
            a[j]=temp;
        }
        printArray(a);
    }

    /*Function to compute the GCD(x,y)*/
    public static int gcd(int x, int y){
        if (y == 0){
            return x;
        }else{
            return gcd(y, x % y);
        }
    }

    /*Function to print the array*/
    public static void printArray(int []a){
        for(int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
    }
}
