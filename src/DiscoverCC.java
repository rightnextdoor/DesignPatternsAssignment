import java.util.ArrayList;
import java.util.List;

public class DiscoverCC extends CreditCardInfo {
	
	public DiscoverCC(String number,String date, String name) {
		super(number,date,name);
		List<String> cards = new ArrayList<>();
		String info = "Discover Card: " + number + "," + date + "," +name;
		cards.add(info);
		System.out.println(info);
	}

}
