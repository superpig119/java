public class Welcome{
	public static void main(String[] args){
		String[] greeting = new String[3];
		greeting[0] = "Welcome to Core Java";
		greeting[1] = "by Cay HOrstmann";
		greeting[2] = "and Gary COrnell";
		
		for(String g : greeting)
			System.out.println(g);
	}
}
