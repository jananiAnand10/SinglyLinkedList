public class LinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	public LinkedList(int value)
	{
		Node newNode=new Node(value);
		head=newNode;
		tail=newNode;
		length=1;
	}
	public  void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public void append(int value)
	{
		Node newNode=new Node(value);
		if(length==0)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
		tail.next=newNode;
		tail=newNode;
		}
		length++;
	}
	
	public Node removeLast()
	{
		Node pre=head;
		Node temp=head;
		if(length==0)
			return null;
		else
		{
		while(temp.next!=null)
		{
			pre=temp;
			temp=temp.next;
		}
		tail=pre;
		tail.next=null;
		length--;
		if(length==0)
		{
			head=null;
			tail=null;
		}
		}
		return temp;
	}
	
	public void prepend(int value)
	{
		Node newNode=new Node(value);
		if(length==0)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
		newNode.next=head;
		head=newNode;
		}
		length++;
	}
	
	public Node removeFirst()
	{
		if(length==0)return null;
		Node temp=head;
		head=head.next;
		temp.next=null;
		length--;
		if(length==0)
			tail=null;
		return temp;
	}
	
	public Node get(int index)
	{
		if(index<0 || index>=length)
			return null;
		else
		{
			Node temp=head;
			for(int i=0;i<index;i++)
			temp=temp.next;
			return temp;
		}
	}
	
	public boolean set(int index,int value)
	{
		Node temp=get(index);
		if(temp!=null)
		{
		temp.value=value;
		return true;
		}
		return false;
	}
	
	public boolean insert(int index,int value)
	{
		if(index<0 || index>length) return false;
		else if(index==0)
		{
			prepend(value);
			return true;
		}
		else if(index==length)
		{
			append(value);
			return true;
		}
		else
		{
			Node newNode=new Node(value);
			Node temp=get(index-1);
			newNode.next=temp.next;
			temp.next=newNode;
			length++;
			return true;
		}	
	}
	public Node remove(int index)
	{
		if(index<0 || index>=length)
			return null;
		else if(index==0)
			return removeFirst();
		else if(index==length-1)
			return removeLast();
		else
		{
		Node prev=get(index-1);
		Node temp=prev.next;
		prev.next=temp.next;
		temp.next=null;
		length--;
		return temp;
		}
	}
	
	public void reverse()
	{
		Node temp=head;
		head=tail;
		tail=temp;
		Node after=temp.next;
		Node before=null;
		for(int i=0;i<length;i++)
		{
			after=temp.next;
			temp.next=before;
			before=temp;
			temp=after; 
		}
	}
	
	public void getHead()
	{
		System.out.println("head : "+head.value);
	}
	public void getTail()
	{
		System.out.println("Tail : "+tail.value);
	}
	public void getLength()
	{
		System.out.println("Length : "+length);
	}
	//additional methods
	 public void removeDuplicates()
    {
        if(head==null)return;
        HashSet<Integer> unique=new HashSet<>();
        Node temp=head.next;
        Node prev=head;
        unique.add(head.value);
        while(temp!=null)
        {
            if(!unique.contains(temp.value))
            {
                unique.add(temp.value);
                prev=prev.next;
            }
            else
            {
                prev.next=temp.next;
                temp.next=null;
                temp=prev;
                length--;
            }
            temp=temp.next;
        }
    }
	 public int binaryToDecimal()
    {
        int num=0;
        Node temp=head;
        int i=length-1;
        while(temp!=null)
        {
            num+=temp.value*Math.pow(2,i);
            i--;
            temp=temp.next;
        }
        return num;
    }
 public void reverseBetween(int m,int n)
   {
       if(head==null)return;
       Node dummy=new Node(0);
       dummy.next=head;
       Node prev=dummy;
       for(int i=0;i<m;i++)
       {
           prev=prev.next;
       }
       Node current=prev.next;
       for(int i=0;i<n-m;i++)
       {
       Node moveTo=current.next;
       current.next=moveTo.next;
       moveTo.next=prev.next;
       prev.next=moveTo;
       
       }
       head=dummy.next;
   }
	
	 
}
