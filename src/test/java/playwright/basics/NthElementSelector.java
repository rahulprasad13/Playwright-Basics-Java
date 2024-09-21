package playwright.basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class NthElementSelector {
	
	//button button button button  "button >> nth=0"

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		page.navigate("https://www.bigbasket.com/");
		
		Locator first_ele = page.locator("div.pr-4 li a >> nth=0");	
		String firstEle = first_ele.textContent();
		System.out.println(firstEle);
		
		Locator last_ele = page.locator("div.pr-4 li a >> nth=-1");	
		String lastEle = last_ele.textContent();
		System.out.println(lastEle);
		
		
		

	}

}
