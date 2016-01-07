
public class AudioDevices {
	
	int price;
	
	Antenna antenna=new Antenna();
	MediaPlayer player=new MediaPlayer();
	
	public int getprice()
	{
		price=antenna.getAprice()+player.getPlayerprice();
		return price;
	}
	
}
