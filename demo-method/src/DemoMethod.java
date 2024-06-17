public class DemoMethod {






  public static void main(String[] args) {
    System.out.println("hello");

    int result = sum(10, 3);
    System.out.println("result=" + result); // 13
  }
  

  public static int sum(int x, int y) {
    // if your method is with return type,
    // the method content should contain a key word "return"
    return x + y; // int + int -> int
  }

}
