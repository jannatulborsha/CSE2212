package test;

import main.Sound;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SoundJunitTest {

	@Test
	void test() {
		
		Sound sound = new Sound();
		double result = sound.calculate();
		assertEquals(7920, result);
		
	}
}
