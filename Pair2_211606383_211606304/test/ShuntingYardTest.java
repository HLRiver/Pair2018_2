import static org.junit.Assert.*;

import org.junit.Test;

public class ShuntingYardTest {

	@Test
	public void Calc() {
		assertEquals("27", new ShuntingYard().Calc("(1 +2) ��3��(1 +2)"));
	}

}
