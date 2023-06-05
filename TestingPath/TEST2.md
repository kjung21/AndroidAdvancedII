# Intro to Test Doubles and Dependency Injection

## Test Doubles and Dependency Injection

- Test Doubles: 
  - An introduction to Test Doubles, including a Fake
- Make a FakeDataSource: 
  - Create a Fake data source (Code Checkpoint)
- Dependency Injection: 
  - An introduction to Dependency Injection
- Test Repository with Constructor Dependency Injection and DI: 
  - Use constructor dependency injection to swap in your test double

## Test Doubles and Dependency Injection for ViewModel

- Where else to Use Dependency Injection?:
  - Answer questions to assess how to set up dependency injection
- Set Up a Fake Repository: 
  - Create a fake repository
- Use the Fake Repository inside a ViewModel: 
  - Use constructor dependency injection with ViewModels

## Writing ViewModel and Fragment Integration Tests

- FragmentScenario: 
  - An introduction to FragmentScenario to create and control Fragments in tests
- Launch a Fragment from a Test: 
  - Launch a fragment using FragmentScenario
- Service Locators: 
  - What a Service Locator is, how to use it and how to create one
- Use a Service Locator: 
  - Use a Service Locator in your main code
- Use your Service Locator in your Tests: 
  - Use a Service Locator in your tests
- Using Espresso to Test a Fragment: 
  - An introduction to the Espresso UI testing framework 
  - and finish writing your fragment view model integration test
- Espresso Write Your Own Test: 
  - Practice writing your own fragment integration test with Espresso

## Mocking

- Introduction to Mocks: 
  - An introduction to Mocks, when to use them instead of Fakes and Mocking with Mockito
- Using Mockito to Write Navigation Tests: 
  - Write a test for the Navigation Component using Mockito

## Test Doubles

- Fake: test double that has a `working` implementation of the class 
  - but it is implemented in a way that makes it good for tests but unsuitable for production
- Mock: test double that tracks which of its methods were called
  - it then passes or fails a test depending on whether its methods were called correctly
- Stub: test double that includes no logic and only returns what you program it to return
  - A `StubTaskRepository` could be programmed 
  - to return certain combinations of tasks from `getTasks` for example
- Dummy: test double that is passed around but not used
  - such as if you just need to provide it as a parameter
  - if you had a `DummyTaskRepository`,
  - it would just implement the `TaskRepository` with **no** code in any of the methods
- Spy: test double which also keeps tracks of some additional information
  - for example, if you made a `SpyTaskRepository`, 
  - it might keep track of the number of times the `addTask` method was called

## Espresso

- Turn Off Animations on device/emulator
  - Window | Transition | Animator

## References

- [Testing Blog](https://testing.googleblog.com/2013/07/testing-on-toilet-know-your-test-doubles.html)
- [Test Doubles](https://developer.android.com/training/testing/fundamentals#test-doubles)
- [Dagger codelab](https://developer.android.com/codelabs/android-dagger#0)
- [Dependency injection in Android](https://developer.android.com/training/dependency-injection)
- [ViewModelProvider.Factory](https://developer.android.com/reference/androidx/lifecycle/ViewModelProvider.Factory.html)
- [Architecture Blueprints reactive sample](https://github.com/android/architecture-samples?files=1)
- [Navigation](https://developer.android.com/guide/navigation)
- [Mockito](https://site.mockito.org/)

