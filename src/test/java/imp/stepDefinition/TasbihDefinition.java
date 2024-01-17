package imp.stepDefinition;

import imp.action.TasbishAct;
import imp.util.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TasbihDefinition {
	
	TasbishAct tasbihAct = new TasbishAct();
	
	@Given("User is on page")
	public void user_is_on_page() {
	    HelperClass.openPage("https://www.tasbih.org/");
	}
	@When("User accumulate some counts on the Tasbih Digital")
	public void user_accumulate_some_counts_on_the_tasbih_digital() throws InterruptedException {
	    tasbihAct.increaseCount(5);
	    tasbihAct.decreaseCount(3);
	}
	@When("Click button reset")
	public void click_button_reset() throws InterruptedException {
	    tasbihAct.reset();
	}
	@Then("has successfully reset the prayer beads count")
	public void has_successfully_reset_the_prayer_beads_count() {
	    System.out.println("Done");
	}

}
