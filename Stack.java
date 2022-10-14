public class Stack{
	private Node top;
	private int max=5;

	public void push(int x) 
    { 
		if(top==null)
		{
			Node n = new Node();
			n.setData(x);
			top = n;
			max--;
		}
			else if(max <= 0)
			{
				System.out.println("stack overflow");
			}
		
			else
			{
				Node n = new Node();
				n.setData(x);
				n.setNext(top);
				top = n;
				max--;
			}
    } 
	
	public int pop() 
    { 
       if (top==null)
	   {
		   return 0;
	   }
		   int get = top.getData();
		   top=top.getNext();
		   max++;
		   return get;
	   
    } 
	
	public void print() 
    { 
       Node temp= top;
	   while (temp != null)
	   {
		   System.out.println(temp.getData());
		   temp=temp.getNext();
	   }
    } 

}