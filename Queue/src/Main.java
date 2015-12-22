
public class Main {
public static void main(String args[])
{
	QueueArrays QArray= new QueueArrays(3);
	QueueArrayList QArray1=new QueueArrayList();
	
	QArray.Enqueue(10);
	QArray.Enqueue(20);
	QArray.Dequeue();
	QArray.display();
}
}
