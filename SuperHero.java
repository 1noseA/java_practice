// extendsでHeroクラスを継承し、違いだけを書く
public class SuperHero extends Hero {
  boolean flying;
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }

  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  // 親クラスのメンバを上書き（オーバーライド）
  public void run() {
    System.out.println(this.name + "は撤退した");
  }

}