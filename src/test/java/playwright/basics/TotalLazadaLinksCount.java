package playwright.basics;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TotalLazadaLinksCount {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		page.navigate("https://www.lazada.com.my/#?");
		
		List<String> lazadaLinksText = page.locator("a:has-text('Lazada')").allInnerTexts();
		
		lazadaLinksText.stream().forEach(s-> System.out.println(s));
		
		//To validate the playwright locators you need run below command and use playwright.$("Your loacators") for single element
		//For multiple elements use  playwright.$$("Your locators") in playwright opened browser  
		//playwright.$("input#Form_submitForm_Name >> visible=true")
		
		
	}

}
