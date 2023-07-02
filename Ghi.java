import java.util.ArrayList;

public class Ghi {
  public static void main(String[] args) {
    ArrayList<String> array = new ArrayList<String>();
    array.add("One");
    array.add("Two");
    array.add("Three");
    System.out.println("現在の要素数は" + array.size());
    for (int i = 0; i < array.size(); i++ ) {
      System.out.println(array.get(i));
    }
    
    array.remove(0);
    System.out.println("現在の要素数は" + array.size());
    for (int i = 0; i < array.size(); i++ ) {
      System.out.println(array.get(i));
    }
    
    WrapTest.wrap();

  }
}

class WrapTest {
  public static void wrap() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(Integer.valueOf(10));
    numbers.add(Integer.valueOf(20));
    numbers.add(Integer.valueOf(30));
    
    Integer number10 = numbers.get(0);
    int num10 = number10.intValue();
    System.out.println(num10);
    
    int num20 = numbers.get(1);  //オートボクシングを活用した書き方
    System.out.println(num20);

  }
}