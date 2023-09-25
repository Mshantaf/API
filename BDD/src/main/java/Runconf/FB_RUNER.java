package Runconf;







import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)  // add junit 4 library to the build path
	@CucumberOptions(features= {"C:\\Users\\Moe\\eclipse-workspace\\BDD\\src\\main\\java\\Runconf\\fbfeature.feature"},tags="@regression", glue= {"stepdefi"}, monochrome=true)

	public class FB_RUNER {

	}



