# IDLEBreakfast

**IDLEBreakfast** is a Java application that appears to manage and interact with food and restaurant data, including user authentication, food ordering, cart management, and feedback functionality.

## Features

Based on the detected files, the project likely supports:
- **User Authentication:** Login and registration (`Login.java`, `RegisterForm.java`, `AccountInfo.java`, `UserInfo.java`).
- **Food and Restaurant Management:** View all foods and all restaurants (`AllFood.java`, `AllResturant.java`, `Food.java`, `Resturant.java`).
- **Cart Functionality:** Add, remove, and manage food items in a cart (`Cart.java`).
- **Order Package Information:** Handling order/package details (`PackageInfo.java`).
- **Feedback System:** Users can provide feedback (`Feedbeck.java`).
- **Homepage/Dashboard:** A central home page or dashboard for navigation (`HomePage.java`).

## File Structure

- `AccountInfo.java` - Handles user account information.
- `AllFood.java`, `Food.java` - Management and display of foods.
- `AllResturant.java`, `Resturant.java` - Management and display of restaurants.
- `Cart.java` - Handles cart operations for orders.
- `Feedbeck.java` - Feedback management.
- `HomePage.java` - Main navigation/home page.
- `Login.java`, `RegisterForm.java` - User authentication.
- `PackageInfo.java` - Order/package information.
- `UserInfo.java` - User-specific information.
- `main.java` - Likely the entry point for the application.

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- A Java IDE or command-line tools

### Installation & Running

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Rahuldrabit/IDLEBreakfast.git
   cd IDLEBreakfast
   ```

2. **Compile the code:**
   Ensure the packaged classes are placed in a separate build directory:
   ```bash
   javac -d build *.java
   ```

3. **Run the application:**
   ```bash
   java -cp build ass1.main
   ```

> Adjust the class name if the main entry point differs.

## Usage

Once running, the application should present a menu or graphical interface (depending on implementation) to let users:
- Register or log in
- Browse foods and restaurants
- Add items to the cart and manage orders
- Provide feedback

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License

MIT.

## Disclaimer

This README is based on visible repository files and inferred functionality. For a complete feature list or code breakdown, consult the source files or provide further details.

---

**View the full project contents here:**  
[https://github.com/Rahuldrabit/IDLEBreakfast/tree/main](https://github.com/Rahuldrabit/IDLEBreakfast/tree/main)
