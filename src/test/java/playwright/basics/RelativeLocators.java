package playwright.basics;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RelativeLocators {
	
	//Selecting elements based on layout with :left-of(), :right-of(), :above() and :below().
	static Page page;
	
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		page=browser.newPage();
		
		page.navigate("https://selectorshub.com/xpath-practice-page/");
		
		//page.locator("input[type='checkbox']:left-of(:text('Joe.Root'))").first().click();
		
		selectUser("Joe.Root");
		selectUser("Jordan.Mathews");
		
		//String userRole = page.locator("td:right-of(:text('Joe.Root'))").first().textContent();
		//System.out.println(userRole);
		
		System.out.println(userRole("Joe.Root"));
		System.out.println(userRole("John.Smith"));
		
		String aboveUser = page.locator("a:above(:text('Joe.Root'))").first().textContent();
		System.out.println(aboveUser);
		
		String belowUser = page.locator("a:below(:text('Joe.Root'))").first().textContent();
		System.out.println(belowUser);
		
		List<String> nearEletext = page.locator("td:near(:text('Joe.Root'),200)").allTextContents();
		System.out.println("Total count:" +nearEletext.size());
		for(String e: nearEletext ) {
			System.out.println(e);
		}
	
		}
	
	//These are the utilities method to handel webtable
	public static void selectUser(String userName) {
		
		page.locator("input[type='checkbox']:left-of(:text('"+userName+"'))").first().click();
		
	}
	
public static String userRole(String userName) {
		
	return page.locator("td:right-of(:text('"+userName+"'))").first().textContent();
		
	}

}
