public class Stack1
{
	static Node top;

	static void push(int data)
	{
		Node temp = new Node();
		temp.data = data;

		if(top == null)
		{
			top = temp;
			return;
		}

		temp.next = top;
		top = temp;
	}
	static void pop()
	{
		if(top == null)
		{
			return;	
		}
		Node temp = top;
		top = top.next;
		temp.next = null;
		temp = null;
		
	}
	static void display()
	{
		Node temp = top;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String [] args)
	{
		Stack1.push(2);
		Stack1.push(4);
		Stack1.push(6);
		Stack1.push(8);
		Stack1.push(10);
		Stack1.push(12);
		Stack1.push(14);
		Stack1.push(16);
		Stack1.push(18);
		Stack1.pop();
		Stack1.pop();
		Stack1.pop();


		Stack1.display();
	}
}
class Node
{
	int data;
	Node next;
}