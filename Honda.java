
public class Honda {
	void run(){
		System.out.println("honda is running");
	}
}
	class shine extends Honda{
		void run (){
			System.out.println("shine is Running");
		}
	}
	class TestHonda{
	public static void main(String[] args) {
		//Honda h= new shine();
		Honda s =(shine) new shine();
		//h.run();
		s.run();
	}
}
