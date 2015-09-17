
package main_package;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int GetInteger() {
		return value;
	}

	private static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	private static boolean isPrime(int value) {
		boolean prime = true;
		int absval = Math.abs(value);
		int divider = 2;
		for (int i = 1; i < absval-1; i++) {
			if ((absval % divider) == 0)
				prime = false;
			divider++;
		}
		return prime;
	}
	
	public boolean isEven(){
		return isEven(value);
	}
	
	public boolean isOdd(){
		return isOdd(value);
	}
	
	public boolean isPrime(){
		return isPrime(value);
	}
	
	public static boolean isEven(MyInteger i){
		return isEven(i.value);
	}
	
	public static boolean isOdd(MyInteger i){
		return isOdd(i.value);
	}
	
	public static boolean isPrime(MyInteger i){
		return isPrime(i.value);
	}
	
	public boolean equals(int x){
		if (x == value){
			return true;
		}else{
			return false;
		}	
	}
	
	public boolean equals(MyInteger x){
		if (x.value == value){
			return true;
		}else{
			return false;
		}	
	}
	
	public int parseInt(String s) {
		return Integer.parseInt(s);
	}
	
	public int parseInt(char[] c) {
		int sum = 0;
		for( int i : c) {
		    sum += i;
		}
		return sum;
	}
	
}
