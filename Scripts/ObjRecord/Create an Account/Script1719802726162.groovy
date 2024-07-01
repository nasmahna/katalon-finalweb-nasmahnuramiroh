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

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/path_CHECKOUT  (0.00)_menuUserSVGPath'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Register/input__usernameRegisterPage'), 
    'Kania')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Register/input__emailRegisterPage'), 'kania@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Register/input__passwordRegisterPage'), 
    '6gkX+T4CYIp6btxlJ1jCdA==')

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/label_Confirm password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ObjRecord/Register/input__confirm_passwordRegisterPage'), 
    '6gkX+T4CYIp6btxlJ1jCdA==')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Register/input_PERSONAL DETAILS_first_nameRegisterPage'), 
    'Kania')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Register/input_- Use maximum 30 character_last_nameR_6ef033'), 
    'Kaput')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Register/input_- Use maximum 30 character_phone_numb_7c938a'), 
    '1234567')

WebUI.selectOptionByValue(findTestObject('Object Repository/ObjRecord/Register/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:172', true)

WebUI.setText(findTestObject('Object Repository/ObjRecord/Register/input_Country_cityRegisterPage'), 
    'Brussels')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Register/input_- Use maximum 25 character_addressReg_9e23b3'), 
    'adsfghfj')

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/label_State  Province  Region'))

WebUI.setText(findTestObject('Object Repository/ObjRecord/Register/input_- Use maximum 50 character_state__pro_272a54'), 
    'aaaa')

WebUI.setText(findTestObject('Object Repository/ObjRecord/Register/input_- Use maximum 10 character_postal_cod_639c2f'), 
    '1234')

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/input_Receive exclusive offers and promotio_5c7450'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/button_REGISTER'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/a_Sonya                                    _10abac'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/label_My account'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/h3_Account details                    Edit'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/h3_Shipping details'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/h3_Preferred payment method                _89c885'))

WebUI.click(findTestObject('Object Repository/ObjRecord/Register/a_HOME'))

WebUI.closeBrowser()

