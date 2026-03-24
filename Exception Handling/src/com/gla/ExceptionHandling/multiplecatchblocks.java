package com.gla.exceptionHandling;
import java.util.*;
public class multiplecatchblocks {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = null;

            try {
                System.out.print("Enter size of array: ");
                int size = sc.nextInt();
                arr = new int[size];
                System.out.println("Enter array elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.print("Enter index to retrieve value: ");
                int index = sc.nextInt();
                System.out.println("Value at index " + index + ": " + arr[index]);

            } catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Invalid index!");

            } catch (NullPointerException e)
            {
                System.out.println("Array is not initialized!");

            } finally {
                sc.close();
            }
        }
    }
