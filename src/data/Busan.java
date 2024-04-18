package data;

import java.util.ArrayList;
import java.util.List;

import test.Location;

public class Busan extends Location{
	
	public Busan() {
		getDistrict().put("감천문화마을", 3);
		getDistrict().put("태종대", 2);
		getDistrict().put("광안리 해수욕장", 2);
		getDistrict().put("용두산 공원", 2);
		getDistrict().put("자갈치시장", 2);
		getDistrict().put("부산 국제시장", 1);
		getDistrict().put("부산타워 전망대", 1);
		getDistrict().put("부산민주공원", 1);
		getDistrict().put("송도해상 케이블카", 1);
		getDistrict().put("부산 어린이 대공원", 1);
		List<String> attraction = getAttraction();
		attraction = new ArrayList<>(getDistrict().keySet());
		setAttraction(attraction);
	}
}