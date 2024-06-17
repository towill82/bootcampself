public class DemoStringBuilder {
  
  public static void main(String[] args) {
    String x = "hello";

    StringBuilder sb = new StringBuilder("hello");
    Cat cat = new Cat();
    cat.setAge(13);
    
    x += "world";
    sb.append("world");

    System.out.println(x);
    System.out.println(sb.toString());

    sb.replace(1, 2, "xx");
    System.out.println(sb.toString());
    System.out.println(sb);

    sb.setCharAt(4, 'A');
    System.out.println(sb.toString());
    
    sb.reverse();
    System.out.println(sb.toString());

    sb.insert(4, '*');
    System.out.println(sb.toString());

    String s = sb.substring(1, 3);
    System.out.println(s);
    System.out.println(sb.toString());
  }
}
