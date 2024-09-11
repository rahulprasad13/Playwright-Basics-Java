package playwright.basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;



public class CommaSelectors {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		
		page.navigate("https://academy.naveenautomationlabs.com/");
		
//		page.locator("a:has-text('Login'), "
//				+"a:has-text('LogIn'), "
//				+"a:has-text('SignIn'), "
//				+"a:has-text('LOGIN')").click();
//		
//		System.out.println("Clicked on Login button");
		//This you can use to check all the mandatory fields with this list of  locator
		Locator multiple_elements = 
				page.locator("a:has-text('Courses'), "
				+"a:has-text('Login'), "
				+ "a:has-text('EXPLORE COURSES')");
		
		System.out.println(multiple_elements.count());
		
		if(multiple_elements.count()== 3) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		
	}

}
