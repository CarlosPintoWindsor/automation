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

WebUI.callTestCase(findTestCase('SanityTests/LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Womens Floral Clothing  Floral Dresses, Floral Print Tops  More  Windsor DevTest/test_accept_15_offer'))

WebUI.click(findTestObject('KT_Test_OR/myaccount_home_main_menu'))

WebUI.click(findTestObject('KT_Test_OR/myaccount_dropdown_submenu'))

WebUI.sendKeys(findTestObject('KT_Test_OR/myaccount_email'), 'krishnat@windsorstore.com')

WebUI.setEncryptedText(findTestObject('KT_Test_OR/myaccount_password'), 'ExkZ5qkpVnkXXWXKyIxKHg==')

WebUI.click(findTestObject('KT_Test_OR/myaccount_signin_btn'))

WebUI.verifyElementText(findTestObject('KT_Test_OR/myaccount_logout_btn'), 'LOG OUT', FailureHandling.STOP_ON_FAILURE)
