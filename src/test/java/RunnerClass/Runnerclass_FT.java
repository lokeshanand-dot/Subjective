package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class)
		@CucumberOptions(
				features= {"C:\\Users\\DELL\\Downloads\\CucumberMaven\\CucumberMaven\\src\\test\\resources\\Feature\\FundTransfer.feature"},
				glue="StepDef",
			    plugin = {"pretty","html:target/cucumber-reports"}
				)	


		public class Runnerclass_FT 
	{
			

	}

