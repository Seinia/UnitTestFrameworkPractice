# Calculator Testing

## Overview
This project contains unit tests for the `Calculator-1.0.jar` library using JUnit. Each method of the `Calculator` class has a dedicated test class. The tests follow best practices, incorporating pre-conditions, post-conditions, and a data-driven approach.

## Features
- **JUnit Testing:** All tests are implemented using JUnit.
- **Pre/Post-conditions:** Each test includes necessary setup and teardown steps.
- **Data-driven Testing:** The test framework features are leveraged to demonstrate data-driven testing.
- **Parallel Execution:** Tests are configured to run in parallel using the test framework.

## Tested Methods
The following methods of the `Calculator` class are covered by the tests:
- `sum()`
- `sub()`
- `mult()`
- `div()`
- `pow()`
- `sqrt()`
- `tg()`
- `ctg()`
- `cos()`
- `sin()`
- `isPositive()`
- `isNegative()`

Additionally, the `sleep()` method from the `Timeout` class is tested.

## Setup & Execution
1. Ensure `Calculator-1.0.jar` is available in the classpath.
2. Install JUnit if not already installed.
3. Run the tests using:
   ```sh
   mvn test
   ```
   or
   ```sh
   gradle test
   ```

