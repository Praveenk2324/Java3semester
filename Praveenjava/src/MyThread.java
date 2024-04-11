
public class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		
	 this.name=name;
	}
	public void run()
	{
		for (int i=0;i<5;i++) {
			System.out.println(name+" - "+i);
			try {
				Thread.sleep(1000);
			}catch(TnterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	

