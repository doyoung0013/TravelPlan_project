package data;

import java.util.ArrayList;
import java.util.List;

import test.Location;

public class Jeonju extends Location{
	
	public Jeonju() {
		getDistrict().put("전주 한옥마을", 3);
		getDistrict().put("전주 동물원", 2);
		getDistrict().put("경기전", 2);
		getDistrict().put("객리단길", 2);
		getDistrict().put("전주 수목원", 2);
		getDistrict().put("자만 벽화마을", 1);
		getDistrict().put("남부 야시장", 1);
		getDistrict().put("전동성당", 1);
		getDistrict().put("전주 난장", 1);
		getDistrict().put("전주 덕진공원", 1);
		List<String> attraction = getAttraction();
		attraction = new ArrayList<>(getDistrict().keySet());
		setAttraction(attraction);
	}
}