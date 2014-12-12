package src;

public class Test
{
	public static void main(String[] args)
	{
		MList l1 = new Cons(1,
					new Cons(2,
					new Cons(3, new Nil())));
					
		MList l2 = new Cons(4,
					new Cons(5,
					new Cons(6, new Nil())));
					
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1.append(l2));
		System.out.println(l1.append(34));
		System.out.println(l1.has(5));
	}
}
