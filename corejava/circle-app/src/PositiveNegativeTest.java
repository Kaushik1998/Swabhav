import java.util.ArrayList;

class PositiveNegativeCheck{
	int getInt(String data) {
		int number = Integer.parseInt(data);
		return number;
	}
	
	boolean isPositive(int data) {
		if (data>0) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class PositiveNegativeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveNegativeCheck eck = new PositiveNegativeCheck();
		ArrayList<Integer>positive=new ArrayList<Integer>();
		ArrayList<Integer>negative=new ArrayList<Integer>();
		String input = "[-3,16,20,54,-6,-23,10]";
		int inputLength = input.length();
		String inputTrimmed = input.substring(1,inputLength-1);
		String inputArray[]= inputTrimmed.split(",");
		int numberArray[] = new int[inputArray.length];
		int index =0, temp;
		for(String data: inputArray) {
			numberArray[index]=eck.getInt(data);
			temp = numberArray[index];
			if (eck.isPositive(temp)) {
				positive.add(temp);
			}
			else {
				negative.add(temp);
			}
			index+=1;
		}
		
		System.out.print("Positive Numbers : ");
		for(int data : positive) {
			System.out.print(data + " ");
		}
		System.out.println("");
		
		System.out.print("Negative Numbers : ");
		for(int data : negative) {
			System.out.print(data + " ");
		}
	}

}
