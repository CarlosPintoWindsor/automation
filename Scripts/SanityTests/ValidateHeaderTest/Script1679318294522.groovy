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

'Verify header is present : New & Now'
WebUI.mouseOver(findTestObject('Page_Search  Windsor DevTest/header_newandnow'))

WebUI.takeScreenshot()

'Verify header is present : DRESSES'
WebUI.mouseOver(findTestObject('Page_Search  Windsor DevTest/header_dresses'))

WebUI.takeScreenshot()

'Verify header is present : CLOTHING'
WebUI.mouseOver(findTestObject('Page_Search  Windsor DevTest/header_clothing'))

WebUI.takeScreenshot()

'Verify header is present : SHOES'
WebUI.mouseOver(findTestObject('Page_Search  Windsor DevTest/header_shoes'))

WebUI.takeScreenshot()

'Verify header is present : ACCESSORIES'
WebUI.mouseOver(findTestObject('Page_Search  Windsor DevTest/header_accessories'))

WebUI.takeScreenshot()

'Verify header is present : OCCASION'
WebUI.mouseOver(findTestObject('Page_Search  Windsor DevTest/header_occasion'))

WebUI.takeScreenshot()

'Verify header is present : SALE'
WebUI.mouseOver(findTestObject('Page_Search  Windsor DevTest/header_sale'))

WebUI.takeScreenshot()

'Verify correct page is opening on clicking : New & Now'
WebUI.check(findTestObject('Page_Search  Windsor DevTest/header_newandnow'))

WebUI.takeScreenshot()

'Verify correct page is opening on clicking : DRESSES'
WebUI.check(findTestObject('Page_Search  Windsor DevTest/header_dresses'))

WebUI.takeScreenshot()

'Verify correct page is opening on clicking : CLOTHING'
WebUI.check(findTestObject('Page_Search  Windsor DevTest/header_clothing'))

WebUI.takeScreenshot()

'Verify correct page is opening on clicking : SHOES'
WebUI.check(findTestObject('Page_Search  Windsor DevTest/header_shoes'))

WebUI.takeScreenshot()

'Verify correct page is opening on clicking : ACCESSORIES'
WebUI.check(findTestObject('Page_Search  Windsor DevTest/header_accessories'))

WebUI.takeScreenshot()

'Verify correct page is opening on clicking : OCCASION'
WebUI.check(findTestObject('Page_Search  Windsor DevTest/header_occasion'))

WebUI.takeScreenshot()

'Verify correct page is opening on clicking : SALE'
WebUI.check(findTestObject('Page_Search  Windsor DevTest/header_sale'))

WebUI.takeScreenshot()

