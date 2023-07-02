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
  }
}