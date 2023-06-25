// java.baseモジュールは使用頻度が高いので省略可
// module waste {
//   requires java.desctop;
//   exports 外部に公開するパッケージ名;
// }

import java.util.*;
import java.util.Random;  //java.utilパッケージのRandomクラス使用宣言
// StringクラスとMathクラスは頻出なのでimport省略可能

public class Def {
  public static double nextDoubleMethod() {
    return rand.nextDouble();  //nextDouble()メソッドでランダムな浮動小数点数を生成してreturnで返す
  }

  public static void main(String[] args) {
    printMath();
    ExceptionTest.test();
  }
  
  private static Random rand = new Random();  //クラスでRandom型のオブジェクト作成
  
  public static void printMath() {

    System.out.println(rand.nextDouble());  //nextDoubleMethod()でreturnしたrand.nextDouble()を出力

    // java.lang.Stringクラス
    String message = "Hello, Java!";  //文字列Stringは頻出なのでnewは省略可能
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

    // java.lang.Mathクラス
    double dd = Math.abs(-9.4);  //絶対値を返すMath.abs
    System.out.println(dd);
    System.out.println("sin30°は" + Math.sin(30.0 * Math.PI / 180.0));  //Math.sinの引数の値はラジアン単位、30*π/1
    // System.out.println(Math.sin(Math.PI / 6));  //この求め方もOK、π/6
    double qq = Math.sqrt(25);
    System.out.println(qq);
    
    int bb = 3;
    int ww = 5;
    int mm = Math.max(bb, ww);
    System.out.println(mm);
    
    double rr = Math.random();  //0.0~1.0の乱数をrrに代入し出力
    System.out.println(rr);
    double ff = Math.floor(5.24);  //Math.floorで引数の数値以下の最大整数値を返す
    System.out.println(ff);

    int min = 1;
    int max = 10;
    int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);  
    //Math.randomで出した乱数に1~10の範囲内のいずれかを掛けてMath.fllorで整数にする
    //Math.fllorで返った浮動小数点~.0を(int)で整数型に型変換する
    //最後の+minで範囲0~9を1~10に調整
    System.out.println(randomInt);
  }
}

// ファイル名と異なるクラスへのpublic修飾子の付与は不可
class ExceptionTest {
  public static void test() {
    int a = 4;
    int b = 0;
    int[] array = new int[3];

    try {
      array[10] = 99;

      int c = a / b;
      System.out.println("cの値は" + c + "です");
    }
    catch (ArithmeticException e) {  //"ArithmeticException"はランタイムエラーから抜粋、変数eを定義
      System.out.println("例外が発生しました");
      System.out.println(e);
      e.printStackTrace();  //例外オブジェクトを出力する固有メソッド
      return;  //メソッドの即時終了
    }
    
    catch (ArrayIndexOutOfBoundsException r) {
      System.out.println("2つ目の例外が発生しました");
      System.out.println(r);
    }

    finally {
      System.out.println("処理を終了します");
    }
    System.out.println("catchブロックでreturn;を記述しない場合に出力される");
  }
}

