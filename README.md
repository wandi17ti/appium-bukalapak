# Implement Automation Mobile using Appium Java (Bukalapak) on Windows

## Steps Configuration to run Mobile Automation (Manual)
- Download Java and set JAVA_HOME
- Download [Android Studio](https://developer.android.com/studio)
- Set ANDROID_HOME path to SDK Location
- Download Node.js v12(LTS)
- Download [Appium Desktop](http://appium.io/downloads.html)
- Install Java IDE [Eclipse](https://www.eclipse.org/downloads/)

## Maven Repository Configuration
- Open https://mvnrepository.com/
- Search Java_Client, Selenium Java, TestNG
- Copy dependency maven to .xml  

## How to setup
- Clone repository
- Open Project with Eclipse
- Then when see error tag @Test, point cursor to @Test > Add TestNG Library

## Inspect Element Tools

1. Appium Inspector
- Open Appium Desktop
- Start Server
- Start Inspector Session
- Create Desired capabilities and Start Session

2. Desired Capabilities
```
{
  "platformName": "android",
  "platformVersion": "9.0.0",
  "deviceName": "emulator-5554",
  "noReset": "True",
  "appPackage": "com.bukalapak.android",
  "appActivity": ".HomeActivity_",
  "automationName": "Appium",
  "app": "D:/Documents/Belajar Appium Bukalapak/com.bukalapak.android_2021-09-29.apk"
}
```

### Getting apk file Bukalapak using APKPure
- Download APKPure on Playstore
- Open APKPure
- Click Bukalapak Apps
- Click Export

### Getting appPackage and appActivity on Desired Capabilities 
```
adb logcat > log.txt
```
when the code executed then press the ralali apps on phone, then terminate the code.
It will show the logcat on log.txt
- open log.txt
- find "for activity" bukalapak

or using APKInfo

### Checking the devices already connected on laptop
```
adb devices
```
### if using Real Device, set to Developer Option and enable USD Debugging


## How to Run using Framework TestNG
- Make sure Appium Server is Started
- Run testng.xml to run the code on JAVA IDE (Eclipse)

Before running test, read this documentation<br/>
Reference :
https://testng.org/doc/documentation-main.html#running-testng

## Notes
- Eksekusi code yang masih tidak stabil sehingga bisa terjadi error
- Kodingan yang masih hard coding
