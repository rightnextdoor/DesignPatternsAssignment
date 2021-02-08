import java.util.ArrayList;
import java.util.List;

public class AmExCC extends CreditCardInfo {

	public AmExCC(String number,String date, String name) {
		super(number,date,name);
		List<String> cards = new ArrayList<>();
		String info = "AmericanExpress Card: " + number + "," + date + "," +name;
		cards.add(info);
		System.out.println(info);
	}
}
