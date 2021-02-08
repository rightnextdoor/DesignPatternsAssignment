import java.util.ArrayList;
import java.util.List;

public class MasterCC extends CreditCardInfo {

	public MasterCC(String number,String date, String name) {
		super(number,date,name);
		List<String> cards = new ArrayList<>();
		String info = "MasterCard: " + number + "," + date + "," +name;
		cards.add(info);
		System.out.println(info);
	}
}
