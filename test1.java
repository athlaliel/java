// パッケージとはJavaのクラスをまとめて分類するための仕組みです。
// クラス数が大量にある場合、それらを機能などで分類してまとめておくとクラスの管理が容易になります。
// クラスの先頭で「package」と宣言することで、そのクラスが分類されるパッケージを指定することができます。
class test1 {
  public static void main(String[] args) {
    System.out.println("JAVAのパッケージとは？");
    System.out.println("１、名前空間を提供し、名前の重複という衝突を避けるもの");
    System.out.println("※パッケージ名は一意が推奨される");
    System.out.println("２、パッケージ単位でアクセス制御を提供する");
    System.out.println("アクセス制御する事で、パッケージ内のクラスを公開、非公開のクラスに分けられる。意図しないクラスの使用が避けられる。");
    System.out.println("３、クラスの分類を可能にする");
    System.out.println("パッケージに属さないクラスは存在しない！");
  }
}



