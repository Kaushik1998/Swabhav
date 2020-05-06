class EvenTest{
	int getInt(String data) {
		int number = Integer.parseInt(data);
		return number;
	}	
	boolean isOdd(int data) {
		if (data % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
public class PrintEvenInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenTest et = new EvenTest();
		String input=args[0];
		String inputArray[]=input.split("-");
		int numberArray[] = new int[inputArray.length];
		numberArray[0]= et.getInt(inputArray[0]);
		numberArray[1]=et.getInt(inputArray[1]);
		int start=numberArray[0],end=numberArray[1];
		if(et.isOdd(start)) {
			start+=1;
		}		
		while(start<=end) {
			System.out.print(start + " ");
			start+=2;
		}
	}
}