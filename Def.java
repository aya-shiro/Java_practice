// java.baseモジュールは使用頻度が高いので省略可
// module waste {
//   requires java.desctop;  
//   exports 外部に公開するパッケージ名;
// }

import java.util.*;
import java.util.Random;  //java.utilパッケージのRandomクラス使用宣言

class Def {
  
  private static Random rand = new Random();  //クラスでRandom型のオブジェクト作成
  public static double nextDoubleMethod() {
    return rand.nextDouble();  //nextDouble()メソッドでランダムな浮動小数点数を生成してreturnで返す
  }
  
  public static void main(String[] args) {
    System.out.println(rand.nextDouble());  //nextDoubleMethod()でreturnしたrand.nextDouble()を出力
    
    // java.lang.Stringクラス
    String message = "Hello, Java!";
    System.out.println(message.length());  
    System.out.println(message.indexOf("o"));
    System.out.println(message.contains("hello"));
    System.out.println(message.contains("Hello"));
    System.out.println(message.replace("Hello", "Good morning"));
    System.out.println(message.replace("Hi", "Good morning"));
    
    String date = "2023/06/19";
    String[] items = date.split("/");
    for (int i = 0; i < items.length; i++) {
      System.out.println(items[i]);
    }
  }

  
}