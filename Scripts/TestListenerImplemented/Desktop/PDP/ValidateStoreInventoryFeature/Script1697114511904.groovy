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

WebUI.mouseOver(findTestObject('Regression/PDP/pdp_menu_Wedding'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp submenu Bridal Dresses'))

WebUI.enhancedClick(findTestObject('Regression/PDP/pdp_dress_selected'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_store_inventory_message'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_search_zip'))

WebUI.sendKeys(findTestObject('Regression/PDP/pdp_search_zip'), '99501')

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_zip_go_btn'))

WebUI.verifyElementPresent(findTestObject('Regression/PDP/pdp_store_inventory_validation'), 0)

