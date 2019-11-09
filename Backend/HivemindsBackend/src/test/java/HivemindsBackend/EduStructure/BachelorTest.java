package HivemindsBackend.EduStructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class BachelorTest {

	@Test
	public void testInitializeBachelorCatalog() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		String bachelorName = "Bachelor of Aerospace Engineering";
		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName,facultyName);
		Bachelor bachelor = new Bachelor(uniName,facultyName,bachelorName);
		
		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		
		
		assertEquals(0,uni.getFacultyCatalog().get(0).getBachelorCatalog().size());
	}
	
	@Test
	public void testGetBachelorName() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		String bachelorName = "Bachelor of Aerospace Engineering";
		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName,facultyName);
		Bachelor bachelor = new Bachelor(uniName,facultyName,bachelorName);
		
		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().add(bachelor);
		
		assertEquals(bachelorName, uni.getFacultyCatalog().get(0).getBachelorCatalog().get(0).getBachelorName());
	}

}
