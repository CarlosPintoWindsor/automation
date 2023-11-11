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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Clothing/menu_clothing'))

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu TOPS'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu BOTTOMS'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu JUMPSUITS ROMPERS'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu MATCHING SETS'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu JACKETS'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu INTIMATES SLEEP'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu SHOES'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu_all_clothing'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu All Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Crop Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Bodysuits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Corset Bustier Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Tank Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Short Sleeve Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Long Sleeve Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Graphic Tees'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Sequin Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Going-Out Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Blouses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Sweaters Cardigans'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Halter Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Tie Front Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Tees'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Off The Shoulder Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Basic Tops'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu All Bottoms'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Skirts'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Mini Skirts'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Midi Skirts'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Maxi Skirts'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Denim Skirts'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Jeans'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Pants'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Cargo Pants'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Flare Pants'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Leggings Joggers'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Shorts'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Jean Shorts'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Faux Leather Bottoms'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu All Jampsuits Rompers'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu All Matching Sets'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu All Jackets'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Blazers'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Jean Jackets'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Moto Faux Leather'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Dusters Kimonos'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu All Intimates Sleepwear'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Lingerie, Bras Bralettes'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Sticky Bras Shapewear'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu Loungwear'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Clothing/submenu All Shoes'), 0)

WebUI.closeBrowser()

