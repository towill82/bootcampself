public class DemoString {
  
  public static void main(String[] args) {
    String x = "hello";
    String y = "$(@*#)@!#*)!";
    String dollar = "$10";

    String withSpace = "  hello     h  ello";
    System.out.println(withSpace);

    // 
    String z = x + dollar;
    System.out.println(z);

    double price =9.99;
    String item = "Book";
    String description = "The " + item + " costs $" + price;
    System.out.println(description);

  char a = 'A';
  String message = "The answer is: " + a; // char -> String
  System.out.println(message);

    // String Method (Tool) 1: Length()
    String t = "hello";
    System.out.println("The length of t=" + t.length()); // t.length() -> int

    // check if t length >= 4, if yes, print hello, else goodbye
    if (t.length() >= 4) {
      System.out.println("hello");
    } else {
      System.out.println("goodbye");
    }
    // Method 2: equals()
  String s1 = "hello";
  String s2 = "hello";
  if (s1.equals(s2)) {
    System.out.println("They are having same string value."); // print
  } else {
    System.out.println("They are not with the same value");
  }

  if (!s1.equals(s2)) { // ! means "NOT"
    System.out.println("They are not with the same value.");
  } else {
    System.out.println("They are having same String value."); // print
  }

  if (s1 == s2) {
    System.out.println("They are same object."); // print
  }

  // check if s1 length >= 6 or s1 equals s2, print ....
  // OR
  if (s1.length() >= 6 || s1.equals(s2)) { // false || true -> true
    System.out.println("hello");
  } 

  if (s1.length() >= 6) {
    System.out.println("hellow world");
   } else if (s1.equals(s2)) {
    System.out.println("hello"); 
   }
 
  // check if s1 length >= 6 and s1 equals s2, print ...
  // AND
  if (s1.length() >= 6 && s1.equals(s2)) { // false && true -> false
    System.out.println("hello2");
  }

  if (s1.length() >= 6) {
    if (s1.equals(s2)) {
      System.out.println("hello");
    }
  }

  // Method 3: chatAt(int index), for example, charAt(0)
  String s3 = "world";
  // 0 means the first character
  // 1 means the second character
  // 4 means the 5th character
  System.out.println("The 1st character of s3=" + s3.charAt(0)); // w
  System.out.println("The 5th character of s3=" + s3.charAt(4)); // d
  System.out.println("The last character of s3=" + s3.charAt(s3.length() - 1)); // d

  // check if the last character is d and length > 5, if yes, print yes.
  String x2 = "hello world";
  if (x2.charAt(x2.length() - 1) == 'd' && x2.length() > 5) {
    System.out.println("yes");
  } 
  // Method 4: substring(int beginIndex, int endIndex)
  String result = x2.substring(0,2);
  System.out.println(result);
  System.out.println(x2.substring(0, 5)); // "hello"
  System.out.println(x2.substring(3, 8));  // "Lo wo"
  System.out.println(x2.substring(0, 0)); // ""
  System.out.println(x2.substring(0 ,1)); // "h"

  // check if the first three character is "wel", if yes, print yes
  String x3 = "welcome";
  // substring()
  if (x3.substring(0, 3).equals("wel")) {
    System.out.println("Yes");
  }
  // chain method
  System.out.println(x3.substring(0, 3).length()); // 3
  System.out.println(x3.substring(0 ,3).charAt(1)); // 'e'

  //
  String x6 = x3.substring(0, 3); // "wel"
  System.out.println(x6.length()); // 3

  String x4 = x3.substring(0, 3);
  int l1 = x4.length();
  System.out.println(l1);

  // charAt()
  if (x3.charAt(0) == 'w' && x3.charAt(1) == 'e' && x3.charAt(2) == 'l') {
  System.out.println("yes");
  }
  // isEmpty()
  // Empty String value -> ""
  String x7 = "";
  System.out.println(x7.isEmpty()); //true
  String x8 = "abc";
  System.out.println(x8.isEmpty()); //false
  System.out.println(x7.length() == 0); //true

  // isBlank()
  String x9 = "";
  System.out.println(x9.isBlank()); //true
  x9 = " ";
  System.out.println(x9.isBlank()); //true
  System.out.println(x9.isEmpty()); //false

  // substring(0, 3)
  // substring(0)
  String s10 ="hello";
  System.out.println(s10.substring(0)); // hello, from index 0 to the end.
  System.out.println(s10.substring(0, 3)); // hel, from index 0 to the index 2

  System.out.println(s10.toUpperCase()); // "HELLO"
  System.out.println(s10.toLowerCase()); // "hello"
  System.out.println(s10.replace('l', 'x')); // hexxo
  System.out.println(s10.replace("ll", "yyyy")); // heyyyo
  System.out.println(s10);
  s10 = "Happyhello";
  System.out.println(s10);
  System.out.println(s10.replace('l', 'x'));
  System.out.println(s10.contains("ell")); // true

  // startsWith()
  System.out.println(s10.startsWith("he"));
  System.out.println(s10.endsWith("o"));

  // trim(), removing the space characters at the head / tail of the String.
  String s12 = "    Hello,    bootcamp ... !!!";
  System.out.println(s12.trim()); // Hello, bootcamp !!!

  String[] strings = new String[] {"hello", "abcijk", "vincent", "Hello", "   HELLO    "};
  // how many strings contains "ELL", but igore case
  // "eLL" or "ell" or "ELL" ...
  // toUpperCase(), contains()
  int count = 0;
  for (int i = 0; i < strings.length; i++) {
    if (strings[i].toUpperCase().contains("ELL")) {
      count++;
    }
  }
  System.out.println(count);

  // equalsIgnoreCase()
  for (int i = 0; i < strings.length; i++) {
    if (strings[i].trim().equalsIgnoreCase("HELLO")) {
      System.out.println(strings[i]);
    }
  }

  String s13 = "helloll";
  System.out.println(s13.indexOf('e'));

  String s14 = "abc";
  s14 += "def";
  System.out.println(s14);

  String s15 = "abc";
  s15 = s15.concat("def"); // better performance
  System.out.println(s15); //

  String s16 = "abc";
  String s17 = "abc";
  System.out.println(s16.compareTo(s17)); 
  System.out.println(s16.equals(s17));
  System.out.println(s16 == s17);

  char c = 'a' + 1;
  System.out.println(c);
  }
}
