package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void test1() {
		DataAnalysis dataAnalysis = new DataAnalysis(); 
		ArrayList<String> values = new ArrayList<String>(); 
		values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "29", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		//assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				//result.contains("The name of the homecity is big and the participant is 30 or older"));
		System.out.println(dataAnalysis.getResulStringHomecityAndAge(values));
		String result1 = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue(result1.contains("The name of the homecity is big and the participant is younger than 30"));
		System.out.println(dataAnalysis.getResultStringNamesAndAge(values));
		String result2 = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue(result2.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		//values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "29", "Fortaleza"));
		String result5 = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue(result5.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		
		
		ArrayList<String> secondValues = new ArrayList<String>();
		secondValues.addAll(Arrays.asList("Test Game", "Rafae", "Silva", "F", "31", "Goa"));
		//System.out.println(dataAnalysis.buildFinalString(secondValues)); 
		String result3 = dataAnalysis.buildFinalString(secondValues);
		String result4 = dataAnalysis.getResulStringHomecityAndAge(secondValues);
		System.out.println(result4);
		assertTrue(result4.contains("The name of the homecity is small and the participant is 30 or older"));
		//System.out.println(dataAnalysis.getResulStringHomecityAndAge(values));
		
		ArrayList<String> thirdValues = new ArrayList<String>();
		thirdValues.addAll(Arrays.asList("Test Game", "Rafael", "Silva", "F", "29", "Goa"));
		String result6 = dataAnalysis.getResulStringHomecityAndAge(thirdValues);
		assertTrue(result6.contains("The name of the homecity is small and the participant is younger than 30"));
		
		ArrayList<String> fourthValues = new ArrayList<String>();
		fourthValues.addAll(Arrays.asList("Test Game", "Rafael", "Silva", "F", "31", "Stockholm"));
		String result7 = dataAnalysis.getResulStringHomecityAndAge(fourthValues);
		System.out.println(result7);
		assertTrue(result7.contains("The name of the homecity is big and the participant is 30 or older"));
		String result8 = dataAnalysis.getResultStringNamesAndAge(fourthValues);
		assertTrue(result8.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
	}

}
/*Game game = new Game();
		if (values.get(5).length()<5){
			if (game.getAgeFromInputValues(values)>=30){
				return "The name of the homecity is small and the participant is 30 or older";
			}else{
				return "The name of the homecity is small and the participant is younger than 30";
			}
		}else{
			
			if (game.getAgeFromInputValues(values)>=30){
				return "The name of the homecity is big and the participant is 30 or older";
			}else{
				return "The name of the homecity is big and the participant is younger than 30";
				
			}
			
*/
