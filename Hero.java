public class Hero {
  private int hp;
  private String name;
  Sword sword;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void attack(Monster m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("敵に5ポイントのダメージを与えた！");
  }

  // publicを外すとpackage privateを指定したとみなされる
  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }

  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAMEOVERです");
  }
  // public void sit(int sec) {
  //   // 何秒座るか引数で受け取る
  //   this.hp += sec;
  //   System.out.println(this.name + "は、" + sec + "秒座った！");
  //   System.out.println("HPが" + sec + "ポイント回復した");
  // }

  // finalがついていると子クラスでオーバーライドできない
  // public final void slip() {
  //   this.hp -= 5;
  //   System.out.println(this.name + "は、転んだ！");
  //   System.out.println("5のダメージ！");
  // }

  // public void run() {
  //   System.out.println(this.name + "は、逃げ出した！");
  // }
}