class Quetion {
  public static void main(String[] args) {
    System.out.println("心が読めるのか！？  マズい！！");

    try {
      Thread.sleep(3000); // 3秒(3万ミリ秒)間だけ処理を止める
     } catch (InterruptedException e) {
     }

    System.out.println("何がマズい？言ってみろ！");
  }
}