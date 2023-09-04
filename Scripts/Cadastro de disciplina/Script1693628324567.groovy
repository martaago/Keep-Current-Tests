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

WebUI.navigateToUrl('http://localhost:4200/login')

WebUI.setText(findTestObject('Object Repository/Page_Keep Current/input_Email_email'), 'marta.camilo@dcx.ufpb.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Keep Current/input_Password_password'), 'E+B79kYxIn7GcZgflfe1aA==')

WebUI.click(findTestObject('Object Repository/Page_Keep Current/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Keep Current/svg'))

WebUI.setText(findTestObject('Object Repository/Page_Keep Current/input_Course_name'), 'Sistemas de Informação - UFPB')

WebUI.click(findTestObject('Object Repository/Page_Keep Current/button_add new course'))

WebUI.click(findTestObject('Object Repository/Page_Keep Current/div_SISTEMAS DE INFORMAO - UFPB'))

WebUI.click(findTestObject('Object Repository/Page_Keep Current/svg'))

WebUI.setText(findTestObject('Object Repository/Page_Keep Current/input_Course_name'), 'Linguagem de Programação')

WebUI.setText(findTestObject('Object Repository/Page_Keep Current/input_Data de incio_rf'), '2023/06/05 08:00')

WebUI.setText(findTestObject('Object Repository/Page_Keep Current/input_Data de trmino_rh'), '2023/12/04 08:00')

WebUI.click(findTestObject('Object Repository/Page_Keep Current/button_add new subject'))

