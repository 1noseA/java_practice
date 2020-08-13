public class Main {
    public static void main(String[] args) {
      Hero.setRandomMoney();
      System.out.println(Hero.money);
      Hero h1 = new Hero();
      System.out.println(h1.money);
      
      // newせずとも利用可能
      // Hero.money = 100;
      // System.out.println(Hero.money);

      // Hero h1 = new Hero();
      // Hero h2 = new Hero();
      // Hero.money = 100;
      // System.out.println(Hero.money); // 100と表示
      // System.out.println(h1.money); // 100と表示
      // h1.money = 300;
      // System.out.println(h2.money); // 300と表示
    }
}