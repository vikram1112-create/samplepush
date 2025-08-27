package logicalPrograms;

public class Logicalprogprac {
	public void fibonacci() {
	
		int a=0;
		int b= 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 10; i++) {
			int c = a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
	}
		
	//factorial problem
	public void factorial() {
		 int n = 5 ;
		 int fact =1;
		 for (int i = n; i>=1 ; i--) {	  
		 fact = fact*i;		
		}
		 System.out.println(fact);
	}
	public void oddevenNumbers() {
		int n = 89;
		int a = n%2;
		if (a==0) {
			System.out.println("n is even");
			
		} else {
        System.out.println("n is odd");
		}

	}
	
	//swapping numbers using temporary variables
	
	public void swapping() {
		int a = 1;
		int b= 2 ;
		System.out.println(a);
		System.out.println(b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
		
		//without using temporary variables
		int t = a;
		a= b;
		b= t;

	} 
	// to find the second highest number in an array
	public void secondhighestnumber() {
		int temp;
	  int array[]= {10,20,5,9,30,40,35};
	 int size = array.length;
	 System.out.println(size);
	 for (int i = 0; i < size; i++) {
		for (int j = i+1; j < size; j++) {
			if(array[i]>array[j]) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		System.out.println(array[size-2]);
	}
	 
	}
	//reversing string
	public void stringreverse() {
		String s = "rooms";
		String r = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			r = c+r;
		}
		System.out.println(r);

	}
	public void reversestring2() {
		String a = "education";
		String b = "";
		for (int i = a.length()-1; i>=0 ; i--) {
			char c = a.charAt(i);
			b = b+c;
		}
		System.out.println(b);

	}
	public void palindrome() {
		String s = "madam";
		String t ="";
		for (int i=s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			t = t+c;
		}
		System.out.println(t);
		if (s.equals(t)) {
			System.out.println("it is palindrome");
			
		}
	}
	public void intpalindrome() {
		int a = 1221;
		String b = "";
		String string = Integer.toString(a);
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			b = c+b;	
		}
		if (b.equals(string)) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("its not palindrome");
		}
	}
	public void starprinting() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public void addnumberofarray() {
		int num[] = {2,3,9,8,6,4,5,3,3,2};
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum+i ;
		}
     System.out.println(sum);
	}
	public void vowelprinter() {
		String p = "helloworld";
		String v = "aeiou";
		int length = p.length();
		for (int i = 0; i <length; i++) {
			char ch = p.charAt(i);
			for (int j = 0; j <v.length(); j++) {
				char vow = v.charAt(j);
				if (ch==vow) {
					System.out.print(ch);
				}
				
			}
				
			}
			
		}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		Logicalprogprac lp = new Logicalprogprac ();
		//lp.oddevenNumbers();
		//lp.swapping();
		//lp.secondhighestnumber();
		//lp.stringreverse();
		//lp.reversestring2();
		//lp.palindrome();
		//lp.intpalindrome();
		//lp.starprinting();
		//lp.addnumberofarray();
		lp.vowelprinter();
	}
	}



