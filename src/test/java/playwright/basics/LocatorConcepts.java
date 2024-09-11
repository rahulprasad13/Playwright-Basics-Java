package playwright.basics;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorConcepts {

	public static void main(String[] args) {
		

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//locators
		
		BrowserContext browserContext = browser.newContext();
		Page page = browserContext.newPage();
		//page.navigate("https://www.vtiger.com/");
		
		//Using first() method
		/*
		 * Locator tryVtiger = page.locator("text=Try Vtiger for Free").first(); int
		 * totalTryVtiger = tryVtiger.count(); System.out.println(totalTryVtiger);
		 * tryVtiger.hover(); tryVtiger.click();
		 * System.out.println("Clicked on first element");
		 */
		
		
		//Multipe Elements 
		page.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		
		Locator countryOptions = page.locator("select#Form_getForm_Country option");
		System.out.println(countryOptions.count());
		
		/*for(int i=0; i<countryOptions.count();i++) {
		String text = countryOptions.nth(i).textContent();
		System.out.println(text);
			}*/
		
		//Second way using allTextContent() method
		
		List<String> optionsTextList = countryOptions.allTextContents();
		//for(String e: optionsTextList) {
		//	System.out.println(e);
		//}
		
		//Using Lamda expression 
		
		optionsTextList.forEach(ele -> System.out.println(ele));
		System.out.println("Using Lamda expression");
		}
	}
