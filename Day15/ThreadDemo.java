public class ThreadDemo {
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("slide show :"+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}