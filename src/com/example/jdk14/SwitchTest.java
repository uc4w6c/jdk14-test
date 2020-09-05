package com.example.jdk14;

class SwitchTest {
    public static void main(String[] args) {
		Day day = Day.WEDNESDAY;
		int j = switch (day) {
			case MONDAY  -> 0;
			case TUESDAY -> 1;
			default      -> {
				int k = day.toString().length();
				yield k;
			}
		};
        System.out.println(j);

        for (int i = 0; i < 10; i++) {
            int loopJ = switch (day) {
                case MONDAY  -> 0;
                case TUESDAY -> 1;
                default      -> {
                    int k = day.toString().length();
                    yield k;
                }
            };
            System.out.println(loopJ);
        }
    }
}

enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }
