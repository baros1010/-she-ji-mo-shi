package Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BookShelf bookShelf=new BookShelf(4);
		bookShelf.appendBook(new Book("1"));
		bookShelf.appendBook(new Book("2"));
		bookShelf.appendBook(new Book("3"));
		bookShelf.appendBook(new Book("4"));
		Iterator it=bookShelf.iterator();
		while(it.hasNext()){
			Book book=(Book)it.next();
			System.out.println(book.getName());
		}
	}

}
