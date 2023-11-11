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

CustomKeywords.'com.Tools.testClick'(findTestObject('Mobile_Regression/mobile_homepage_3_bar'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Mobile_Regression/mobile_menu_wedding'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Mobile_Regression/mobile_submenu_for_the_bride'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Mobile_Regression/mobile_submenu_bridal_dresses'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_dress_selected'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_button_addtocart'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Mobile_Regression/mobile_cart_bag_icon'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Cart/cart_promo_message'))

WebUI.sendKeys(findTestObject('Regression/Cart/cart_promo_input'), 'SALE50')

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Cart/cart_promo_apply'))

WebUI.verifyElementPresent(findTestObject('Regression/Payment/payment_error_promo_code'), 0)

