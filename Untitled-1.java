<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
package="com.example.compic.app">
<ap p lic atio n
android:allowBackup="true"
android:icon="@mipmap/ic_launcher"
android:label="@string/app_name"
android:roundIcon="@mipmap/ic_launcher_round"
android:supportsRtl="true"
android:theme="@style/AppTheme">
<activity android:name=".MainActivity">
<intent-filter>
<action android:name="android.intent.action.MAIN" />
<category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
</activity>
<activity
android:name=".Main2Activity"
android:label="@string/title_activity_main2"
android:theme="@style/AppTheme.NoActionBar" />
<activity android:name=".Main3Activity" />
<activity android:name=".Main4Activity"></activity>
</ap p lic atio n>
</manifest>
