
# JavaFX Arithmetic Calculator

A simple JavaFX-based arithmetic calculator that performs basic operations like **addition, subtraction, multiplication, and division**. The application supports a GUI for enhanced user interaction and logs calculation history.

## Features
✅ Perform basic arithmetic operations
✅ Switch between multiple screens using JavaFX
✅ Store calculation history using SQLite
✅ Robust error handling and input validation
✅ Built using Java, JavaFX, and SQLite

## Technologies Used
- **Java** (Core logic)
- **JavaFX** (GUI)
- **SQLite** (Database for storing history)
- **Maven** (Project management)

## Project Structure
```
project-root/
├── src/
│   ├── main/
│   │   ├── java/com/yourpackage/
│   │   │   ├── App.java (Main application entry point)
│   │   │   ├── controllers/
│   │   │   │   ├── PrimaryController.java (Handles primary screen)
│   │   │   │   ├── SecondaryController.java (Handles secondary screen)
│   │   │   ├── database/
│   │   │   │   ├── DatabaseManager.java (Handles SQLite connection)
│   │   │   │   ├── CalculationLogger.java (Stores calculations in DB)
│   ├── resources/
│   │   ├── fxml/
│   │   │   ├── primary.fxml (Main UI screen)
│   │   │   ├── secondary.fxml (History screen)
├── pom.xml (Maven dependencies)
```

## Setup & Installation
### Prerequisites
- Install **Java JDK 17+**
- Install **Maven**
- Install **VS Code** (or any IDE with JavaFX support)

### Steps
1. **Clone the repository:**
   ```sh
   git clone https://github.com/RaunitPathrabe16/VirtuNexa-Task1-MathsQuizApp.git
   cd JavaFX-Calculator
   ```
2. **Run the application:**
   ```sh
   mvn clean javafx:run
   ```

## Usage
- **Launch the app** and perform arithmetic operations.
- **Click "View History"** to see past calculations stored in SQLite.
- **Switch between primary and secondary screens** seamlessly.

## Screenshots
![Screenshot 2025-03-03 223038](https://github.com/user-attachments/assets/50b6cb31-6b52-4c49-b1c9-4ec3d0b439ff)
![Screenshot 2025-03-03 223102](https://github.com/user-attachments/assets/165a9f43-099b-446e-8a73-b0a69c7947cf)
![Screenshot 2025-03-03 222932](https://github.com/user-attachments/assets/12852a17-134a-4833-af65-80e3e5806738)

## Demo Video
[Watch Demo]

https://github.com/user-attachments/assets/8bd99e3b-97db-430c-bc59-586b5bd72857


## Contributing
1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to your branch (`git push origin feature-branch`)
5. Open a Pull Request

### Made by **Raunit Pathrabe**

