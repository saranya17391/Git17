package runnertest;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\feature\\data.feature",glue={"stepdefini"},monochrome= true,

//plugin= {"pretty","junit:target/jUnit1reports/report.xml"}	
		
//plugin= {"pretty","html:target/htmlreports/reporthtml.xml"}	

plugin= {"pretty","json:target/jsonreports/reporjson.xml"}	
)

public class runnerclass {

}
