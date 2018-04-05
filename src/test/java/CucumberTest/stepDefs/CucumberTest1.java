package CucumberTest.stepDefs;

import CucumberTest.DataCucumberTest1;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.TreeSet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

//@ContextConfiguration("classpath:cucumber.xml")
public class CucumberTest1 {

    private int result;
    private List<String> strCollect = null;
    private TreeSet<String> treeCollect = new TreeSet<>();

    @Autowired
    private DataCucumberTest1 dataCucumberTest1; // = null;

    @Before
    public void initialisation(){
        assertFalse("dataCucumberTest1 is null",dataCucumberTest1 == null);
    }

    @When("^initial value is (\\d+)$")
    public void initialValueIs(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        result = arg0 * arg0;
        dataCucumberTest1.addTointList(arg0);
        //throw new PendingException();

    }

    @Then("^result should be (\\d+)$")
    public void resultShouldBe(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        if(arg0 == result){
            System.out.println("true");
        } else{
            System.out.println("false");
            //assertTrue (false);
            assertFalse(true);
        }
    }

    @When("^initial List is: (.*)$")
    public void initialListIs(List<String> collect) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        strCollect = collect;
        treeCollect.addAll(collect);
        System.out.println(collect);
        //throw new PendingException();

    }

    @Then("^result set is: (.*)$")
    public void resultSetIs(List<String> expList) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if(strCollect.equals(expList)){
            System.out.println("Equal");
        } else{
            if(treeCollect.equals(new TreeSet<String>(expList))){
                System.out.println("Tree equal");
            }
            System.out.print("received:");
            System.out.println(strCollect);
            System.out.print("expected:");
            System.out.println(expList);
            assertFalse("Lists are not equal", true);
        }
        //throw new PendingException();
    }

    @When("^initial outline List is: (.*)$")
    public void initialOutlineListIs(List<String> intList) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(intList);
        //throw new PendingException();
    }

    @After
    public void finalaze(){
        System.out.println(dataCucumberTest1.getIntList());
    }
}
