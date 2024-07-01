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

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

WebUI.click(findTestObject('Object Repository/ObjRecord/Login/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Login/input_OR_username'), 'Tanya')

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Login/input_Username_password'), 
    'Mc+Vg2pXQ54/Yx2wqap+iA==')

WebUI.click(findTestObject('Object Repository/ObjRecord/Login/span_REMEMBER ME'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Login/input_Email_remember_me'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Login/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Login/a_Tanya                                    _eb1a7d'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Login/label_My account'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Login/h3_Account details                    Edit'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Login/h3_Account details                    Edit'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Login/h3_Shipping details'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Login/h3_Shipping details'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ObjRecord/Login/span_Tanya'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Login/label_Sign out'))

WebUI.closeBrowser()

