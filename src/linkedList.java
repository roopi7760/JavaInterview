class listNode
{
	private int data;
	private listNode next;
	public listNode(int data)
	{
		this.data = data;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setNext(listNode next){
		this.next = next;
	}
	
	public listNode getNext()
	{
		return this.next;
	}
	
	public int listLength(listNode head)
	{
		int length = 0;
		
		listNode currentNode = head;
		while(currentNode != null)
		{
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
}
public class linkedList {

	
	public static void main(String args[])
	{
		
	}
}
