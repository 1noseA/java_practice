public class Hero extends Character {
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("敵に5ポイントのダメージを与えた！");
  }

  // public void sleep() {
  //   this.hp = 100;
  //   System.out.println(this.name + "は、眠って回復した！");
  // }

  // public void sit(int sec) {
  //   // 何秒座るか引数で受け取る
  //   this.hp += sec;
  //   System.out.println(this.name + "は、" + sec + "秒座った！");
  //   System.out.println("HPが" + sec + "ポイント回復した");
  // }

  // finalがついていると子クラスでオーバーライドできない
  public final void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
  }

  public void run() {
    System.out.println(this.name + "は、逃げ出した！");
  }
}