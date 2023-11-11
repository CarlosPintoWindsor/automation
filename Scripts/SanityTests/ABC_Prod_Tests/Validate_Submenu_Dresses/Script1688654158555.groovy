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

WebUI.mouseOver(findTestObject('ABC_Prod_OR/Dresses/menu_dresses'))

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_style'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_occasion'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_all_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_formal_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_party_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_cocktail_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_club_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_summer_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_sundresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_long_sleeve_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_casual_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_ball_gowns'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_short_and_mini_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_midi_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_long_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_maxi_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_skater_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_prom_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_graduation_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_wedding_guest_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_homecoming_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_damas_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_green_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_black_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_white_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_red_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_pink_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_blue_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_floral_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_satin_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_sequin_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_glitter_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_rhinestone_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_velvet_dresses'), 0)

WebUI.verifyElementPresent(findTestObject('ABC_Prod_OR/Dresses/submenu_sweater_dresses'), 0)

WebUI.closeBrowser()

