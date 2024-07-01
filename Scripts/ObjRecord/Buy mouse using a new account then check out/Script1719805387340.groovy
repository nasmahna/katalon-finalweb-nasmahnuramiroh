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

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/span_MICE'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h1_DISCOVER OUR WIRELESS MICE'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h1_DISCOVER OUR WIRELESS MICE'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/a_Microsoft Sculpt Touch Mouse'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h1_MICROSOFT SCULPT TOUCH MOUSE'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h1_MICROSOFT SCULPT TOUCH MOUSE'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/path'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h3_SHOPPING CART (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h3_SHOPPING CART (1)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_PRODUCT NAME'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_PRODUCT NAME'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_MICROSOFT SCULPT TOUCH MOUSE'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_MICROSOFT SCULPT TOUCH MOUSE'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/a_EDIT'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/span_Color_rabbit'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/button_CHECKOUT (49.99)'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/button_REGISTRATION'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input__usernameRegisterPage'), 'Bonita')

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/label_Email'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input__emailRegisterPage'), 'bonita@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Mouse/input__passwordRegisterPage'), 'SoMB3EzsHYLQBvZMwOp0BA==')

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/label_Confirm password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Mouse/input__confirm_passwordRegisterPage'), 'SoMB3EzsHYLQBvZMwOp0BA==')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input_PERSONAL DETAILS_first_nameRegisterPage'), 'Bonita')

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/label_Last Name'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input_- Use maximum 30 character_last_nameR_6ef033'), 'Wle wle')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input_- Use maximum 30 character_phone_numb_7c938a'), '12345678')

WebUI.selectOptionByValue(findTestObject('Object Repository/ObjRecord/Mouse/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:745', true)

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/label_City'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input_Country_cityRegisterPage'), 'aesfdgfhgj')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input_- Use maximum 25 character_addressReg_9e23b3'), 'wqasedfg')

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/label_State  Province  Region'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input_- Use maximum 50 character_state__pro_272a54'), 'qwer')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input_- Use maximum 10 character_postal_cod_639c2f'), '1234')

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/input_Receive exclusive offers and promotio_5c7450'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/button_REGISTER'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h3_ORDER PAYMENT'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h3_ORDER PAYMENT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_1. SHIPPING DETAILS'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_1. SHIPPING DETAILS'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_Donita Donita'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_Donita Donita'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_2. PAYMENT METHOD'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_2. PAYMENT METHOD'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/input_Choose payment method below_safepay'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/label_SafePay username'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Mouse/input__safepay_username'), 'Bonita')

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/label_SafePay password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Mouse/input__safepay_password'), 'SoMB3EzsHYLQBvZMwOp0BA==')

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/button_PAY NOW'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/span_Thank you for buying with Advantage'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/span_Thank you for buying with Advantage'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/p_Your tracking number is 7393065355       _5ea167'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/p_Your tracking number is 7393065355       _5ea167'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/svg_Management Console_menuCart'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h3_SHOPPING CART (0)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/h3_SHOPPING CART (0)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_Your shopping cart is empty'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ObjRecord/Mouse/label_Your shopping cart is empty'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Mouse/a_HOME'))

WebUI.closeBrowser()

