package methods;

public class MethodExample4 {
 private void multiplication()
 {
	 int var1=20;
	 int var2=10;
	 int var3;
	 var3=var1*var2;
	 System.out.println("The value of  var3 ofter multiplication is:-"+var3);
 }
 public static void main(String[] args) {
	MethodExample4 m4=new MethodExample4();
	m4.multiplication();
	m4.subtraction();
	m4.subtraction(40, 20);
 }
	public void subtraction() {
		int var1=20;
		int var2=10;
		int var3;
		var3=var1-var2;
		System.out.println("The alue of var3 after subtraction is:-"+var3);
	}
	public void subtraction(int var1,int var2)
	{
		int var3;
		var3=var1-var2;
		System.out.println("The alue of var3 after subtraction is:-"+var3);
	


	
	}}

