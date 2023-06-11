public class Abc {
  public static void main(String[] args) {
    System.out.println("Test!");
    int number = 33;
    char n = '1';  //char型はシングルクォーテーションで囲む
    char s = 'あ';
    System.out.println("char型" + n + "や" + s + "はシングルクォーテーションで囲む");
    short myShort = 0x1234;    //0b…2進数・0…8進数・0x…16進数
    System.out.println("byte・short・int・longの4つの型はビット符号付き整数を格納できる");
    System.out.println(myShort);
  }
}