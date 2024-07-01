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

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Speaker/input_OR_username'), 'Tanya')

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Speaker/input_Username_password'), 
    'Mc+Vg2pXQ54/Yx2wqap+iA==')

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/input_Email_remember_me'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/span_SPEAKERS'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/a_Bose Soundlink Bluetooth Speaker III'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/svg_Management Console_menuCart'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/label_BOSE SOUNDLINK BLUETOOTH SPEAKER III'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/button_CHECKOUT (269.99)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/h3_ORDER PAYMENT'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/h3_ORDER PAYMENT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_1. SHIPPING DETAILS'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_1. SHIPPING DETAILS'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_Tanya Pratama'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_Tanya Pratama'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_Brisbane'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_Brisbane'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_Australia'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_Australia'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_09876543'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_09876543'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_2. PAYMENT METHOD'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/label_2. PAYMENT METHOD'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/input_Choose payment method below_safepay'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/label_SafePay username'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Speaker/input__safepay_username'), 'Tanya')

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/label_SafePay password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Speaker/input__safepay_password'), 
    'Mc+Vg2pXQ54/Yx2wqap+iA==')

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/button_PAY NOW'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/span_Thank you for buying with Advantage'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/span_Thank you for buying with Advantage'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/p_Your tracking number is 7393065705       _57bcc8'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Speaker/p_Your tracking number is 7393065705       _57bcc8'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Speaker/a_HOME'))

WebUI.closeBrowser()

