
public class Car {

int price;
Subsystem sub =new Subsystem();
AudioDevices dev=new AudioDevices ();
public int getCarprice()
{
	price=sub.getprice()+dev.getprice();
	return price;
}
	
}
