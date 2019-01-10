package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrarRotation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine().trim());
		int[] arr = new int[size];
		int[] revarr = new int[size];
		String[] temp = br.readLine().trim().split(" ");
		for (int i = 0,j=size-1,k = -1; i < size; i++,j--) {

			arr[i] = Integer.parseInt(temp[i]);
			revarr[j] = Integer.parseInt(temp[i]);
		}
		
		reverse(arr);
		System.out.println(Arrays.toString(arr) + "\n" + Arrays.toString(revarr));

	}
	
	public static void reverse(int[] arr) {
		
	}
}
