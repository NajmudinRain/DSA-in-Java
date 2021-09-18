package vectorAndStack;
//arraylist grows 1.5 times when full but vectors increases by 2 times.
//vector synchronised each operation.

public class MainStackClass {
	public static void main(String[]args) throws Exception
	{
		

		MyStack<Integer> ms=new  MyStack<>();
		ms.push(18);
		ms.push(19);
		ms.push(20);
     int poped=ms.pop();
    System.out.println(poped);
   int peeked=ms.peek();
   System.out.println(peeked);
		
		
	}

}
