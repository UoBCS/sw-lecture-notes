package src;

public class Nil<E> implements MList<E>
{
	public Nil() {}
	
	public boolean isEmpty()
	{
		return true;
	}

	public int size()
	{
		return 0;
	}
	
	public MList<E> reverse()
	{
		return this;
	}
	
	public MList<E> append(MList<E> l)
	{
		return l;
	}
	
	public MList<E> append(E el)
	{
		return new Cons<E>(el, this);
	}
	
	public boolean has(E el)
	{
		return false;
	}
	
	public String toString()
	{
		return "Nil";
	}
}
