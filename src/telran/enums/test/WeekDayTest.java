package telran.enums.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.enums.WeekDay;

class WeekDayTest {

	@Test
	void testSwitchStatement() {
		String expected = "Weekend";
		assertEquals(expected, getDayDescriptionSwitchStatement(WeekDay.SAT));
	}
	
	@Test
	void testSwitchEspression() {
		String expected = "Working day";
		assertEquals(expected, getDayDescriptionSwitchEspression(WeekDay.MON));
	}

	private String getDayDescriptionSwitchStatement(WeekDay day) {
		String res = "Working day";
		switch (day) {
		case SUN:
			res = "Weekend if you live not in Israel";
			break;
		case FRI:
			res = "Weekend if you live in Israel";
			break;
		case SAT:
			res = "Weekend";
			break;
		default:
			break;
		}
		return res;
	}
	
	private String getDayDescriptionSwitchEspression(WeekDay day) {
		// ! красивый синтаксис switch лямбда-выражения
		String res = switch(day) {
		case SUN -> "Weekend if you live not in Israel";
		case SAT -> "Weekend";
		case FRI -> "Weekend if you live in Israel";
		default -> "Working day";
		};
		
		return res;
	}

}
