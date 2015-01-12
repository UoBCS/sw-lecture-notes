public class Cons<E> implements MList<E>
{
	private final E head;
	private final MList<E> tail;
	
	public Cons(E head, MList<E> tail)
	{
		this.head = head;
		this.tail = tail;
	}
	
	public boolean isEmpty()
	{
		return false;
	}

	public int size()
	{
		return 1 + this.size();
	}
	
	public MList<E> reverse()
	{
		return null; // TODO
	}
	
	public MList<E> append(MList<E> l)
	{
		return new Cons(head, tail.append(l));
	}
	
	public MList<E> append(E el)
	{
		return new Cons(head, tail.append(el));
	}
	
	public boolean has(E el)
	{
		return el == head || tail.has(el);
	}
	
	public String toString()
	{
		return "Cons(" + head + ", " + tail + ")";
	}
}
