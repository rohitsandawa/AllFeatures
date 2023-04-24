package UI;

public class WindowHandling {
	//String mainWindow = driver.getWindowHandle(); // Get the handle of the main window

	// Perform some action that opens a new window

	// Switch to the new window
	//for (String windowHandle : driver.getWindowHandles()) {
	//    if (!windowHandle.equals(mainWindow)) {
	//        driver.switchTo().window(windowHandle);
	 //       break;
	  ///  }
	//}

	// Perform some actions on the new window

	// Close the new window
	//driver.close();

	// Switch back to the main window
	//driver.switchTo().window(mainWindow);
//
	
  /* 
    @Test
    public void multipleWindowPopUp() {
        try {
            //Clicks on the follow on twitter and facebook option
            WebElement followOnTwitterAndFacebook = driver.findElement(By.xpath("//a[text()='Follow Twitter & Facebook']"));
            followOnTwitterAndFacebook.click();
 
            // To handle parent window
            String MainWindow = driver.getWindowHandle();
            System.out.println("Main window handle is " + MainWindow);
 
            // To handle child window
            Set<String> s1 = driver.getWindowHandles();
            System.out.println("Child window handles is" + s1);
            Iterator<String> i1 = s1.iterator();
            while (i1.hasNext()) {
                String ChildWindow = i1.next();
                if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                    driver.switchTo().window(ChildWindow);
                    String pageTitle=driver.getTitle();
                    System.out.println("The web page title of child window is:"+pageTitle);
                    if(pageTitle.contains("Facebook")){
                        WebElement signUpForFB= driver.findElement(By.xpath("//span[text()='Create New Account']"));
                        signUpForFB.click();
                        System.out.println("Clicked on Login Option For Facebook");
                    }else if(pageTitle.contains("Twitter")){
                        WebElement signUpForTwitter= driver.findElement(By.xpath("//span[text()='Sign up for Twitter']"));
                        signUpForTwitter.click();
                        System.out.println("Clicked on Follow Option For Twitter");
                    }
                }
            }
 
        } catch (Exception e) {
               e.printStackTrace();
        }
 
    }
 
    @AfterClass
    public void closeBrowser() {
        driver.quit();
        System.out.println("Closing the browser");
    }
}	
*/	
}
