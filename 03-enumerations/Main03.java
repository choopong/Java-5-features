public class Main03 {
    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
        Day day2 = Day.TUESDAY;
        Day day3 = Day.MONDAY;

        for(Day d: Day.values()) {
            System.out.println(d);
        }

        System.out.println(Day.valueOf("MONDAY") == day1);

        System.out.println(day1 == day2);
        System.out.println(day1 == day3);

        System.out.println(day1);
    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }
}
