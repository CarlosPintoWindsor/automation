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

WebUI.maximizeWindow()

WebUI.click(findTestObject('ABC_Prod_OR/decline_offer_popup'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Sale/menu_Sale'))

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu DEALS ON THE DAILY'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu SHOP CLEARANCE'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu SALE DRESSES'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu SALE SHOES'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu All Sale'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Dresses'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Tops'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Bottoms'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Jackets'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Shoes'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Accessories'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Clearance'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Tops 25 Under'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Bottoms 30 Under'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Jackets 35 Under'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Dresses 40 Under'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Formal Dresses 50 Under'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Sale/submenu Shoes 35 Under'), 0)

WebUI.closeBrowser()

