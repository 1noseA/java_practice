// インターフェース…曖昧すぎて特別扱いされた抽象クラス
// 全てのメソッドは抽象メソッド
// フィールドは持たない
public interface Creature {
  // public abstract void run() {}と書かなくても
  // インターフェース宣言されたメソッドは自動的にpublic && abstract
  void run();
}