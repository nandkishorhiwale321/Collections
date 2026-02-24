package logical;

public class T_hreade {
	public static void main (String [] args) throws InterruptedException
	{
		DemoT d= new DemoT();
		DemoT d2= new DemoT();
		DemoT d3= new DemoT();
		DemoT d4= new DemoT();
		d.start();
		d2.start();
		d3.start();
		d4.start();
		
		
		int count=0;
		while(count<150) {
			Thread.sleep(1500);
			System.out.println("keshv");
			count++;
		}
		
		
	}

}
class DemoT extends Thread
{
	public void run() {
		for(int i =0; i<150;i++) {
			try {
			Thread.sleep(1500);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("omaaaaaaa");
		}
	}
}
