package playwright.basics;

	import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;

	public class CodegenInspector {
	  public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://academy.naveenautomationlabs.com/");
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).click();
	      page.frameLocator("#microfe-popup-login").getByText("Sign up").click();
	      
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
	      
	      page.pause(); //Here it will stop the execution and open the playwright inspector to debug the code 
	      
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").fill("Rahul");
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Email address").fill("rahulbaba@gmail.com");
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").fill("Sairam@13");
	      page.frameLocator("#microfe-popup-login").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Malaysia: +")).click();
	      page.frameLocator("#microfe-popup-login").getByText("Malaysia").click();
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Enter your number").click();
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Enter your number").fill("+60 11-4536-543");
	      page.frameLocator("#microfe-popup-login").locator("#loginPopupCloseBtn svg").click();
	      
	      System.out.println("Successfully executed");
	    }
	  }
	}