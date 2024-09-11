package playwright.basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class XpathUnion {

	public static void main(String[] args) {
		
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		
		page.navigate("https://academy.naveenautomationlabs.com/");
		
		Locator loc = page.locator("//a[text()='Login'] | //a[text()='SignIn']");
		System.out.println(loc.textContent());
		loc.click();
		
		

	}

}
