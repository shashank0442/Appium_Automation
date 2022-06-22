<H1>Welcome to Mobile Automation using Selenium Java & Appium </H1>
Please follow below setup steps.<br>
<H3>Java Setup</H3>
<H6><li>Setting up Java Home</H6>
<a href> https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux </a>
<H6><li>Setting up Android Home</H6>
https://kobkrit.com/setting-android-home-enviromental-variable-on-mac-os-x-after-install-android-studio-79f08a9d7ec

Setting ANDROID_HOME enviromental variable on Mac OS X After Install Android Studio
<br>

<b>In Terminal:</b>

nano ~/.bash_profile

<b>Add lines:</b>

export ANDROID_HOME=/YOUR_PATH_TO/android-sdk
export PATH=$ANDROID_HOME/platform-tools:$PATH
export PATH=$ANDROID_HOME/tools:$PATH

<b>Check it worked:</b>
source ~/.bash_profile
adb

<H6><li>Setting up gradle Home</H6>
https://docs.gradle.org/current/userguide/installation.html


Sample app to be downloaded from below URL 
https://repo1.maven.org/maven2/io/selendroid/selendroid-test-app/0.17.0/

