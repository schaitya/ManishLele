package intro;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base {
	
	//creating driver
		public static WebDriver driver;

		//creating properties folder
		public Properties prop;

		public static ExtentSparkReporter spark;
		public static ExtentReports extent;
		public Base()
		{
			spark = new ExtentSparkReporter("htmlReport//index.html");
			extent = new ExtentReports();
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("Automate Report");
			spark.config().setReportName("Extend Report");
			extent.attachReporter(spark);
		}

		public WebDriver setthings() throws IOException
		{

			prop=new Properties();
			
			String pat=System.getProperty("user.dir");

			//Taking names from file
			FileInputStream input=new FileInputStream(pat+"\\src\\main\\java\\intro\\pathi.properties");

			//loading file
			prop.load(input);

			//getting Browser Name
			String browsername=prop.getProperty("Browser");
			

			//		//getting url
			//		Stringprop.getProperty("Url");

			//printing browser name
			System.out.println(browsername);
			

			//invoking Browser
			if(browsername.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", pat+"\\Browser\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else
			{

				System.setProperty("webdriver.edge.driver", "C:\\edgedriver.exe");
				driver=new EdgeDriver();	
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			return driver;

}
}
