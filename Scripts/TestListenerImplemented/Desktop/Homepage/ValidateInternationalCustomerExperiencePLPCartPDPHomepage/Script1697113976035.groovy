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

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Homepage/homepage_ship_to'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Homepage/homepage_country_select'))

WebUI.enableSmartWait()

CustomKeywords.'com.Tools.testClick'(findTestObject('GlobalE/Desktop/lc_popup_change_country'))

CustomKeywords.'com.Tools.testClick'(findTestObject('GlobalE/Desktop/lc_popup_select_country_AUS'))

CustomKeywords.'com.Tools.testClick'(findTestObject('GlobalE/Desktop/lc_popup_country_continue'))

WebUI.verifyElementPresent(findTestObject('Regression/Homepage/certona_homepage'), 0)

WebUI.mouseOver(findTestObject('Regression/PLP/plp_menu_clothing'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PLP/plp_submenu All Bottoms'))

WebUI.verifyElementPresent(findTestObject('Regression/PLP/plp_certona_now_trending'), 0)

WebUI.enhancedClick(findTestObject('Regression/PLP/plp_product_selected'))

WebUI.verifyElementPresent(findTestObject('Regression/PDP/pdp_certona'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Regression/PDP/pdp_currency_AUS'), 0)

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_button_addtocart'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Cart/cart_bag_icon'))

WebUI.verifyElementPresent(findTestObject('Regression/Cart/cart_certona_not_empty'), 0)

