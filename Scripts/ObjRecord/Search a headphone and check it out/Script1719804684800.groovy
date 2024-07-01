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

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/svg_Sign out_menuSearch'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Search Headphone/input_Sign out_autoComplete'), 
    'beats')

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/p_BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/h1_BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/h1_BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/svg_Management Console_menuCart'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/h3_SHOPPING CART (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/h3_SHOPPING CART (1)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/td_BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/td_BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/button_CHECKOUT (179.99)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_Already have an account'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_Already have an account'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Search Headphone/input_Already have an account_usernameInOrd_818284'), 
    'Tanya')

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Search Headphone/input_Username_passwordInOrderPayment'), 
    'Mc+Vg2pXQ54/Yx2wqap+iA==')

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/button_LOGIN'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/h3_ORDER PAYMENT'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/h3_ORDER PAYMENT'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_1. SHIPPING DETAILS'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_1. SHIPPING DETAILS'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_Tanya Pratama'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_Tanya Pratama'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_2. PAYMENT METHOD'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_2. PAYMENT METHOD'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/input_Choose payment method below_safepay'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/input__safepay_username'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Search Headphone/input__safepay_username'), 
    'Tanya')

WebUI.click(findTestObject('ObjRecord/Search Headphone/input__safepay_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Search Headphone/input__safepay_password'), 
    'Mc+Vg2pXQ54/Yx2wqap+iA==')

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/button_PAY NOW'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/span_Thank you for buying with Advantage'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/span_Thank you for buying with Advantage'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/p_Your tracking number is 7393065352       _d9ddac'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/p_Your tracking number is 7393065352       _d9ddac'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/span_Order Summary'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/span_Order Summary'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_TOTAL                      179.99'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Search Headphone/label_TOTAL                      179.99'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Search Headphone/a_HOME'))

WebUI.closeBrowser()

