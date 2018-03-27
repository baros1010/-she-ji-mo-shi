package bulider;
/**
 * 监工
 * @author firas
 *
 */
public class Director {
	private Builder bulider;

	public Director(Builder bulider) {
		this.bulider = bulider;
	}
	public void construct(){
		bulider.makeTitle("动漫");
		bulider.makeString("路人女主的养成方法");
		bulider.makeItem(new String[]{
				"加藤惠",
				"霞之秋诗羽",
				"英梨梨"
		});
		bulider.makeString("紫罗兰的永恒花园");
		bulider.makeItem(new String[]{
				"薇尔莉特",
				"少佐"
		});
		bulider.close();
	}
}
