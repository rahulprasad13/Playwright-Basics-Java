package playwright.basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchOptionsObject {

public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
		
		//lp.setChannel("msedge");
		lp.setChannel("chrome");
		//lp.setChannel("firefox");// While executing this use playwright.firefox().launch(lp);
		lp.setHeadless(false);
		
		Browser browser = playwright.chromium().launch(lp);
		
		Page page = browser.newPage();
		
		page.navigate("https://www.google.com");
		
		String title = page.title();
		
		System.out.println("page title is:" +title);
		
		String url= page.url();
		
		System.out.println("URL of the page:" +url);
		
		browser.close();
		playwright.close();
		
		
		
		
		
	}

}