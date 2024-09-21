package playwright.basics;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class XpathLocator {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		//page.navigate("https://www.amazon.in/");
		
//		Locator searchField = page.locator("//input[@id='twotabsearchtextbox']");
//		searchField.click();
//		searchField.fill("Iphone16");
		
//	page.navigate("https://xsolla.com/");
//		
//		Locator allAmazonLinks = page.locator("xpath=//a[contains(text(),'Xsolla')]");
//		System.out.println(allAmazonLinks.count());
//		List<String> allListLinks = allAmazonLinks.allInnerTexts();
//		
//		allListLinks.forEach(e -> System.out.println(e));
		
		
		page.navigate("https://selectorshub.com/xpath-practice-page/");
		
		//page.locator("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']").click();
		
		page.locator("(//table[@id='resultTable']//input[@type='checkbox'])[1]").click();
		
		page.locator("(//table[@id='resultTable']//input[@type='checkbox'])[last()]").click();
		
//		Locator checkBoxes = page.locator("//table[@id='resultTable']//input[@type='checkbox']");
//		for(int i=0; i<checkBoxes.count();i++) {
//			checkBoxes.nth(i).click();
//			
//		}

	}

}
