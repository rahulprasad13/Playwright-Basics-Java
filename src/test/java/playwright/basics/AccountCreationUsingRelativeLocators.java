package playwright.basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AccountCreationUsingRelativeLocators {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		
		page.navigate("https://publisher.xsolla.com/signup?integration_type&utm_campaign=default-reg&_gl=1*1ngfebw*_gcl_au*NTA5ODE0NDEzLjE3MjY0NTU0ODY.");
		page.locator("input:below(:text('Email Address'))").first().fill("rahultest@gmail.com");
		page.locator("input:below(:text('Password'))").first().fill("123456");
		page.locator("input:below(:text('Confirm Password'))").first().fill("123456");

	}

}
