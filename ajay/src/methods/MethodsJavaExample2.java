package methods;



public class MethodsJavaExample2 {
int var1=30;
int var2=20;

public void Addition() 
	{
	int var1=10;
	var1=50;
	int var2=20;
	int var3;
	var3=var1+var2;
	System.out.println("The value of the variable var3 after addition is:-"+var3);
}
public static void main(String[] args) {
	MethodsJavaExample2 m2= new MethodsJavaExample2();
	m2.Addition();
	m2.Subtraction();
	m2.Multiplication();
	m2.Division();
	m2.Multiplication();
}

	

void Division() {
	// TODO Auto-generated method stub
	int var1=100;
	int var2=10;
	int var3;
	var3=var1/var2;
	System.out.println("The value of the variable var3 after division is :-"+var3);
	
}
void Multiplication() {
	// TODO Auto-generated method stub
	int var3;
	var3=var1*var2;
	System.out.println("The value of the variable var3 after multiplication is :-"+var3);
}
private void Subtraction() {
	// TODO Auto-generated method stub
	int var1=10;
	int var2=20;
	int var3;
	var3=var1-var2;
	System.out.println("The value of the variable var3 after substraction is:-"+var3);
}}

	


