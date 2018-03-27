package bulider;
/**
 * 具体建造者
 * @author firas
 *
 */
public class TextBulider extends Builder{
	private StringBuffer buffer =new StringBuffer();
	@Override
	public void makeTitle(String title) {
		buffer.append("***********");
		buffer.append("【"+title+"】\n");
		buffer.append("\n");
		
	}

	@Override
	public void makeString(String str) {
		buffer.append(" "+str+" ");
		buffer.append("\n");
		
	}

	@Override
	public void makeItem(String[] items) {
		for(String item:items){
			buffer.append(item+"\n");
		}
		buffer.append("\n");
		
	}

	@Override
	public void close() {
		buffer.append("***********");
		
	}
	public String getResult(){
		return buffer.toString();
	}

}
