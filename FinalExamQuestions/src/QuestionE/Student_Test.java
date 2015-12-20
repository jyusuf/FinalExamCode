package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");


		assertTrue(1==1);
		{

			Date dBirthDate = null;
			try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
			} catch (ParseException e) {
			e.printStackTrace();
			}
			Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
			Student stu2 = new Student("James", "Randall", "Gibbons", dBirthDate, "219 Labrador Lane", "302-894-6889", "jgibbons@udel.edu","MIS");

			Student stu3 = new Student("Willy", "Randall", "Gibbons", dBirthDate, "217 Labrador Lane", "302-895-6889", "wgibbons@udel.edu","MIS");

			Student stu4 = new Student("Flanagan", "Randall", "Gibbons", dBirthDate, "216 Labrador Lane", "302-896-6889", "fgibbons@udel.edu","MIS");

			Student stu5 = new Student("Kim", "Randall", "Gibbons", dBirthDate, "215 Labrador Lane", "302-897-6889", "kgibbons@udel.edu","MIS");

			HashMap hm = new HashMap();
			hm.put("Bert");
			hm.put("James");
			hm.put("Willy");
			hm.put("Flanagan");
			hm.put("Kim");
			}

			assertTrue(5==5);
			}
	}


