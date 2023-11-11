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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Wedding/menu_Wedding'))

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu WEDDING GUEST'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu BRIDESMAIDS'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu BACHELORETTE'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu FOR THE BRIDE'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu WHITE DRESSES'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu GREEN DRESSES'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu PINK DRESSES'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu BLACK DRESSES'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu All Wedding Guest Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Beach Wedding Guest Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Black Tie Wedding Guest Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Country Wedding Guest Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu All Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Black Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Green Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Red Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Blue Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Pink Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Purple Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Satin Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Sequin Bridesmaid Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Bridesmaid Heels'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Bridesmaid Dresses Under 100'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Bridesmaid Dresses Under 50'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Bachelorette Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Bachelorette Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Bridal Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Engagement Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Bridal Shower'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Rehearsal'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Beach Wedding Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Bridal Reception Dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Honeymoon'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Wedding Outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Shoes'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Accessories'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Wedding Shop'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Wedding/submenu Mother of The Bride'), 0)

WebUI.closeBrowser()

