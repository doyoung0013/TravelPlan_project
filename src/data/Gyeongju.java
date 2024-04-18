package data;

import java.util.ArrayList;
import java.util.List;

import test.Location;

public class Gyeongju extends Location{
	
	public Gyeongju() {
		getDistrict().put("황리단길", 3);
		getDistrict().put("동궁과 월지(안압지)", 2);
		getDistrict().put("월정교", 2);
		getDistrict().put("첨성대", 2);
		getDistrict().put("불국사", 2);
		getDistrict().put("경주월드", 3);
		getDistrict().put("경주버드파크", 1);
		getDistrict().put("석굴암", 1);
		getDistrict().put("경주 루지월드", 1);
		getDistrict().put("또봇 정크아트 뮤지엄", 1);
		List<String> attraction = getAttraction();
		attraction = new ArrayList<>(getDistrict().keySet());
		setAttraction(attraction);
	}
}
