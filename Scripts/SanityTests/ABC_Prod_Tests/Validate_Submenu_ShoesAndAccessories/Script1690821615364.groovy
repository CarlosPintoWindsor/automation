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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Shoes and Accessories/menu_shoes_accessories'))

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu SHOES'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu ACCESSORIES'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu JEWELRY'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu HANDBAGS'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu FASHION ACCESSORIES'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu SUNGLASSES2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu NECKLACES CHOKERS2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu All Shoes'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Heels'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Sandals'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Boots Booties'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Platform Shoes'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu High Heels'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Stilettos'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu All Accessories'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu All Jewelry'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Earrings'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Necklaces Chokers'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Rings'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Bracelets'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu All Handbags Purses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Clutches'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Sunglasses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Hats'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Belts'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Beauty Hair Accessories'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Shoes and Accessories/submenu Scarves Wraps'), 0)

WebUI.closeBrowser()

