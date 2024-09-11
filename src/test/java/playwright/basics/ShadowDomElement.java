package playwright.basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowDomElement {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//page -- DOM -- Shadow DOM --> Elements
//		Page page = browser.newPage();
//		page.navigate("https://books-pwakit.appspot.com/");
//		page.locator("book-app[apptitle='BOOKS'] #input").fill("Rahul testing shadow dom");
//		String text = page.locator("book-app[apptitle='BOOKS'] .books-desc").textContent();
//		System.out.println(text);
		
		//Page -- DOM -- iFrame --> Shadow DOM --> Elements 
		Page page = browser.newPage();
		page.navigate("https://selectorshub.com/shadow-dom-in-iframe/");
		page.frameLocator("#pact").locator("div#snacktime #tea").fill("Elachi Tea Lover");

	}

}
