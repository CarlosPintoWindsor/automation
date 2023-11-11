import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.windsorstore.com/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Rec_Homepage_announcement_bar/Homepage_Announcement_Bar/Page_Womens Clothing and Fashion  Dresses, _a13730/button_Decline Offer'))

WebUI.click(findTestObject('Object Repository/Rec_Homepage_announcement_bar/Homepage_Announcement_Bar/Page_Womens Clothing and Fashion  Dresses, _a13730/svg_SHIP TO_icon icon-caret'))

WebUI.click(findTestObject('Object Repository/Rec_Homepage_announcement_bar/Homepage_Announcement_Bar/Page_Womens Clothing and Fashion  Dresses, _a13730/a_Australia (AUD)'))

WebUI.verifyElementText(findTestObject('Object Repository/Rec_Homepage_announcement_bar/Homepage_Announcement_Bar/Page_Womens Clothing and Fashion  Dresses, _a13730/a_Free Shipping Over AUD130'), 
    'Free Shipping Over AUD$130')

WebUI.closeBrowser()

