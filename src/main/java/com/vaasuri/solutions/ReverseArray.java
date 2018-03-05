package com.vaasuri.solutions;
import java.util.ArrayList;

public class ReverseArray {

  public static int[] reverse(int[] list) {

    if (list == null)
      return null;

    int[] newList = new int[list.length];
    
    for (int i = list.length - 1, j = 0; i >= 0; i--, j++) {
      newList[j] = list[i];
    }
    return newList;
  }
} 
