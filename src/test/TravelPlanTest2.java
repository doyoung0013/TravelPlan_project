package test;

import java.util.*;
import data.Busan;
import data.Gyeongju;
import data.Jeonju;

public class TravelPlanTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("어느 지역을 여행하실 계획인가요?");
		System.out.println("가능한 지역 리스트: 전주, 경주, 부산");
		String locationName = sc.nextLine(); //지역 리스트 입력 받아옴
		Location location = ObjectReturn(locationName);
		if(location == null) return;
		
		System.out.println("몇 시부터 일정을 시작하실 예정이신가요? 숫자만 적어주세요. 일정은 12시 이전에 시작되어야 합니다.");
		int startTime;
		while(true) {
			startTime = sc.nextInt(); //일정 시작시간 입력 받아옴
			if(startTime<12) break;
			System.out.println("일정은 12시 이전에 시작되어야 합니다. 다시 적어주세요.");
		}
		sc.close();
		
		location.randomLocation(location, startTime);
		
	}

	//String 으로 받은 문자열을 객체로 변환하는 메서드
	private static Location ObjectReturn(String locationName) {
		switch(locationName) {
		case "전주":
			return new Jeonju();
		case "부산":
			return new Busan();
		case "경주":
			return new Gyeongju();
		default:
			System.out.println("리스트 내의 이름을 제대로 입력해주세요.");
			return null;
		}
		
	}

}