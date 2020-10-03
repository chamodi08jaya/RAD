import java.util.Scanner;
class Calculator{
	public void add(int x,int y){
		System.out.println("x+y="+(x+y));
	}
	public void sub(int x,int y){
		System.out.println("x-y="+(x-y));
	}
	public void mul(int x,int y){
		System.out.println("x*y="+(x*y));
	}
	public void div(int x,int y){
		System.out.println("x/y="+(x/y));
	}
	public void reverseNumber(int x){
		int  a = 0,m;
		
        while(x > 0)
        {
            m = x % 10;
            a = a * 10 + m;
            x = x / 10;
        }
		System.out.print("Reversed No:"+a);
	}
	
	public static void main (String args[]){
		
		Calculator c=new Calculator();
		Scanner obj1=new Scanner(System.in);
		
		System.out.println("Enter First Value :");
		int x=obj1.nextInt();
		
		
		System.out.println("Enter operator +,-,*,/ or r:");
		char z=obj1.next().charAt(0);
		if(z==z){
			System.out.println("Enter Second Value :");
			int y=obj1.nextInt();
		
		switch(z) {
			
		case '+':
			
			c.add(x,y);
			break;
		case '-':
			
			c.sub(x,y);
			break;
		case '*':
			
			c.mul(x,y);
			break;
		case '/':
			
			c.div(x,y);
			break;
			
		default:
			c.reverseNumber(x);
			
		return;
		}
		
		}
		
		
		
		
		
	}
}