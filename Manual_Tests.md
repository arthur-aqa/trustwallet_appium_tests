# Manual Tests for Trust Wallet

## Feature: Creating a new wallet

### Scenario: Successful creation of a new wallet
```gherkin
Given the user launches the application
And is on the "Create Wallet" screen
When the user presses the "Create" button
Then the password entry screen is displayed with the title "Create passcode"

When the user enters the pin code "123456"
Then the password confirmation screen is displayed with the title "Confirm passcode"

When the user confirms the pin code by entering "123456"
Then the notifications screen is displayed with the title "Keep up with the market!"

When the user presses the "Skip, I'll do it later" button
Then the message "Brilliant, your wallet is ready!" is displayed

When the user presses the continue button
Then they are taken to the main screen
And the "HomeNavigationButton" navigation button is displayed
When the user copies the wallet address from the app
And opens the blockchain explorer in a browser
And pastes the address into the explorer's search field
Then the explorer displays the correct wallet address and its details
```

### Scenario: Attempting to create a wallet with mismatched pin codes
```gherkin
Given the user is on the "Create Wallet" screen
When the user presses the "Create" button
Then the password entry screen is displayed with the title "Create passcode"

When the user enters a pin code "123456"
Then the password confirmation screen is displayed with the title "Confirm passcode"

When the user enters a different pin code "654321"
Then an error message is displayed indicating the pin codes do not match
When the user copies the wallet address from the app
And opens the blockchain explorer in a browser
And pastes the address into the explorer's search field
Then the explorer displays the correct wallet address and its details
```

### Scenario: Accepting notifications during wallet creation
```gherkin
Given the user is on the "Create Wallet" screen
When the user presses the "Create" button
Then the password entry screen is displayed with the title "Create passcode"

When the user enters the pin code "123456"
Then the password confirmation screen is displayed with the title "Confirm passcode"

When the user confirms the pin code by entering "123456"
Then the notifications screen is displayed with the title "Keep up with the market!"

When the user presses the "Allow" button
Then the message "Brilliant, your wallet is ready!" is displayed
And notifications are enabled for the application
When the user copies the wallet address from the app
And opens the blockchain explorer in a browser
And pastes the address into the explorer's search field
Then the explorer displays the correct wallet address and its details
```

### Scenario: Canceling wallet creation after entering pin code
```gherkin
Given the user is on the "Create Wallet" screen
When the user presses the "Create" button
Then the password entry screen is displayed with the title "Create passcode"

When the user enters the pin code "123456"
Then the password confirmation screen is displayed with the title "Confirm passcode"

When the user presses the back button
Then the user is returned to the password entry screen
When the user copies the wallet address from the app
And opens the blockchain explorer in a browser
And pastes the address into the explorer's search field
Then the explorer displays the correct wallet address and its details
```

### Scenario: Canceling wallet creation before entering pin code
```gherkin
Given the user is on the "Create Wallet" screen
When the user presses the "Create" button
Then the password entry screen is displayed with the title "Create passcode"

When the user presses the back button
Then the user is returned to the "Create Wallet" screen
When the user copies the wallet address from the app
And opens the blockchain explorer in a browser
And pastes the address into the explorer's search field
Then the explorer displays the correct wallet address and its details
```

### Scenario: Handling network error during wallet creation
```gherkin
Given the user is on the "Create Wallet" screen
And the device has no internet connection
When the user presses the "Create" button
Then an error message is displayed indicating a network error
When the user copies the wallet address from the app
And opens the blockchain explorer in a browser
And pastes the address into the explorer's search field
Then the explorer displays the correct wallet address and its details
```

### Scenario: Adding another wallet when already on the Home screen
```gherkin
Given the user is on the main screen (Home) with an existing wallet
When the user opens the wallet management menu
And selects "Add wallet"
Then the user is presented with options to create a new wallet or import an existing one
When the user chooses to create a new wallet

Then the message "Brilliant, your wallet is ready!" is displayed
When the user presses the continue button
Then the new wallet is added and the user is taken to the main screen showing multiple wallets
When the user copies the wallet address from the app
And opens the blockchain explorer in a browser
And pastes the address into the explorer's search field
Then the explorer displays the correct wallet address and its details
```

### Scenario: Canceling notifications during wallet recovery and then creating a new wallet
```gherkin
Given the user launches the Trust Wallet application
And is on the "Create Wallet" screen
When the user clicks "I already have a wallet"
Then the pin code entry screen is displayed with the title "Enter passcode"

When the user enters the pin code "123456"
Then the pin code confirmation screen is displayed with the title "Confirm passcode"

When the user confirms the pin code by entering "123456"
Then the notifications screen is displayed with the title "Keep up with the market!"

When the user presses the "Skip, I'll do it later" button
Then the wallet recovery options screen is displayed with options like "Type seed phrase" and "Enter passwords"

When the user clicks the "back" button
Then the user is returned to the "Create Wallet" screen

When the user clicks "Create new wallet"
Then the notifications screen is displayed with the title "Keep up with the market!"

When the user presses the "Skip, I'll do it later" button
Then the message "Brilliant, your wallet is ready!" is displayed
And the user is taken to the wallet creation completion page instantly
When the user copies the wallet address from the app
And opens the blockchain explorer in a browser
And pastes the address into the explorer's search field
Then the explorer displays the correct wallet address and its details
```
