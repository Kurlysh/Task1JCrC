
public class YearToCentury {

	public static void main(String[] args) {
        System.out.println(century(1234));
	}
	
	public static int century(int year) {
		int result = (year % 100 == 0) ? year / 100 : year / 100 + 1;
	    return result;
	}
}
