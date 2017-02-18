package steps

import cucumber.api.scala.{EN, ScalaDsl}
import mycalc.MyCalculator
import org.scalatest.Matchers

/**
  * Created by pkhanna on 2/18/2017 AD.
  */
class StepDefinations extends ScalaDsl with EN with Matchers {
  var calc: MyCalculator = _

  var result: Int = _
  Given("""^my calculator is running$"""){ () =>
    calc = new MyCalculator
  }
  When("""^I add (\d+) and (\d+)$"""){ (firstNum:Int, secondNum:Int) =>
    result = calc.add(firstNum, secondNum)
  }
  Then("""^result should be equal to (\d+)$"""){ (expectedResult:Int) =>
    assert(result == expectedResult, "Incorrect result of calculator computation")
  }
  When("""^I subtract (\d+) and (\d+)$"""){ (firstNum:Int, secondNum:Int) =>
    result = calc.sub(firstNum, secondNum)
  }

}
