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

WebUI.click(findTestObject('Mobile_Regression/mobile_homepage_3_bar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mobile_Regression/mobile_menu_dresses'))

WebUI.click(findTestObject('Mobile_Regression/mobile_submenu_long_dresses'))

WebUI.click(findTestObject('GlobalE/Desktop/lc_save_15_percent'))

WebUI.click(findTestObject('Regression/PDP/pdp_980_dress_selected'))

WebUI.click(findTestObject('Regression/PDP/pdp_980_dress_size'))

WebUI.click(findTestObject('Mobile_Regression/mobile_homepage_ship_to'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mobile_Regression/mobile_country_select'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Regression/PDP/pdp_980_sold_out'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Regression/PDP/pdp_980_popup_size'))

WebUI.sendKeys(findTestObject('Regression/PDP/pdp_980_popup_email'), 'krishnat@windsorstore.com')

WebUI.selectOptionByLabel(findTestObject('Regression/PDP/pdp_980_popup_country_select'), 'Australia', false)

WebUI.click(findTestObject('Regression/PDP/pdp_980_popup_checkbox'))

WebUI.click(findTestObject('Regression/PDP/pdp_980_popup_jointhewaitlist_btn'))

WebUI.verifyElementPresent(findTestObject('Regression/PDP/pdp_980_popup_message_youareonthelist'), 0)

