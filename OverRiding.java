

 class OverRiding {
	void run(){
		System.out.println("Vehicle is running");
		}
}
 class Bike extends OverRiding{
		void run(){
			System.out.println("Bike is running ");
		}
 }
	class TestOverRiding{
	public static void main(String[] args){
		Bike b= new Bike();
		b.run();		
}
	}


