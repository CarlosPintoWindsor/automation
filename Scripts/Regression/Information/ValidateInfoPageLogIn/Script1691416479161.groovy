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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('ABC_Prod_OR/decline_offer_popup'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Regression/PDP/pdp_menu_Wedding'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Regression/PDP/pdp submenu Bridal Dresses'))

WebUI.click(findTestObject('Regression/PDP/pdp_dress_selected'))

WebUI.click(findTestObject('Regression/PDP/pdp_button_addtocart'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Regression/Cart/cart_bag_icon'))

WebUI.click(findTestObject('Regression/Cart/cart_checkout_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Regression/Information/info_log_in'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression/Homepage/myaccount_email'), 'krishnat@windsorstore.com')

WebUI.setEncryptedText(findTestObject('Regression/Homepage/myaccount_password'), 'ExkZ5qkpVnkXXWXKyIxKHg==')

WebUI.click(findTestObject('Regression/Homepage/myaccount_signin_btn'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

