public interface List<E>
{
	public boolean isEmpty();
	public int size();
	public List<E> reverse();
	public List<E> append(List<E> l);
	public List<E> append(E el);
	public boolean has(E el);
}
