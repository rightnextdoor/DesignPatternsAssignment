import java.util.StringTokenizer;

public class CreditCard {
	
	static DiscoverCC discover;
	static VisaCC visa;
	static MasterCC master;
	static AmExCC amEx;

	public static void main(String[] args) {
		CCFactory cc;
		String [] lines = new String[5];
		lines[0] = "6011123412341454,07/22,John Doe"; // discover card
		lines[1] = "5106127412341451,04/10,Bill Smith"; // master card
		lines[2] = "4125687861138945,12/05,Bob Bob"; // visa card
		lines[3] = "341112341234145,06/13,Will Will"; // american
		lines[4] = "60111234123414,02/15,Mary Mary"; // unable
		
		String number;
		String date;
		String name;
		String[] values;
		
		for(int i = 0; i < lines.length; i++) {
			values = lines[i].split(",");
			number = values[0];
			date = values[1];
			name = values[2];
			cc = new CCFactory(number,date,name);
		}
	}
}
