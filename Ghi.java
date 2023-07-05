import java.util.ArrayList;
import java.util.HashMap;

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
    HashMapTest.company();
    AllaySample.doubleArray();
  }
}

class WrapTest {
  public static void wrap() {
    // 基本型のArrayListはラッパークラスを用いる
    ArrayList<Integer> numbers = new ArrayList<>();  //2つ目のデータ型Stringは省略可
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

class HashMapTest {
  public static void company() {
    HashMap<String, String> worker = new HashMap<String, String>();
    worker.put("name", "Kate");
    worker.put("belong", "DRYstore");
    System.out.println(worker.entrySet());  //キーと値をセットで取得する、各括弧で出力
    System.out.println(worker.keySet());  //キーを一覧で取得
    System.out.println(worker.values());  //値を一覧で取得
    System.out.println(worker.get("name"));  //キー"name"に対応する値を出力
    System.out.println(worker.get("belong"));  //キー"belong"に対応する値を出力
  }
}

class AllaySample {
  public static void doubleArray() {
    int numbers[][] = new int[2][3];
    numbers[0][0] = 21;
    numbers[0][1] = 55;
    numbers[0][2] = 76;
    numbers[1][0] = 73;
    numbers[1][1] = 64;
    numbers[1][2] = 60;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        System.out.println(numbers[i][j]);
      }
    }
    // 1周目はi-0の箱からj-0 j-1 j-2を、2週目はi-1の箱からj-0 j-1 j-2をとる
  }

}