public class test9 {
  public static void main(String[] args) {
    // 4
    StringBuilder sb = new StringBuilder();
    sb.append("abcde");
    // 反転メソッド
    sb.reverse(); 
    sb.replace(1, 3, "a");
    System.out.println(sb);
  }
}