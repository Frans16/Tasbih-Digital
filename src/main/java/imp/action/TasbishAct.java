package imp.action;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import imp.locator.TasbihLoct;
import imp.util.HelperClass;

public class TasbishAct {
	TasbihLoct tasbihLoct = new TasbihLoct();
	
	public TasbishAct() {
		this.tasbihLoct = new TasbihLoct();
		PageFactory.initElements(HelperClass.getDriver(), tasbihLoct);
	}
	
	
	public void increaseCount(int n) {
		for(int i=0;i<n;i++) {
			tasbihLoct.div_increamentCount.click();
		}
	}
	
	
	public void decreaseCount(int n) throws InterruptedException {
		Thread.sleep(2000);
		int initialCount = Integer.parseInt(tasbihLoct.span_counterDigit.getText());
		int expectedCountAfterDecrease = (initialCount-n);
		
		for(int i=0;i<n;i++) {
			tasbihLoct.div_decrement.click();
		}
		Thread.sleep(2000);
		int actualCount = Integer.parseInt(tasbihLoct.span_counterDigit.getText());
	
		Assert.assertEquals(expectedCountAfterDecrease, actualCount);
	}
	
	public void reset() throws InterruptedException {
		Thread.sleep(2000);
		tasbihLoct.div_reset.click();
		
		HelperClass.getDriver().switchTo().alert().accept();
		
		Thread.sleep(2000);
		int actualCount = Integer.parseInt(tasbihLoct.span_counterDigit.getText());
		
		Assert.assertEquals(0, actualCount);
	}
}	
