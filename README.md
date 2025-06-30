# Trust Wallet Appium Automated Tests

This project contains automated UI tests for the Trust Wallet mobile application using Appium and TestNG.

## Project Structure

```
src/
├── main/
│   └── java/
│       └── pages/                # Page Object classes (e.g., WelcomePage, PinCodePage, HomePage, etc.)
│       └── utils/                # Utility classes (TestData, WaitUtils, etc.)
├── test/
│   └── java/
│       └── tests/
│           └── Base/            # Base test class
│           └── CreateWallet/    # Tests for wallet creation
│           └── ...              # Other test folders
│   └── Manual_Tests.md          # Manual test scenarios in Gherkin format
└── testng.xml                   # TestNG suite configuration
```

## Getting Started

### Prerequisites
- Java 11+
- Maven
- Appium server running (default: http://127.0.0.1:4725/wd/hub)
- Android emulator or real device

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/arturm20691/trustwallet_appium_tests.git
   cd trustwallet_appium_tests
   ```
2. Install dependencies:
   ```bash
   mvn clean install
   ```
3. Start the Appium server:
   ```bash
   appium server -p 4725 -a 127.0.0.1 -pa /wd/hub
   ```
4. Configure your device/emulator as needed.

### Running Tests
To run all tests:
```bash
mvn test
```

To run a specific suite (e.g., Create Wallet tests):
```bash
mvn -DsuiteXmlFile=src/testng.xml test
```

## Key Components
- **Page Objects**: Encapsulate UI interactions for each screen (e.g., WelcomePage, PinCodePage, HomePage, ImportSeedPage, etc.)
- **TestData**: Centralized test data and constants
- **WaitUtils**: Utility methods for explicit waits
- **BaseTest**: Common setup/teardown and flows for all tests

## Manual Test Scenarios
Manual test scenarios in Gherkin format can be found in `src/test/java/tests/Manual_Tests.md`.

## Notes
- The project does **not** include SendTests or ImportWalletTests in this version.
- Update device capabilities and Appium server URL in `DriverUtils` if needed.
- For new test suites, follow the Page Object Model and add your tests in the appropriate folder.

## License
MIT 