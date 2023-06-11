import java.util.Scanner;

public class Abc {
  public static void main(String[] args) {
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
    
    RandomHand();
  }
  
  public static double items(double price, int amount){
    double totalPrice = price * amount;
    return totalPrice;
  }
  
  // ランダム
  public static void RandomHand() {
    String[] janken = {"グー", "チョキ", "パー"};
    int randomNumber = (int)(Math.random()*3);
    System.out.println(janken[randomNumber]);
  }
  
}