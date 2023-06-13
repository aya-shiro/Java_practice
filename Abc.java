import java.util.Scanner;

public class Abc {

    System.out.println("Practice!");
    
    int number = 33;
    char n = '1';  //char型はシングルクォーテーションで囲む
    char s = 'あ';
    System.out.println("char型 " + n + " や " + s + " はシングルクォーテーションで囲む");
    String d = "Java";
    System.out.printf("char nの値は%c,String dの値は%sで上の文をすっきり書ける%n", n, d);
    // 出力文の末尾に %n をつけるとprintfでも改行できる

    short myShort = 0x1234;    //0b…2進数・0…8進数・0x…16進数
    System.out.println("byte・short・int・longの4つの型はビット符号付き整数を格納できる");
    System.out.println(myShort);
    
    Scanner in = new Scanner(System.in);
    System.out.print("Whats your name?:");
    // String name = scanner.next();
    String name = in.next();
    System.out.println("Your name is " + name + ",right?");
    in.close();  //コンソールからの入力終了記述。あってもなくても挙動に変化なし
    
    //一次元配列
    int[] scores = {50, 55, 60, 105, 110};
    // for (int i = 0; i < 5; i++) {
    for (int i = 0; i < scores.length; i++) {  //scores.lengthで配列の要素数に合わせて柔軟に対応
      if (i % 2 == 0) {
        System.out.println(scores[i]);
        continue;  //continueで偶数スキップ
      }
    }
    
    double price = 120.0;
    int amount = 15;
    double totalPrice = items(price, amount);
    if (totalPrice >= 1500) {
      double saledPrice = totalPrice * 0.95;
      System.out.println("購入額が1500円以上なので5％割引が適用されます");
      System.out.println("価格は合計" + saledPrice + "円です");
    } else {
      System.out.println("価格は合計" + totalPrice + "円です");
    }
    
    double circleArea = GetAreaOfCircle(2);
    System.out.println("円の面積は" + circleArea + "㎠です");
    
    RandomHand();
    RandomHand("グー");
    
    // クラス名 変数名 ＝ new メソッド名
    StudentCard a = new StudentCard();
    a.id = 2;
    a.name = "John";
    StudentCard b = new StudentCard();
    b.id = 3;
    b.name = "Mall";
    System.out.printf("IDが%dであるカードの持ち主は%sです%n", a.id, a.name);
  }
  
  public static double items(double price, int amount){
    double totalPrice = price * amount;
    return totalPrice;
  }
  
  // 戻り値で計算する円の面積
  public static double GetAreaOfCircle(double radius) {
    return radius * radius * 3.14;
  }
  
  // ランダム
  public static void RandomHand() {
    String[] janken = {"グー", "チョキ", "パー"};
    int randomNumber = (int)(Math.random()*3);
    System.out.println(janken[randomNumber]);
  }
  
  // オーバーロード
  public static void RandomHand(String j) {
    System.out.println(j + "を引数に受け取った！");
  }
  
}

// インスタンス生成
class StudentCard {
  int id;
  String name;
}