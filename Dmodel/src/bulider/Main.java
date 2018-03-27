package bulider;
/**
 * 使用者
 * @author firas
 *
 */
public class Main {

	public static void main(String[] args) {
		if(args.length!=1){
			usage();
			System.exit(0);
		}
		if(args[0].equals("Plain")){
			TextBulider text =new TextBulider();
			Director dir=new Director(text);
			dir.construct();
			System.out.println(text.getResult());
		}else if(args[0].equals("HTML")){
			HTMLBuilder html=new HTMLBuilder();
			Director dirS=new Director(html);
			dirS.construct();
			System.out.println(html.getResult());
		}else{
			usage();
			System.exit(0);
		}
	
}

	private static void usage() {
		System.out.println("Java Main Plain");
		System.out.println("Java Main HTML");
		
	}
}
