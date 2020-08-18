import java.io.*;
public class Main {
  public static void main(String[] args) {
    // tryブロックの外で宣言し、nullで初期化しないと
    // finallyブロック内でclose()を呼べない
    FileWriter fw = null;
    try {
      fw = new FileWriter("rpgsave.dat", true);
      fw.write('A');
      fw.flush();
    } catch(IOException e) {
      System.out.println("ファイル書き込みエラーです");
      // ファイルを閉じるためのfinallyブロック
    } finally {
      if (fw != null) {
        try {
          fw.close();
          // 失敗しても何もできないためcatchブロックの中は空
        } catch(IOException e2) { }
      }
    }
  }
}