package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FlippingImage {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] a = new int[2][3];

		for (int i = 0; i < a.length; i++) {
			String[] temp = br.readLine().split(" ");
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = Integer.parseInt(temp[j]);
		}
		
//		for(int k=0; k<a.length;k++)
		System.out.println(Arrays.deepToString(a));
	}

}
