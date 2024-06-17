public class DemoInternalCache {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; 

    i1 = 127;
    i2 = 127;
    System.out.println(i1 == i2);

    Integer i3 = Integer.valueOf(128);
    Integer i4 = 128;
    System.out.println(i3 == i4);


    System.out.println(i3.compareTo(i4));


    Float f1 = 10.12345f; // autobox: float value -> Float Object
    Float f2 = 10.12345f; // autobox: float value -> Float Object
    System.out.println(f1 == f2); // false
    

    Double d1 = 128.12345d; // autobox: double value -> Double Object
    Double d2 = 128.12345d; // autobox: double value -> Double Object
    System.out.println(d1 == d2); // false

    Character c1 = 'c'; // autobox: char value -> Character Object
    Character c2 = 'c';
    System.out.println(c1 == c2);

    Character c3 = '我';
    Character c4 = '我';
    System.out.println(c3 == c4);

  }

}
