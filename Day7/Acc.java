package pack1;

  class Parent{
	  
	public void ass() {
		System.out.println("heii");
	}
}

 public class Acc {

	private  void display() {
		System.out.println("this is welcome class display method");
	}
	public static void main(String[] args) {
		
	      Acc wel = new Acc();
	         Parent p= new Parent();
                 	//wel.assign();
                 	wel.display();
}
}