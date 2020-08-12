// abstractメソッドを含むクラスはabstractをつける（抽象クラス）
// 抽象クラスはnewによるインスタンス化が禁止される
// 子クラスでオーバーライドしないとエラーになる
public abstract class Character {
  String name;
  int hp;

  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }

  // abstract抽象メソッド
  public abstract void attack(Monster m);

}