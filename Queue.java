public class Queue
{
	static Node first;
	static void queue(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		
		if(first == null)
		{
			first = temp;
			return;
		}
		
		Node traverse = first;
		while(traverse.next != null)
		{
			traverse = traverse.next;
		}
		
		traverse.next = temp;
	}
	static void deque()
	{	
		if(first == null)
		{
			return;
		}
		
		Node temp = first;
		first = first.next;
		temp.next = null;
		temp = null;	
	}
	static void display()
	{
		Node traverse = first;
		while(traverse != null)
		{
			System.out.println(traverse.data);
			traverse = traverse.next;
		}
	}
	public static void main(String [] args)
	{
		Queue.queue(4);
		Queue.queue(6);
		Queue.queue(8);
		Queue.queue(10);
		Queue.queue(12);
		Queue.queue(14);
		Queue.queue(16);
		Queue.deque();
		
		
		Queue.display();
	}
}
class Node
{
	int data;
	Node next;
}
