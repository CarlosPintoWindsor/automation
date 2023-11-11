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

WebUI.callTestCase(findTestCase('SanityTests/LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Windsor Store Dev  Windsor DevTest/input_search_main'))

WebUI.setText(findTestObject('Page_Windsor Store Dev  Windsor DevTest/input_search_main'), 'Lola High Slit Satin Dress')

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Windsor Store Dev  Windsor DevTest/input_search_main'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Page_Windsor Store Dev  Windsor DevTest/lola_satin_dress_defaultimage'), 10)

WebUI.takeScreenshot()

WebUI.check(findTestObject('Page_Search  Windsor DevTest/div_Best Seller_ProductTile__gtm-click'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

