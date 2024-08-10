public class LinkList {
	Node head;
	public LinkList()
	{
		this.head=null;
	}
	public void setHead(Node next)
	{
		this.head=next;
	}
	public Node getHead()
	{
		return head;
	}
	public boolean insert(int data)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		if (head==null)
		{
			head=newNode;
			return true;
		}
		else
		{
			Node temp=head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(newNode);
			
			return true;
		}	
	}
	public boolean insert(int data,int location)
	{
		Node newNode=new Node(data);
		if(newNode==null)
			return false;
		if(location<=0)
			return false;
		if(location==1)
		{
			newNode.setNext(head);
			head=newNode;
			return true;
		}

			Node prev=head;
			for(int i=1;i<location-1;i++)
			{
				prev=prev.getNext();
				if(prev==null)
				{
					return false;
				}
			}
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
			return true;
	}
	public boolean deletingFirstNode()
	{
		if(head==null)
			return false;
		else
		{
			Node temp=head;
			head=temp.getNext();
			return true;
		}
	}
	public boolean deletingNodeAtPosition(int position)
	{
		if(position<=0)
			return false;
		if(position==1)
		{
			deletingFirstNode();
			return true;
		}
		else
		{
			Node pre=head;
			Node delete=pre.getNext();
			for(int i=1;i<position-1;i++)
			{
				
				pre=delete;
				delete=delete.getNext();
				if(delete==null)
					return false;
			}
			pre.setNext(delete.getNext());
			return false;
		}
	}
	
	public void Reverse()
	{
		if(head==null || head.getNext()==null)
		return;
		Node prevNode=head;
		Node currNode=head.getNext();
		
		while(currNode!=null)
		{
		Node nextNode=currNode.getNext();
		currNode.setNext(prevNode);
		prevNode=currNode;
		currNode=nextNode;
		
		}
		head.setNext(null);
		head=prevNode;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	
	}

}
