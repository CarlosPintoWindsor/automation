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

WebUI.mouseOver(findTestObject('Regression/PDP/pdp_menu_Wedding'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp submenu Bridal Dresses'))

WebUI.enhancedClick(findTestObject('Regression/PDP/pdp_dress_selected'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_button_addtocart'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Cart/cart_bag_icon'))

WebUI.verifyElementText(findTestObject('Regression/Cart/cart_bag_counter'), '(1)')

WebUI.mouseOver(findTestObject('Regression/PLP/plp_menu_clothing'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PLP/plp_submenu All Bottoms'))

WebUI.enhancedClick(findTestObject('Regression/PLP/plp_product_selected'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/PDP/pdp_button_addtocart'))

CustomKeywords.'com.Tools.testClick'(findTestObject('Regression/Cart/cart_bag_icon'))

WebUI.verifyElementText(findTestObject('Regression/Cart/cart_bag_counter'), '(2)')
