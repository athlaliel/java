public class test8 {
  public static void main(String... args) {
    for (String arg : args) {
      System.out.println(arg);
    }
  }
}

// 実行コマンド
// java test8 a ¥" a¥" "a "b 
// スペースを含む文字列を括っているクォーテーションは含まれない。
// クォーテーションを文字として使う場合は、¥" としてスペースをエスケープさせる事。
// ダブルクォーテーションをつけても出力時に文字として扱われない。
// 扱いたければ、その文字の前に¥を前につける事。