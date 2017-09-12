public class Main {
	private int id;
	private String name;
	public Main(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(this.id);
		System.out.println(this.name);
	}
		
	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		int n=5;
		System.out.println(n);
		Main m=new Main(4,"XYZ");
	}

}
