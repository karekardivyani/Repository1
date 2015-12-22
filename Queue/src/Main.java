
public class Main {
public static void main(String args[])
{
	QueueArrays QArray= new QueueArrays();
	
	QArray.Enqueue(10);
	QArray.Enqueue(20);
	QArray.Enqueue(30);
	/*QArray.Enqueue(70);*/
	QArray.Dequeue();
	QArray.Dequeue();
	QArray.display();
}
}
