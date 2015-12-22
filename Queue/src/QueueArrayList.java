import java.util.ArrayList;

public class QueueArrayList {

	ArrayList QArray=new ArrayList();
	
	public void Enqueue(int data)
	{
		QArray.add(data);
	}
	
	public  int  Dequeue() {
		return (int) QArray.remove(0);
		}
	
	public boolean IsEmpty()
	{
		return QArray.isEmpty();
	}
	public void display()
	{
		System.out.println("Queue= "+QArray);
	}
}
