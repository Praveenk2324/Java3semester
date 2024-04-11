enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumExample{ 
//	public static void main(String[] args) {
//		Day[] days=Day.values();
//		for(Day day:days) {
//			System.out.println(day);
//		}
	public static void main(String[] args) {
		String dayname="FRIDAY";
		Day day=Day.valueOf(dayname);
		System.out.println(day);

}
}