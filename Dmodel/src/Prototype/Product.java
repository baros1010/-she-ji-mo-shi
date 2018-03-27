package Prototype;

public interface Product extends Cloneable{
	public abstract void user(String name);
	public abstract Product createClone();

}
