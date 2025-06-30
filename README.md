# Trust Wallet Appium Automated Tests

This project contains automated UI tests for the Trust Wallet mobile application using Appium and TestNG.

## Project Structure

```
trustwallet_appium_tests/
├── src/
│   ├── main/java/
│   │   ├── pages/      # Page Object classes for each app screen
│   │   └── utils/      # Test data, driver, wait helpers
│   └── test/java/
│       ├── tests/      # Test classes (CreateWalletTests, ImportWalletTests, etc.)
│       └── utils/Helpers/ # Helper classes for test flows
├── manual_tests.md     # Manual test scenarios (Gherkin)
├── testng.xml          # TestNG suite config
├── pom.xml             # Maven project file
└── README.md           # Project documentation
```

## Getting Started

### Prerequisites
- Java 11+
- Maven
- Appium server (default: http://127.0.0.1:4725/wd/hub)
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

To run a specific suite:
```bash
mvn -DsuiteXmlFile=testng.xml test
```

## Manual Test Scenarios
Manual test scenarios in Gherkin format can be found in `manual_tests.md` in the project root.

## License
MIT 