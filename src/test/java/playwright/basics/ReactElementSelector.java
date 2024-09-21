package playwright.basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ReactElementSelector {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		page.navigate("https://www.netflix.com/my-en/");
		
//		Locator emailField=page.locator("_react=Anonymous[name='email'] >> input").first();
//		emailField.click();
//		emailField.fill("rahulbabanetflix@gmail.com");
		
		/*
		 * Locator netflix =
		 * page.locator("_react=Anonymous[id='button--nmhp-faq-accordion--0']"); String
		 * netflixtext= netflix.innerText(); System.out.println(netflixtext);
		 * 
		 * netflix.click();
		 */
		
		
		Locator footerLink = page.locator("_react=Anonymous[data-uia='footer-link']");
		footerLink.allInnerTexts().forEach(e -> System.out.println(e));
		

	}

}
