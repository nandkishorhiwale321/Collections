package vector;
import java.util.Vector;
import java.util.Scanner;


public class Three {
	public static void main(String [] args) {
		
				
		Scanner sc = new Scanner(System.in);
		MettingRoom room =new MettingRoom();
		
        

		

		room.joinRoom("Nanda");
		room.joinRoom("Rakesh");
		room.joinRoom("Rani");
		room.joinRoom("Dolly");
		room.joinRoom("Pritam");
		room.joinRoom("Nagesh");
		
		room.OnlineUsers();
		
		room.total();
		
		room.LeaveRoom("Aa");
		
		room.total();
		//room.LeaveRoom("Nanda");
		
		room.total();
		
		room.joinRoom("Nanda");
		
		
		
		
		
		
	}


}
class MettingRoom {
	private static Vector <String> online = new Vector<String>();

	public static  void joinRoom(String name) {
		if(!online.contains(name)) {
		online.add(name);
		System.out.println(name+" join the metting");}
		else {
			System.out.println("You are already in the meetting");
		}
	
		}
	public static void LeaveRoom(String name) {
		
		
		if (online.contains(name)) {
			online.remove(name);
		
		System.out.println(name+" Leave the meatting..!");
		}
		else {
			System.out.println("You are not in the metting"+name);
		}
	}
	
	public static void OnlineUsers() {
		System.out.println("Active users is :"+online);
		//System.out.println(online.size());
	}
	public static  void total()
	{
		System.out.println("Total Present members :"+online.size());
	}
	
	
}
