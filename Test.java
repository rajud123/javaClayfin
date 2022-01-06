import java.util.Arrays;

public class Test {
static int count= 0;
	public static void main(String[] args) {
		
		String s1 = "hello";
		String rev ="";
		char [] ch1 = s1.toCharArray();
		for(int i=ch1.length-1;i>=0;i--){
		rev= rev+ch1[i];
		}
		
		System.out.println(rev);
String s ="hello";
s.concat("world");
System.out.println(s);//hello
//here the output is hello as string is immutable and any chnages on it will create a new object so with a new object will bre created
//but it is not refrencing to any variable so it will be garbage collected and the output is hello
String string = s.intern();
//intern() method will create an exact copy of string  
//as it also contains same content so no new object will be created it will pointed to the same object in constant pool 
System.out.println(string);
System.out.println(s==string);
String input = "Sample";

char[] charArray = input.toCharArray();
String newString ="";
for(int i=0;i<charArray.length;i++) {
	if(i%2==0) {
		charArray[i]=charArray[i];
		newString=newString+charArray[i];
	}
	else {
		charArray[i]='*';
		newString=newString+charArray[i];
	}

}
//System.out.println(charArray);
//System.out.println(Arrays.toString(charArray));
System.out.println(newString);
System.out.println(newString.getClass());
Test test = new Test();

 test.countEmps();
 System.out.println(test.sumOfDigits(97));

	}//main

	public void countEmps() {
		System.out.println("hi");
		while(!(count<0)) {
			new Employee();
			count++;
			//System.out.println(count);
			if(count>5) {
				System.out.println("5 emps objects are created");
				break;
			}//if
		}//while
	}//countEmps
	
	public int sumOfDigits(int num) {
		int totalSum =0;
		if(num<10) {
			totalSum=num;
			System.out.println("hello");
		}
		else {
			System.out.println("ji");
			while(num>0) {
			totalSum = totalSum+(num%10);
			num=num/10;
			if(totalSum>10) {
				totalSum = sumOfDigits(totalSum);
			}//if
			}//while
		}//else
		return totalSum;
	}
	
}//class
class Employee{
	 
}
