# Google Maps

## Generate Debug Certificate

- Google recommends restricting API Keys
- View signing Report -> ./gradlew signingReport
- DEBUG
  - iOS: keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android
  - Windows: keytool -list -v -keystore "%USERPROFILE%\.android\debug.keystore" -alias androiddebugkey -storepass android -keypass android
- RELEASE
  - keytool -list -v -keystore your_keystore_name -alias your_alias_name

## Cloud based map styling

- map:mapId="MAP_ID"

## References

- [Get API Key](https://developers.google.com/maps/documentation/android-sdk/get-api-key)
- [Project](https://console.cloud.google.com/google/maps-apis/home;onboard=true?project=wander-388516&supportedpurview=project)
- [Restrict API Keys](https://developers.google.com/maps/api-security-best-practices#restrict_apikey)
- [Google Maps](https://www.google.com/maps)
- [Project Map Style](https://console.cloud.google.com/google/maps-apis/studio/styles?project=wander-388516)
- [Android Cloud based map styling](https://developers.google.com/maps/documentation/android-sdk/cloud-customization/overview)
- [LeakCanary](https://square.github.io/leakcanary/)

