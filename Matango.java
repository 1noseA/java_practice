public class Matango {
  int hp;
  // finalで定数フィールド（大文字推奨）
  final int LEVEL = 10;
  char suffix;
  
  public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
  }
}