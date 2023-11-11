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

'Open Windsor Dev link'
WebUI.navigateToUrl('https://wndsr.dev/password')

WebUI.maximizeWindow()

'Enter Login Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Windsor DevTest/input_Enter store using password_password'), 
    'rEfVhTO9Q6mFwJljIS/D5Q==')

'Click on the Enter button'
WebUI.click(findTestObject('Object Repository/Page_Windsor DevTest/button_Enter'))

'Check Windsor Logo on HomePage'
WebUI.verifyElementPresent(findTestObject('Page_Windsor Store Dev  Windsor DevTest/svg'), 30)

WebUI.click(findTestObject('ABC_Prod_OR/decline_offer_popup'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Dev_Environment_Test_Objects/dev_menu_dresses'))

WebUI.click(findTestObject('Dev_Environment_Test_Objects/dev_submenu_floral_dresses'))

WebUI.click(findTestObject('Dev_Environment_Test_Objects/dev_dress_selected_1'))

WebUI.click(findTestObject('Dev_Environment_Test_Objects/dev_btn_add_to_cart'))

WebUI.click(findTestObject('Dev_Environment_Test_Objects/dev_shopping_bag_icon'))

WebUI.click(findTestObject('Dev_Environment_Test_Objects/dev_btn_checkout'))

WebUI.sendKeys(findTestObject('Regression/Information/info_email'), 'krishnat@windsorstore.com')

WebUI.sendKeys(findTestObject('Regression/Information/info_first_name'), 'Kris')

WebUI.sendKeys(findTestObject('Regression/Information/info_last_name'), 'Tayade')

WebUI.sendKeys(findTestObject('Regression/Information/info_address1'), '865 SW 17th St')

WebUI.sendKeys(findTestObject('Regression/Information/info_address2'), 'Ste 101')

WebUI.sendKeys(findTestObject('Regression/Information/info_city'), 'Redmond')

WebUI.click(findTestObject('Regression/Information/info_state_select'))

WebUI.selectOptionByLabel(findTestObject('Regression/Information/info_state_select'), 'Oregon', false)

WebUI.sendKeys(findTestObject('Regression/Information/info_zip'), '97756-2578')

WebUI.sendKeys(findTestObject('Regression/Information/info_phone'), '999999999')

WebUI.click(findTestObject('Regression/Information/info_continue_shipping'))

WebUI.click(findTestObject('Regression/Shipping/shipping_standard_shipping'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Regression/Shipping/shipping_continue_payment'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dev_Environment_Test_Objects/dev_btn_radio_cc'))

WebUI.enableSmartWait()

WebUI.dismissAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.executeJavaScript('$(\'button.ltkpopup-close.ltkpopup-close-button\').click();', [])

WebUI.setText(findTestObject('Dev_Environment_Test_Objects/dev_payment_cc_number'), '4242424242424242', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GlobalE/Desktop/lc_save_15_percent'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Dev_Environment_Test_Objects/dev_payment_cc_name'), 'Krish Tayade', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Dev_Environment_Test_Objects/dev_payment_cc_expiry'), '10/25', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Dev_Environment_Test_Objects/dev_payment_cc_security_code'), '123', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dev_Environment_Test_Objects/dev_btn_pay_now'))

WebUI.verifyElementPresent(findTestObject('Dev_Environment_Test_Objects/dev_order_confirmed'), 0)

