import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNg {		
@Test
public void first() {
	System.out.println("hi");	
}
@BeforeTest
public void PreReq() {
	
	System.out.println("pandu");
}
@AfterTest
public void last(){
	System.out.println("come");
}

}





