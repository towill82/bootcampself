public class StringPoolExample {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello";

    System.out.println(str1 == str2); // true
    

    String str3 = "Hello";
    String str4 = new String("Hello");

    System.out.println(str3 == str4); // false 
    System.out.println(str3.equals(str4)); // true

  }
}
