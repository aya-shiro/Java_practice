// java.baseモジュールは使用頻度が高いので省略可
// module waste {
//   requires java.desctop;  
//   exports 外部に公開するパッケージ名;
// }

import java.util.*;
import java.util.Random;

class Def {
  
  private static Random rand = new Random();

  public static void main(String[] args) {
    System.out.println(rand.nextDouble());
  }
  
  public static double nextDouble() {
    // Random rand = new Random();
    return rand.nextDouble();
  }
  
}