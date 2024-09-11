package playwright.basics;

	import java.nio.file.Paths;

import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;

	public class TraceViwer {
	  public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      
	   // Start tracing before creating / navigating a page.
	      context.tracing().start(new Tracing.StartOptions()
	        .setScreenshots(true)
	        .setSnapshots(true)
	        .setSources(true));
	      
	      Page page = context.newPage();
	      page.navigate("https://www.google.com/");
	      page.getByLabel("Sign in").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create account")).click();
	     // page.getByText("For my personal use").click();
	      page.getByLabel("First name").fill("Rahul");
	      page.getByLabel("First name").press("Tab");
	      page.getByLabel("Last name (optional)").fill("Newgmail");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
	      page.getByLabel("Month").selectOption("8");
	      page.getByLabel("Day").click();
	      page.getByLabel("Day").fill("13");
	      page.getByLabel("Year").click();
	      page.getByLabel("Year").fill("1989");
	      page.getByLabel("Gender", new Page.GetByLabelOptions().setExact(true)).selectOption("1");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
	      page.getByLabel("Create your own Gmail address").click();
	      
	      context.tracing().stop(new Tracing.StopOptions()
	    		  .setPath(Paths.get("trace.zip")));
	    }
	  }
	}
