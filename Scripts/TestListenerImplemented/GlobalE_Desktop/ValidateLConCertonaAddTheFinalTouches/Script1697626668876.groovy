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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Shoes and Accessories/menu_shoes_accessories'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.Tools.testClick'(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Rings'))

WebUI.enhancedClick(findTestObject('Regression/Cart/cart_subtotal_less_75_item'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_button_addtocart'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Cart/cart_bag_icon'))

WebUI.verifyElementPresent(findTestObject('GlobalE/Desktop/lc_certona_add_the_final_touches'), 0)

WebUI.verifyElementPresent(findTestObject('GlobalE/Desktop/lc_certona_add_the_final_touches_price'), 0)

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Homepage/homepage_ship_to'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Homepage/homepage_country_selectu_canada'))

localized_currency = WebUI.getText(findTestObject('GlobalE/Desktop/lc_certona_add_the_final_touches_price_AUD'))

assert localized_currency.contains('CAD')

