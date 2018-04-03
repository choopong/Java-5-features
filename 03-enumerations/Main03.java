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

        System.out.println(DayWithColor.MONDAY.getColor());

        System.out.println(PRODUCT.APPLE.IPHONE_8);
    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    //Enum with function
    public enum DayWithColor {
        SUNDAY {
            public String getColor() {
                return "Red";
            }
        },
        MONDAY {
            public String getColor() {
                return "Yellow";
            }
        },
        TUESDAY {
            public String getColor() {
                return "Pink";
            }
        },
        WEDNESDAY {
            public String getColor() {
                return "Green";
            }
        },
        THURSDAY {
            public String getColor() {
                return "Orange";
            }
        },
        FRIDAY {
            public String getColor() {
                return "Blue";
            }
        },
        SATURDAY {
            public String getColor() {
                return "Purple";
            }
        };
        public abstract String getColor();
    }

    //Nested Enum
    public enum PRODUCT {
        SONY;
        enum APPLE {
            IPHONE_8,
            IPHONE_X
        }
        enum SAMSUNG {
            S7,
            S8
        }
    }
}
