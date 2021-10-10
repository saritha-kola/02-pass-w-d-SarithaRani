package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void testGetResultStringHomeandAge() {
		
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>(); 
		
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		
		//assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				//result.contains("The name of the homecity is big and the participant is 30 or older"));
		
		System.out.println(dataAnalysis.getResulStringHomecityAndAge(values));
		String homeCityAge = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue(homeCityAge.contains("The name of the homecity is big and the participant is younger than 30"));
		
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fortaleza"));
		homeCityAge = dataAnalysis.buildFinalString(values);
		System.out.println(homeCityAge);
		//assertTrue(homeCityAge.contains("The name of the homecity is big and the participant is 30 or older"));
		
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fort"));
		homeCityAge = dataAnalysis.getResulStringHomecityAndAge(values);
		System.out.println(homeCityAge);
		assertTrue(homeCityAge.contains("The name of the homecity is big and the participant is younger than 30"));
			
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fort"));
		homeCityAge = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue(homeCityAge.contains("The name of the homecity is big and the participant is younger than 30"));
		
	}
	
		@Test
		public void testAnalysisData() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>(); 
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fortal"));
		String result = dataAnalysis.buildFinalString(values);
		System.out.println(dataAnalysis.getResultStringNamesAndAge(values));
		String result2 = dataAnalysis.getResultStringNamesAndAge(values);
		//assertTrue(result2.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		}
		
		
		
		@Test
		public void testNameAnalysis() {
			
			DataAnalysis dataAnalysis = new DataAnalysis();
			ArrayList<String> values = new ArrayList<String>(); 
			values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "29", "Fortaleza"));
			
		System.out.println(dataAnalysis.getResultStringNamesAndAge(values));
		String result3 = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue(result3.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		}
		
		@Test
		public void testAnalysis() {
			
			DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> secondValues = new ArrayList<String>();
		secondValues.addAll(Arrays.asList("Test Game", "Rafae", "Silva", "F", "31", "Goa"));
		//System.out.println(dataAnalysis.buildFinalString(secondValues)); 
		String result4 = dataAnalysis.buildFinalString(secondValues);
		}
		
		@Test
		public void testData() {
			
			DataAnalysis dataAnalysis = new DataAnalysis();
			ArrayList<String> secondValues = new ArrayList<String>();
			secondValues.addAll(Arrays.asList("Test Game", "Rafae", "Silva", "F", "31", "Goa"));
			
		String result5 = dataAnalysis.getResulStringHomecityAndAge(secondValues);
		System.out.println(result5);
		assertTrue(result5.contains("The name of the homecity is small and the participant is 30 or older"));
		//System.out.println(dataAnalysis.getResulStringHomecityAndAge(values));
		}
		
		@Test
		public void testnewData() {
			
			DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> thirdValues = new ArrayList<String>();
		
		thirdValues.addAll(Arrays.asList("Test Game", "Rafael", "Silva", "F", "29", "Goa"));
		String result6 = dataAnalysis.getResulStringHomecityAndAge(thirdValues);
		assertTrue(result6.contains("The name of the homecity is small and the participant is younger than 30"));
		}
		
		@Test
		public void testArrayData() {
			
			DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> fourthValues = new ArrayList<String>();
		
		fourthValues.addAll(Arrays.asList("Test Game", "Rafael", "Silva", "F", "31", "Stockholm"));
		String result7 = dataAnalysis.getResulStringHomecityAndAge(fourthValues);
		System.out.println(result7);
		assertTrue(result7.contains("The name of the homecity is big and the participant is 30 or older"));
		
		}
		
		@Test
		public void testFourthData() {
			
			DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> fifthValues = new ArrayList<String>();
		
		fifthValues.addAll(Arrays.asList("Test Game", "Rafael", "Silva", "F", "31", "Sweden"));
		
		String result8 = dataAnalysis.getResultStringNamesAndAge(fifthValues);
		assertTrue(result8.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
	}

}

