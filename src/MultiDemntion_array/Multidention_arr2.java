package MultiDemntion_array;

import java.util.Arrays;
import java.util.Scanner;

public class Multidention_arr2 {

	public static char[] incrementArr(char[] arr) {
		char[] newArr = new char[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
public static int countSubAb(String subStr) {
	int abCounter=0;
	for (int i = 0; i < subStr.length()-1; i++) {
		if(subStr.charAt(i) =='b') {
			abCounter++;
		}
	}
	return abCounter;
}
public static int countSubAcb(String subStr) {
	int acbCounter=0;
	for (int i = 0; i < subStr.length()-1; i++) {
		if(subStr.charAt(i) =='c' && subStr.charAt(i+1) =='b') {
			acbCounter++;
		}
	}
	return acbCounter;
}
public static int countSubAbWithoutC(String subStr) {
	int abCounter=0;
	for (int i = 0; i < subStr.length(); i++) {
		if(subStr.charAt(i) =='c') {
			return abCounter;
		}
		if(subStr.charAt(i) =='b') {
			abCounter++;
		}
	}
	return abCounter;
}

	public static char[] insertCharToArr(String str ,char[] arr) {
		int i = 0, countSubAb=0, countSubAbWithoutC =0, countAcb=0;
		char ch;
		while (str.charAt(i) != '.') {
			if (str.charAt(i) == 'a') {
			countSubAb += countSubAb(str.substring(i));
			countSubAbWithoutC += countSubAbWithoutC(str.substring(i));
			countAcb += countSubAcb(str.substring(i));
			
			}
			ch = str.charAt(i);
			arr = incrementArr(arr);
			arr[arr.length - 1] = ch;
			i++;
		}
		System.out.println("countSubAb is: " + countSubAb);
		System.out.println("countSubAbWithoutC is: " + countSubAbWithoutC);
		System.out.println("countAcb is: " + countAcb);
		return arr;
	}

	public static void main(String[] args) {
		
		char[] arr = new char[0];
		Scanner in = new Scanner(System.in);
		String input = in.next();
		
		arr = insertCharToArr(input, arr);
		
		
		
		System.out.println(Arrays.toString(arr));
	}

}
