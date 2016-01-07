
public class Subsystem {

      int price;
	String type="Door";
	Handle handle=new Handle();
	DoorShield doorS=new DoorShield();
	
	public int getprice()
	{
		price=handle.getHandleprice()+doorS.getDoorShieldprice();
		return price;
	}
	
}

