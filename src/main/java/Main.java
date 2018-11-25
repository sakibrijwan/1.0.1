import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;
import testcases.*;

import java.util.List;

public class Main {

    //Main method to run the test, this is the staring point of the program.
    public static void main(String[] args) {
        //Create TestNG object
        TestNG testng = new TestNG();
        //Make a list of suites which is defined in testNG.xml
        List<String> suites = Lists.newArrayList();
        //Add the suits in suites List
        suites.add(".//testNG.xml");
        //Set the suits to be ran by testNG
        testng.setTestSuites(suites);
        //Run the cases defined in test suite
        testng.run();
    }
}