package src;

public interface List<A> {
	public boolean isEmpty();         // Is the list empty?
	public int     size();            // Returns the number of elements of the list.
	public List<A> reverse();         // Returns a reversed copy of the list.
	public List<A> append(List<A> l); // Returns a new list with the list l appended.
  	public List<A> append(A a);       // Returns a new list with the element a appended.
  	public boolean has(A a);          // Is the value a an element of the list?
  	// Higher-order methods:
  	public List<A> filter(Predicate<A> p);      // Gets the sublist of elements satisfying the predicate.
  	public <B> List<B> map(Function<A,B> f);    // Applies a function to each element of the list.
  	public <B> B fold(Function2<A,B,B> f, B b); // Like in Ocaml, Haskell, and any functional laguage.
  	public boolean all(Predicate<A> p);         // Do all elements of the list satisfy the predicate p?
  	public boolean some(Predicate<A> p);        // Does some element of the list satisfy the predicate p?
  	public void forEach(Action<A> a);           // Applies an action (like printing) to each element of the list.
}
