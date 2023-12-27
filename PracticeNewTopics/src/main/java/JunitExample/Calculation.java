package JunitExample;

public class Calculation {
	
	public int findMax(int arr[]) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++ ) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Calculation calc = new Calculation();
	}

}
