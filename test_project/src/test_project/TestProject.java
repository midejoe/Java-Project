package test_project;

public class TestProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// flow control statements
		
		if (20>18)
		{
				System.out.println("20 is greater than 30");
		}
		int a  = 10;
		float b = 10.3f;
		int marks = 65;
		
		if(marks < 50) {
			System.out.println("Fail");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("D Grade");
		}
		else {
			System.out.println("invalid");
		}
		if (a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("a is less than b");
		}
		
		
		int n = 5;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		System.out.println("This is Sparta!!");
		
		//arithmetic operators
		
		int d = 20;
		float f = 5.2f;
		
		System.out.println(d/f);
		
		// arrays
		
		char[] g = new char[5];
		
		g[0]='a';
		g[1]='b';
		g[2]='c';
		g[3]='d';
		g[4]='e';
		
		for(int i=0;i<5;i++) {
			System.out.println(g[i]);
		}
		
		int[] h =new int[5];
		for(int i= 0;i<5;i++) {
			h[i] = i;	
		}
		for(int i =0;i<5;i++) {
			System.out.println(h[i]);
	
		}
		
		// logical operators
		
		boolean x1 = true;
		boolean v8 = false;
		
		System.out.println(x1&&v8);
		
		System.out.println(x1||v8);
		
		
		// multi-dimensional array
		
		int [][] k = new int[3][3];
		int num = 1;
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				k[i][j] = num;
				++num;
			}
		}
		
		for(int i= 0; i<3; i++)
		{
			for(int j=0; j<3;j++)
			{
				System.out.print(k[i][j] + " ");
			}
			System.out.println();
		}
		
		// call a function
		sparta();
		
		//call a function with parameters
		int l =20;
		float m= 60.1f;
		add(l,m);
		
		// create an instance 
		TestProject obj = new TestProject();
		
		int o =10;
		int p =20;
		
		int new_result = obj.sub(o, p);
		
		System.out.println(new_result);
		
		// swap values
		
		int v = 10;
		int x = 20;
		
		swapFunction(v, x);
		
		//method overloading
		
		int m1 = 99;
		int m2 = 22;
		float m3 =23.3f;
	
		
		int area_result = obj.area(m1,m2);
		
		float area_circle = obj.area(m3);
		
		System.out.println("Area of Rectangle is : "+ area_result);
		
		System.out.println("Area of Circle is : "+ area_circle);
		
		int v1=10;
		int v2=20;
		
		int max = v1>=v2?v1:v2;
		
		System.out.println("Max: "+ max);
		
		// ArrayOutOfBoundsException
		int[] arr = new int[2];
		
		arr[0] =10;
		arr[1] =20;
		
		for(int i =0; i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void sparta() {
		
		System.out.println("This is a sparta!!");
	}
	public static void add(int l, float m) {
		System.out.println(l+m);
	}
	
	public int sub( int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	// swap number
	
	public static void swapFunction(int r, int t) {
		System.out.println("Before swap: r:" +r+ " t:" +t);
		int e = r;
		r = t;
		t = e;
		
		System.out.println("After swap: r:" +r+ " t:" +t);
	}
	
	public int area(int m,int n) {
		int result = m*n;
		return result;
	}
	
	public float area(float p) {
		float result = 3.14f*p*p;
		return result;
	}
}
