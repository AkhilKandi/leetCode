package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[size];
		String[] temp = br.readLine().trim().split(" ");
		for (int i = 0, j = size - 1, k = -1; i < size; i++, j--) {

			arr[i] = Integer.parseInt(temp[i]);
		}

		arr = sortArrayByParity(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static int[] sortArrayByParity(int[] arr) {
		
		int[] temp = new int[arr.length];
		for (int i = 0, j = arr.length-1,k=0; i < arr.length;) {
			if(arr[i]%2 == 0) 
				{
				temp[k++] = arr[i++];
				}
			else 
				{
				temp[j--] = arr[i++];
				}
			
		}
		return temp;

	}

}
