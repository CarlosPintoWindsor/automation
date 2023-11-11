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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Dresses/menu_dresses'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_980_submenu_longdresses'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PLP/plp_view_96'))

WebUI.enhancedClick(findTestObject('Regression/PDP/pdp_980_dress_selected'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_980_dress_size'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Homepage/homepage_ship_to'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Homepage/homepage_country_select'))

WebUI.enableSmartWait()

CustomKeywords.'com.Tools.testClick'(findTestObject('GlobalE/Desktop/lc_popup_change_country'))

CustomKeywords.'com.Tools.testClick'(findTestObject('GlobalE/Desktop/lc_popup_select_country_AUS'))

CustomKeywords.'com.Tools.testClick'(findTestObject('GlobalE/Desktop/lc_popup_country_continue'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_980_sold_out'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_980_popup_size'))

WebUI.sendKeys(findTestObject('Regression/PDP/pdp_980_popup_email'), 'krishnat@windsorstore.com')

WebUI.selectOptionByLabel(findTestObject('Regression/PDP/pdp_980_popup_country_select'), 'Australia', false)

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_980_popup_checkbox'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_980_popup_jointhewaitlist_btn'))

WebUI.verifyElementPresent(findTestObject('Regression/PDP/pdp_980_popup_message_youareonthelist'), 0)

