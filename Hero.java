public class Hero {
  int hp;
  String name;
  // インスタンスで一つではなく、Heroクラスに対して一つあればいい場合はstatic
  // 静的フィールド（static field)
  static int money;
  // Sword sword;

  // staticがついているメソッドは静的メソッド（クラスメソッド）
  public static void setRandomMoney() {
    Hero.money = (int) (Math.random() * 1000);
  }

  public boolean equals(Object o) {
    // 等値だったら等値
    if (this == o) {
      return true;
    } 
    if (o instanceof Hero) {
      Hero h = (Hero) o;
      // 名前が等しかったら等価
      if (this.name.equals(h.name)) {
        return true;
      }
    }
    return true;
  }

  public String toString() {
    return "名前：" + this.name + "/HP：" + this.hp;
  }

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