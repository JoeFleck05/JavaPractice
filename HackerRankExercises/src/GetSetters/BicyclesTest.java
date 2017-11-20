package GetSetters;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BicyclesTest {

//	this.make = make;
//	this.model = model;
//	this.mtbFrameType = mtbFrameType;
	
	Bicycles bicycles = new Bicycles(null, null, null, null, null);
	private static String NUMBER_OF_GEARS = "10";
	private static String EXPECTED_NUMBER_OF_GEARS = "10";
	private static String FRAME_MATERIAL = "carbon";
	private static String EXPECTED_FRAME_MATERIAL = "carbon";
	private static String MAKE = "TREK";
	private static String EXPECTED_MAKE = "TREK";
	private static String MODEL = "EDMONDA S4";
	private static String EXPECTED_MODEL = "EDMONDA S4";
	private static String MTB_FRAME_TYPE = "Suspension";
	private static String EXPECTED_MTB_FRAME_TYPE = "Suspension";
	
	@Before
	public void beforeTests(){
		bicycles.setGears(NUMBER_OF_GEARS);
		bicycles.setFrameMaterial(FRAME_MATERIAL);
		bicycles.setMake(MAKE);
		bicycles.setModel(MODEL);
		bicycles.setMtbFrameType(MTB_FRAME_TYPE);
	}
	
	
	@Test
	public void gearTests() { assertEquals(EXPECTED_NUMBER_OF_GEARS,bicycles.getGears()); }
	
	@Test
	public void frameMaterialTest(){ assertEquals(EXPECTED_FRAME_MATERIAL,bicycles.getFrameMaterial()); }

	@Test
	public void makeTest(){ assertEquals(EXPECTED_MAKE,bicycles.getMake()); }
	
	@Test
	public void modelTest(){ assertEquals(EXPECTED_MODEL,bicycles.getModel()); }
	
	@Test
	public void mtbFrameTypeTest(){ assertEquals(EXPECTED_MTB_FRAME_TYPE,bicycles.getMtbFrameType()); }
	
//	6/20/08
}
