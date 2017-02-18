package steps

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith
import org.scalatest.FunSuite

/**
  * Created by pkhanna on 2/18/2017 AD.
  */

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:features"),
  glue = Array("classpath:steps"),
  tags = Array("@wip"),
  monochrome = true,
  plugin = Array("pretty",
    "html:target/cucumber",
    "json:target/cucumber/test-report.json",
    "junit:target/cucumber/test-report.xml")
)
class TestRunner {

}
