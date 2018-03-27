package Generator;

public class PersonGenerator implements Generator<Person>{
	  public PersonGenerator() {  }
	  private Class[] types=new Class[]{Person.class};
	@Override
	public Person next() {
		// TODO 自動生成されたメソッド・スタブ
		try {
			return (Person)types[0].newInstance();
		} catch (InstantiationException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	     return null;
	}
	   public static void main(String[] args) {
	        PersonGenerator generator = new PersonGenerator();
	        Person person = generator.next();
	        person.setId("1");
	        person.setName("johnnie");
	        person.setSex("Man");
	        System.out.println(person);
	    }

}
