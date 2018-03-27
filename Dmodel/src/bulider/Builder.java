package bulider;
/**
 * 建造者
 * @author firas
 *
 */
public abstract class Builder {
public  abstract  void makeTitle(String title);
public  abstract void makeString(String str);
public  abstract void makeItem(String[] items);
public  abstract void close();
}
