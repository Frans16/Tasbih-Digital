package imp.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasbihLoct {
	@FindBy(xpath = "//div[@id='incrementor']")
	public WebElement div_increamentCount;
	
	@FindBy(xpath = "//div[@id='decrementor']")
	public WebElement div_decrement;
	
	@FindBy(xpath = "//span[@class='odometer-value']")
	public WebElement span_counterDigit;
	
	@FindBy(xpath = "//div[@id='resetter']")
	public WebElement div_reset;
}
