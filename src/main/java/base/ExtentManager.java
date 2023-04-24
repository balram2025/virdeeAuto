package base;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setExtent() {
		String date = new SimpleDateFormat("[dd-MM-yyyy]-hh-mm-ss").format(new Date());
		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+date+"Virdee automation test report.html");
//		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");

		htmlReporter.config().setDocumentTitle("Virdee automation test report");
		htmlReporter.config().setReportName("Virdee");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "Virdee Automation");
		extent.setSystemInfo("Tester", "Balram_Kumar");
		extent.setSystemInfo("OS", "Windows 11");
	}
	public static void endReport() {
		extent.flush();
	}
}
