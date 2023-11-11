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

WebUI.click(findTestObject('Mobile_Regression/mobile_homepage_ship_to'))

WebUI.click(findTestObject('Mobile_Regression/mobile_country_select'))

WebUI.click(findTestObject('Mobile_Regression/mobile_homepage_3_bar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mobile_Regression/mobile_menu_wedding'))

WebUI.click(findTestObject('Mobile_Regression/mobile_submenu_for_the_bride'))

WebUI.click(findTestObject('Mobile_Regression/mobile_submenu_bridal_dresses'))

WebUI.click(findTestObject('Regression/PDP/pdp_dress_selected'))

WebUI.click(findTestObject('Regression/PDP/pdp_button_addtocart'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mobile_Regression/mobile_cart_bag_icon'))

WebUI.click(findTestObject('Regression/Cart/cart_checkout_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression/Information/info_email'), 'krishnat@windsorstore.com')

WebUI.click(findTestObject('GlobalE/Mobile/lc_shipping_country'))

WebUI.selectOptionByValue(findTestObject('GlobalE/Mobile/lc_shipping_country'), 'Australia', false)

WebUI.sendKeys(findTestObject('Regression/Information/info_first_name'), 'Kris')

WebUI.sendKeys(findTestObject('Regression/Information/info_last_name'), 'Tayade')

WebUI.sendKeys(findTestObject('Regression/Information/info_address1'), '123 Beach St')

WebUI.sendKeys(findTestObject('Regression/Information/info_address2'), 'U 1')

WebUI.sendKeys(findTestObject('Regression/Information/info_city'), 'Frankston')

WebUI.click(findTestObject('Regression/Information/info_state_select'))

WebUI.selectOptionByLabel(findTestObject('Regression/Information/info_state_select'), 'Victoria', false)

WebUI.sendKeys(findTestObject('Regression/Information/info_zip'), '3199')

WebUI.sendKeys(findTestObject('Regression/Information/info_phone'), '999999999')

WebUI.click(findTestObject('Regression/Information/info_continue_shipping'))

WebUI.click(findTestObject('Regression/Shipping/shipping_continue_payment'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Regression/Payment/payment_payment_message'), 0)

WebUI.verifyElementPresent(findTestObject('GlobalE/Desktop/lc_credit_card'), 0)

WebUI.verifyElementPresent(findTestObject('GlobalE/Desktop/lc_paypal'), 0)

WebUI.verifyElementPresent(findTestObject('GlobalE/Desktop/lc_klarna'), 0)

WebUI.click(findTestObject('Regression/Homepage/homepage_logo'))

WebUI.click(findTestObject('Mobile_Regression/mobile_homepage_ship_to'))

WebUI.click(findTestObject('GlobalE/Mobile/lc_mobile_select_country_canada'))

WebUI.click(findTestObject('Mobile_Regression/mobile_cart_bag_icon'))

WebUI.click(findTestObject('Regression/Cart/cart_checkout_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression/Information/info_email'), 'krishnat@windsorstore.com')

WebUI.click(findTestObject('GlobalE/Mobile/lc_shipping_country'))

WebUI.selectOptionByValue(findTestObject('GlobalE/Mobile/lc_shipping_country'), 'Canada', false)

WebUI.sendKeys(findTestObject('Regression/Information/info_first_name'), 'Kris')

WebUI.sendKeys(findTestObject('Regression/Information/info_last_name'), 'Tayade')

WebUI.sendKeys(findTestObject('Regression/Information/info_address1'), '1233 Monashee Frontage Rd')

WebUI.sendKeys(findTestObject('Regression/Information/info_address2'), 'B')

WebUI.sendKeys(findTestObject('Regression/Information/info_city'), 'Sicamous')

WebUI.click(findTestObject('Regression/Information/info_state_select'))

WebUI.selectOptionByLabel(findTestObject('Regression/Information/info_state_select'), 'British Columbia', false)

WebUI.sendKeys(findTestObject('Regression/Information/info_zip'), 'V0E 2V1')

WebUI.sendKeys(findTestObject('Regression/Information/info_phone'), '999999999')

WebUI.click(findTestObject('Regression/Information/info_continue_shipping'))

WebUI.click(findTestObject('Regression/Shipping/shipping_continue_payment'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Regression/Payment/payment_payment_message'), 0)

WebUI.verifyElementPresent(findTestObject('GlobalE/Desktop/lc_credit_card'), 0)

WebUI.verifyElementPresent(findTestObject('GlobalE/Desktop/lc_paypal'), 0)

WebUI.verifyElementPresent(findTestObject('GlobalE/Desktop/lc_klarna'), 0)

