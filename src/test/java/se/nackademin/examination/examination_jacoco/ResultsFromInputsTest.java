package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		resultsFromInputs.setResultForAge(30);
		resultsFromInputs.setResultForGender(1);
		resultsFromInputs.setResultForHomeCity(15);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
		assertEquals("The result should be 30", resultsFromInputs.getResultForAge(), 30);
		assertEquals(" The result should be 1", resultsFromInputs.getResultForGender(), 1);
		assertEquals(" The result should be 15", resultsFromInputs.getResultForHomeCity(),15);
		
		
	}
	
	

}
