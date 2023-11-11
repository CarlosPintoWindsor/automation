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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/New/menu_New'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Dresses/menu_dresses'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Clothing/menu_clothing'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Wedding/menu_Wedding'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Homecoming/menu_Homecoming'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Occassion/menu_occassion'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Shoes and Accessories/menu_shoes_accessories'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Trending/menu_Trending'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Sale/menu_Sale'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

