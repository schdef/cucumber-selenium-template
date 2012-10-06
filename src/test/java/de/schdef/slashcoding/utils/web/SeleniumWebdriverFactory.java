package de.schdef.slashcoding.utils.web;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class SeleniumWebdriverFactory {

	public static WebDriver getDefaultWebdriver() {
		return new ChromeDriver(); 
	}
	
	private static boolean isSupportedPlatform() {
	    Platform current = Platform.getCurrent();
	    return Platform.MAC.is(current) || Platform.WINDOWS.is(current);
	  }
}
