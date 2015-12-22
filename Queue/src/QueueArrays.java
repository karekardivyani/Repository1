import java.util.*;
public class QueueArrays {
 int queue[];
 int front,rear,size,len;
 
 public QueueArrays()
 {
	 size=4;
	 queue=new int[size];
	 front=-1;
	 rear=-1;
	 len=0;
	 
 }
 public boolean IsEmpty()
 {
	 return front == -1;
 }
	public boolean IsFull()
	{
		return front==0 && rear == size -1;
	}
	
	public void Enqueue(int data)
	{
		if (rear == -1) 
        {
            front = 0;
            rear = 0;
            queue[rear] = data;
        }
        else if (IsFull())
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
            queue[++rear] = data; 
		System.out.println("Enqued element: " +queue[rear]);
	        
	        len++ ;
	}
	
	public void Dequeue()
	{
		if (IsEmpty())
	           throw new NoSuchElementException("Underflow Exception");
	        else 
	        {
	        	len--;
	            int data = queue[front];
	            System.out.println("The Dequed Element is "+data);
	            if ( front == rear) 
	            {
	                front = -1;
	                rear = -1;
	            }
	            else
	                front++;                
	          
	}
	}
	 public void display()
	    {
	        System.out.print("\nQueue = ");
	        if (len == 0)
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        for (int i = front; i <= rear; i++)
	            System.out.print(queue[i]+" ");
	        System.out.println();        
	    }

}
