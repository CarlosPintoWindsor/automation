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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Occassion/menu_occassion'))

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu PROM'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu HOMECOMING'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu GRADUATION'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu WEDDING'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu COCKTAIL'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu GOING-OUT'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu BIRTHDAY'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu CONCERT FESTIVAL'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu VACATION'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu WORKWEAR'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu WEDDING GUEST DRESSES2'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu BIRTHDAY OUTFITS2'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Prom Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Short Prom Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Prom Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Prom Shoes'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Prom Accessories'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Prom Shop'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Homecoming Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Homecoming Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Homecoming Shoes'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Homecoming Jewelry'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Homecoming Shop'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Graduation Desses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Graduation Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Wedding Guest Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Bachelorette'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Bridal Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Bridal Shower'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Rehearsal'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Honeymoon'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Shoes'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Accessories'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Wedding Shop'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Cocktail Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Cocktail Attire'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Going-Out Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Going-Out Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Going-Out Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Sequin Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Birthday Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Birthday Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Sweet 16 Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Q Damas Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Concert Festival Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Vacation Dresses Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu All Workwear'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Occassion/submenu Work Dresses'), 0)

WebUI.closeBrowser()

