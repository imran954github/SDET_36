package mavenTestNG;

import org.testng.annotations.Test;

public class MavenPractice1Test {
@Test
public void maven1Test() {
	System.out.println("Test Case 1");
}

@Test(priority=1)
public void maven2Test() {
	System.out.println("Test Case 2");
}

@Test
public void maven3Test() {
	System.out.println("Test Case 3");
	System.out.println("bye bye there");
	System.out.println("hiiii again");
	System.out.println("tyss");
	//hii
}
}

