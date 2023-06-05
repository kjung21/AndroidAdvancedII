# Survey of Advanced Testing Topics

## Testing Coroutines

- Testing Asynchronous Code: 
  - An introduction to the theory and challenges of testing asynchronous code on Android
- Review of Testing Coroutines: 
  - Review of coroutines testing strategies covered up to this point
- viewModelScope and TestCoroutineDispatcher: 
  - Test coroutines in a ViewModel and using TestCorotuineDispatcher (Code Checkpoint)
- MainCoroutineRule and Injecting Dispatchers: 
  - Use best practices and strategies for removing boilerplate when testing coroutines
- StatisticsViewModelTest: 
  - Setup StatisticsViewModel for testing
- Testing Coroutine Timing: 
  - Write a test where you pause and resume coroutine execution to test a loading indicator

## Error Handling
    
- Testing Error Handling:
  - Write a test that makes sure errors are handled correctly

## Testing your Data Layer

- Testing Room: 
  - Write a tests for a Room DAO
- Testing Local Data Source: 
  - Write tests for a local data source

## Testing Databinding

- Idling Resources and End-to-End Testing: 
  - Introduces EspressoIdlingResources and when you use them
- Counting Idling Resource: 
  - Setup your first end to end test. 
  - Setup your application code to use CountingIldingResource so Espresso can test code 
  - that involves long running operation (like network calls)
- Databinding Idling Resource: 
  - Setup an Espresso test for code that uses the DataBinding library
- Using Idling Resources: 
  - Write tests that use EspressoIdlingResource

## Testing Global Navigation

- Testing Global App Navigation: 
  - Write End to End tests that include Global App Navigation (Code Checkpoint)

## TestCoroutineDispatcher timing controls

- [advanceTimeBy](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/advance-time-by.html)
- [advanceUntilIdle](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/advance-until-idle.html)
- [runCurrent](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/run-current.html)

## References

- [Easy Coroutines in Android](https://medium.com/androiddevelopers/easy-coroutines-in-android-viewmodelscope-25bffb605471)
- [StandardTestDispatcher vs. UnconfinedTestDispatcher](https://craigrussell.io/2022/01/19/comparing-standardtestdispatcher-and-unconfinedtestdispatcher)
- [Android testing with Espresso Idling Resources and testing fidelity](https://medium.com/androiddevelopers/android-testing-with-espressos-idling-resources-and-testing-fidelity-8b8647ed57f4)

