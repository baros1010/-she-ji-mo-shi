package Iterator;

public class BookShelfIterator implements Iterator {
	private BookShelf bookSelf;
	private int index;
	public BookShelfIterator(BookShelf bookSelf){
		this.bookSelf=bookSelf;
		this.index=0;
	}
	@Override
	public boolean hasNext() {
		if(index<bookSelf.getLength()){
			return true;
		}
		else{
			return false;
		}
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public Object next() {
		// TODO 自動生成されたメソッド・スタブ
		Book book=bookSelf.BookAt(index);
		index++;
		return book;
	}

}
