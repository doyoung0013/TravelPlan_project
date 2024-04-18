package test;

import java.util.*;

//각 지역들의 상위클래스
public class Location {
	private List<String> attraction;
	private Map<String, Integer> district= new HashMap<String, Integer>();
	//Map<해당지역명소, 예상관람시간>
	
	//getter, setter 메서드
	public List<String> getAttraction() {
		return attraction;
	}
	public void setAttraction(List<String> attraction) {
		this.attraction = attraction;
	}
	public void setDistrict(Map<String, Integer> district) {
		this.district = district;
	}
	public Map<String, Integer> getDistrict() {
		return district;
	}
	
	//랜덤 장소로 여행 시간표 짜주는 메서드
	void randomLocation(Location location, int startTime) {
		boolean lunchTime = false;
		//랜덤값을 Set 에 넣어 중복 장소 제거
		Set<Integer> randomSet = new HashSet<>();
		while(randomSet.size() != location.getAttraction().size()) {
			Random ran = new Random();
			int randomNum = ran.nextInt(location.getAttraction().size());
			randomSet.add(randomNum);
		}
		//Set 에 들어있는 랜덤 값을 받아와서 랜덤 명소 시간표 완성
		for(int num : randomSet) {
			String selectAttraction = location.getAttraction().get(num);
			System.out.printf("%02d:00 %s\n", startTime, selectAttraction);
			startTime += location.getDistrict().get(selectAttraction);
			
			if(!lunchTime && startTime>=12) { //12시 이후 점심시간 1시간 추가 (점심시간은 한 번만)
				System.out.printf("%02d:00 점심시간\n", startTime++);
				lunchTime = true;
			}else if(startTime>18) { //18시 이후에는 저녁시간 1시간 추가 후 종료
				System.out.printf("%02d:00 저녁시간\n", startTime);
				break;
			}
		}
			
	}
}
