import java.util.ArrayList;

class EvenOddCheck{
	int getInt(String data) {
		int number = Integer.parseInt(data);
		return number;
	}

	boolean isEven(int data) {
		if (data % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	// to use dynamic length for input
	// i get erros with normal aray
}
public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddCheck eck = new EvenOddCheck();
		ArrayList<Integer>even=new ArrayList<Integer>();
		ArrayList<Integer>odd=new ArrayList<Integer>();
		String input = "[10,3,17,16,23,57,60,13]";
		int inputLength = input.length();
		String inputTrimmed = input.substring(1,inputLength-1);
		String inputArray[]= inputTrimmed.split(",");
		int numberArray[] = new int[inputArray.length];
		int index =0, temp;
		for(String data: inputArray) {
			numberArray[index]=eck.getInt(data);
			temp = numberArray[index];
			if (eck.isEven(temp)) {
				even.add(temp);
			}
			else {
				odd.add(temp);
			}
			index+=1;
		}
		
		System.out.print("Even Numbers : ");
		for(int data : even) {
			System.out.print(data + " ");
		}
		System.out.println("");
		
		System.out.print("Odd Numbers : ");
		for(int data : odd) {
			System.out.print(data + " ");
		}
	}

}
