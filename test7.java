public class test7 {
  public static void main(String[] args) {
    // 1
    String str = null;
    str += "null";
    System.out.println(str);

    // 2
    StringBuilder sb = new StringBuilder("abcde");
    System.out.println(sb.capacity());

    // 3
    System.out.println(10 + 20 + "30" + 40);
  }
}