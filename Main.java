import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    InputStream is = new FileInputStream("c:\\rpgsave.xml");
    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
    Element hero = doc.getDocumentElement();
    Element weapon = findChildByTag(hero, "weapon");
    Element power = findChildByTag(weapon, "power");
    String value = power.getTextContent();
  }
  // 指定された名前を持つタグの最初の子タグを返す
  static Element findChildByTag(Element self, String name) throws Exception {
    // すべての子を取得
    NodeList children = self.getChildNodes();
    for (int i = 0; i < children.getLength(); i++) {
      if (children.item(i) instanceof Element) {
        Element e = (Element) children.item(i);
        // タグ名を照合
        if (e.getTagName().equals(name)) {
          return e;
        }
      }
    }
    return null;
  }
}