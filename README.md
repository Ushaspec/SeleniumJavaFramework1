import java.io.*;
import java.util.Scanner;

class revers {
  public static void main(String[] args) {
    String s = "Usha";
    
    StringBuilder res = new StringBuilder();
    res.append(s);
    res.reverse();
    System.out.println(res);
  }
}


import java.io.*;
import java.util.Scanner;

class revers {
  public static void main(String[] args) {
    String s = "Usha";
    String r = "";
    char c;
    
    for(int i=0;i<s.length();i++){
      c=s.charAt(i);
      r=c+r;
      
    }
    System.out.println(r);
  }
}

import java.io.*;
import java.util.Scanner;

class palindrome {
  public static void main(String[] args) {
  String s = "madam";
  
  String str = new StringBuilder(s).reverse().toString();
  
  if(s.equals(str)) {
    System.out.println(s + " is palindrame");
  }
  else{
    System.out.println(s + " is not palindrame");
  }
  
}
}

import java.io.*;
import java.util.Scanner;
class palindrome {
  public static void main(String[] args) {
  int num = 121;
  int original = num;
  int reversed = 0;
  while(num!=0) {
    reversed = reversed * 10 + num%10;
    num/=10;
  }
  if(original ==reversed) {
    System.out.println(original + "is palindrom");
  }
  else {
    System.out.println(original + "is not palindrom");
  }
}
}

import java.io.*;
import java.util.Scanner;
class twonum {
  public static void main(String[] args) {
  int a=10;
  int b=20;
  a = a+b; 
  b=a-b; 
  a=a-b;
  System.out.println(a);
  System.out.println(b);
}
}


import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class occuranceofchar {
  public static void main(String[] args) {
    String s = "Welcome to world";
    Map<Character, Integer> src = new HashMap<>();
    for(char c: s.toCharArray())
    {
      if(src.containsKey(c))
      {
        src.put(c,src.get(c)+1);
      }
      else{
        src.put(c,1);
      }
    System.out.println(src);
}
}

import java.io.*;
import java.util.Scanner;
class dublicatinarray {
  public static void main(String[] args) {
    int[] arr={7,8,9,8,9,9};
    System.out.println("duplicate array: ");
    for(int i=0; i< arr.length; i++){
      for (int j=i+1; j<arr.length;j++){
        if(arr[i]==arr[j])
        {
          System.out.println(arr[i]);
          break;        }
      }
    }
    }
}

