import java.util.ArrayList;
import java.util.List;

public class VisaCC extends CreditCardInfo {

	public VisaCC(String number,String date, String name) {
		super(number,date,name);
		List<String> cards = new ArrayList<>();
		String info = "Visa Card: " + number + "," + date + "," +name;
		cards.add(info);
		System.out.println(info);
	}
}
