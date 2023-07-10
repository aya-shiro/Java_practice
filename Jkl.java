import java.util.HashSet;
import java.util.Set;

class Jhi {
  public static void main(String[] args) {
       Set<String> lists = new HashSet<>();
       lists.add("Yellow");
       lists.add("Blue");
       lists.add("Red");
       System.out.println(lists.size());

       String[] wani = {"50", "76", "43"};
       int result = sum(wani);
       System.out.println(result);
  }

  public static int sum(String[] array) {
      int num = 0;
      for (int i = 0; i < array.length; i++) {
          System.out.println(array[i]);
          num += Integer.parseInt(array[i]);
      }
      return num;
  }
}