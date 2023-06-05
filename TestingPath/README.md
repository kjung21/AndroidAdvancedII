# Testing

## [Codelabs](https://codelabs.developers.google.com/?cat=Android&product=android)

- [Android Room with a View - Kotlin](https://developer.android.com/codelabs/android-room-with-a-view-kotlin#0)
- [Learn Jetpack Navigation](https://developer.android.com/codelabs/android-navigation#0)
- [Data Binding in Android](https://developer.android.com/codelabs/android-databinding#0)
- [Introduction to coroutines](https://developer.android.com/codelabs/basic-android-kotlin-training-introduction-coroutines?hl=en#0)
- [Use Kotlin Coroutines in your Android App](https://developer.android.com/codelabs/kotlin-coroutines?hl=en#0)
- [Learn advanced coroutines with Kotlin Flow and LiveData](https://developer.android.com/codelabs/advanced-kotlin-coroutines?hl=en#0)

## test vs androidTest

| test              | androidTest              |
|-------------------|--------------------------|
| Local Tests       | Instrumented Tests       |
| Local machine JVM | Real or emulated devices |
| Faster            | Slower                   |

## Local Tests that Require Android

- Add AndroidX Test dependencies
- Add Robolectric dependency
- Use AndroidX Test APIs
- Add AndroidJUnit4 test runner attribute

## AndroidX Test

- Collection of libraries that contain APIs for writing Android tests
- Provides Android components for tests (i.e. Activities, Applications, etc.)
- Used in both local and instrumented tests
- Uses Robolectric library to simulate Android components

## Check Dependencies

- Ctrl + Alt + Shift + S
- Select dependencies to update

