package src;

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
		return 1 + tail.size();
	}
	
	public MList<E> reverse()
	{
		return tail.reverse().append(head);
	}
	
	public MList<E> append(MList<E> l)
	{
		return new Cons<E>(head, tail.append(l));
	}
	
	public MList<E> append(E el)
	{
		return append(new Cons<E>(e , new Nil<E>()));
	}
	
	public boolean has(E el)
	{
		return head.equals(e) || tail.has(e);
	}
	
	public String toString()
	{
		return "Cons(" + head + ", " + tail + ")";
	}
}
