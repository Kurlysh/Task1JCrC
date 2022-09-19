public class Numbers {
	
	public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
	
	public static int sumOfDigits(int number) {
		int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
	    return sum;
	}
}
