package com.main;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) 
    { 
        List al = new ArrayList(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2); 
  
        // This makes a call to remove(int) and  
        // removes element 20. 
        al.remove(1); 
          
        // Now element 30 is moved one position back 
        // So element 30 is removed this time 
        al.remove(1); 
  
        System.out.println("Modified ArrayList : " + al); 
    } 
}
