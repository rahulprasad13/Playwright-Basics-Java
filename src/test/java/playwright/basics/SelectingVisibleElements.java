package playwright.basics;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SelectingVisibleElements {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		page.navigate("https://www.lazada.com.my/#?");
		List<String> allLinksText = page.locator("a:visible").allInnerTexts();
		
		for(int i=0; i<allLinksText.size(); i++) {
			System.out.println(allLinksText.get(i));
		}
		
		int imagesCount = page.locator("xpath=//img >> visible=true").count();
		System.out.println(imagesCount);

	}

}
