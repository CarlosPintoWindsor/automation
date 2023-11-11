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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Homecoming/menu_Homecoming'))

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu HOMECOMING'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu COLOR'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu LENGTH'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu HOMECOMING DRESSES'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu LONG HOMECOMING DRESSES2'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu All Homecoming Dresses'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Homecoming Outfits'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Black Homecoming Dresses'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Green Homecoming Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Red Homecoming Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Pink Homecoming Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Blue Homecoming Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Short Homecoming Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Long Homecoming Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Skater Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Homecoming Shoes'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Homecoming Shop'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu HOCO Looks with'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Homecoming/submenu Homecoming Jewelry'), 0)

WebUI.closeBrowser()

