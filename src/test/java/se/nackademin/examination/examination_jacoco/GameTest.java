package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	@Test
	public void testRunGame() {
		
		Game game = new Game();
		ResultFromInputs resultFromInputs = new ResultFromInputs();
		Conversor conversor = new Conversor();	
		
		game.buildFinalString("Tom", "Jerry", resultFromInputs, conversor);
		ArrayList<String> testValues = new ArrayList<String>();	
		//testValues = game.collectInputData();
		game.runGame("Test", "Tom", "Jerry", 'F', 20, "stockholm");
	}
	
	@Test
	public void testGameRun()
	{
		Game game = new Game();
		ArrayList<String> valuesList = new ArrayList<String>(); 
		valuesList.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "29", "Fortaleza"));
		game.run(valuesList);
	}
	
	@Test
	public void testOutputBasedonAge()
	{
		Game game = new Game();
		int valueAge = game.calculateOutPutBasedOnAge(20);
		assertEquals("The result should be 20", valueAge, 0);
	}
	
	@Test
	public void testOutputBasedonGender()
	{
		Game game = new Game();
		int valueGender = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0",valueGender , 0);
		valueGender = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1",valueGender , 1);
		valueGender = game.calculateOutPutBasedOnGender('R');
		assertEquals("The result should be 1",valueGender , 2);	
	}
	@Test
	public void testCalculationBasedonCity()
	{
		Game game = new Game();
		int valueHomecity = game.calculateOutPutBasedOnHomeCity("Stockholm");
		assertEquals("The result should be 10", valueHomecity, 10);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("Atlanta");
		assertEquals("The result should be 0", valueHomecity, 0);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("Bangalore");
		assertEquals("The result should be 1", valueHomecity, 1);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("Capetown");
		assertEquals("The result should be 2", valueHomecity, 2);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("Delhi");
		assertEquals("The result should be 3", valueHomecity, 3);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("Edmond");
		assertEquals("The result should be 4", valueHomecity, 4);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("Fullton");
		assertEquals("The result should be 5", valueHomecity, 5);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("Goa");
		assertEquals("The result should be 6", valueHomecity, 6);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("Hyd");
		assertEquals("The result should be 7", valueHomecity, 7);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("India");
		assertEquals("The result should be 8", valueHomecity, 8);
		valueHomecity = game.calculateOutPutBasedOnHomeCity("Johanneshov");
		assertEquals("The result should be 9", valueHomecity, 9);
		
	}
	@Test
	public void testGetGenderFromInputValues()
	{
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		char genderValue = game.getGenderFromInputValues(values);
		assertEquals("The result should be M", genderValue, 'M');
	}
	
	@Test
	public void testCalculateOutPutBasedOnNames()
	{
		Game game = new Game();
		int nameValue = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", nameValue, 1);
		nameValue = game.calculateOutPutBasedOnNames("Raj", "Saritha");
		assertEquals("The result should be 0", nameValue, 0);
	}
	@Test
	public void testGetAgeFromInputValues()
	{
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		int valueAgefromList =game.getAgeFromInputValues(values);
		assertEquals("The result should be M", valueAgefromList, 30);
	}
	
}

