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

Mobile.startExistingApplication('com.android.chrome')

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Search or type web address (4)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Search or type web address (5)'), 'https://wndsr.dev/', 
    10)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - httpswndsr.dev'), 10)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (3)'), 'jeFw60i$^5#9', 10)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - ENTER (3)'), 30)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView -'), 30)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (4)'), 'Lola High Slit Satin Dress', 30)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - GO'), 30)

Mobile.delay(10)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.TextView - Lola High Slit Satin Dress (5)'), 
    30)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lola High Slit Satin Dress (5)'), 30)

Mobile.tap(findTestObject('Object Repository/android.view.View'), 20)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView'), 20)

Mobile.tap(findTestObject('Object Repository/android.widget.Button -'), 20)

Mobile.closeApplication()

