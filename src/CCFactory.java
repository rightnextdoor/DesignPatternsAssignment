
public class CCFactory {
	
	public CCFactory(String number, String date, String name) {
		createCard(number,date,name);
	}

	public static void createCard(String number, String date,String name) {
		CreditCardInfo cc = null;
		
		String fourDigits = "";
		for(int i = 0; i < 4; i++) {
			fourDigits += number.charAt(i);
		}
		
		if(number.length() == 0 || number.length() > 17) {
			System.out.println("Unable to instantiate from know credit types: "
					+ number + "," + date +"," + name);
		} else if (isMasterCard(number,fourDigits)) {
			cc = new MasterCC(number,date,name);
		}else if (isVisa(number,fourDigits)) {
			cc = new VisaCC(number,date,name);
		}else if (isAmericanExpress(number,fourDigits)) {
			cc = new AmExCC(number,date,name);
		}else if (isDiscover(number,fourDigits)) {
			cc = new DiscoverCC(number,date,name);
		} else {
			System.out.println("Unable to instantiate from know credit types: "
					+ number + "," + date +"," + name);
		}
	}
	
	private static boolean isMasterCard(String number,String fourDigits) {
		if (number.length() != 16)
			return false;
		return(((fourDigits.charAt(0) == '5')||(fourDigits.charAt(0) == '2')) && (fourDigits.charAt(1) == '1' ||
				fourDigits.charAt(1) == '2' || fourDigits.charAt(1) == '3' ||
				fourDigits.charAt(1) == '4' || fourDigits.charAt(1) == '5'));
	}
	
	private static boolean isVisa(String number,String fourDigits) {
		if ((number.length() == 16) || (number.length() == 13))
			return (fourDigits.charAt(0) == '4');
		return false;
		}
	
	private static boolean isAmericanExpress(String number,String fourDigits) {
		if (number.length() != 15)
			return false;
		return((fourDigits.charAt(0) == '3') && ((fourDigits.charAt(1) == '4' ||
				fourDigits.charAt(1) == '7')));
	}
	
	private static boolean isDiscover(String number,String fourDigits) {
		if (number.length() != 16)
			return false;
		return(fourDigits.equals("6011"));
	}

}
