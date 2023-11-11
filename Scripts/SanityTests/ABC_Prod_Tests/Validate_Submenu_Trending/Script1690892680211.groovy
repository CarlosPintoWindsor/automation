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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Trending/menu_Trending'))

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu SUMMER OUTFITS2'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu DENIM OUTFITS2'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu RUFFLED DRESSES2'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Summer Outfits'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Floral Outfits'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu White Outfits'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Denim Outfits'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Red, White Blue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Cut-Out Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Wrap Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu HOCO Looks'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Fall Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Back To School'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Ruffled Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Midi Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Cargo Pants'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Flare Pants'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Trending/submenu Platform Shoes'), 0)

WebUI.closeBrowser()

