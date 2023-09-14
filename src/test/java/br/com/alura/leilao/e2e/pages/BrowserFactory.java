package br.com.alura.leilao.e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrowserFactory {

	// Documentação
	// http://chromedriver.storage.googleapis.com/index.html
	// https://github.com/mozilla/geckodriver/releases

	public WebDriver createWebDriver() {
		String webdriver = System.getProperty("browser", "chrome");
		switch (webdriver) {
			case "firefox":
				return initFirefoxDriver();
			case "chrome":
				return initChromeDriver();
			case "edge":
				return initEdgeDriver();
			default:
				return new HtmlUnitDriver();
		}
	}

	private WebDriver initChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\EstudosJava\\1821-bdd-cucumber-java-aula\\drivers\\chromedriver.exe");
		return new ChromeDriver();
	}

	private WebDriver initFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\EstudosJava\\1821-bdd-cucumber-java-aula\\drivers\\geckodriver.exe");
		return new FirefoxDriver();
	}

	private WebDriver initEdgeDriver() {
		System.setProperty("webdriver.edge.driver",
				"D:\\EstudosJava\\1821-bdd-cucumber-java-aula\\drivers\\msedgedriver.exe");
		return new EdgeDriver();
	}
}
