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

WebUI.click(findTestObject('ABC_Prod_OR/decline_offer_popup'))

WebUI.mouseOver(findTestObject('ABC_Prod_OR/menu_newandnow'))

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_new_arrivals'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_best_sellers'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_gift_cards'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_blog'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_now_trending'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_all_new_arrivals'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_all_best_sellers'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_gift_cards_a'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_on_the_blog'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_summer_outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_floral_outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_white_outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_lace'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_satin'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_red_white_blue'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_corset_outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_cut-out_outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_wrap_outfits'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_ruched'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/submenu_mesh'), 0)

WebUI.closeBrowser()

