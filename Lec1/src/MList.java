package src;

public interface MList<E>
{
	public boolean isEmpty();
	public int size();
	public MList<E> reverse();
	public MList<E> append(MList<E> l);
	public MList<E> append(E el);
	public boolean has(E el);
}
