//Java Thread Example by extending Thread class
/*

	class Multi2 extends Thread{
		public void run(){
			System.out.println(" Thread is started 1 ");
		}
	
	public static void main(String[] args) {
		
	Multi2 m1= new Multi2();
	m1.start();

	}

}
*/

//Java Thread Example by implementing Runnable interface
class multi implements Runnable{
	public void run(){
		System.out.println(" Thread is started 1 2 ");
	}

public static void main(String[] args){
	multi m1= new multi();
	Thread t1=new Thread(m1);
	t1.start();
}
}
