<img width="434" height="967" alt="Screenshot 2026-06-07 182740" src="https://github.com/user-attachments/assets/7e452fd7-5eb8-4288-aa2c-f72f4582e6c8" />
# SmartScreenApp

**Student:** Jesse Bennett  
**Student Number:** ST10519056  
**Module:** IMAD5112 (Android Development)  
**Date:** June 2026

---

## Overview

SmartScreenApp is a three-screen Android application designed to track and manage daily screen time usage. The app allows users to record screen time entries for multiple days with morning and afternoon time segments, plus notes for each day. All data is stored using parallel arrays and displayed using a WHILE loop.

---

## Features

### Screen 1: Splash Screen (MainActivity)
- Displays app branding with student name and number
- **Start Button:** Opens Main Screen to begin tracking
- **Exit Button:** Closes the application

### Screen 2: Main Screen (MainScreenActivity)
- **Input Fields:**
  - Date (EditText)
  - Morning Screen Time (EditText - integer)
  - Afternoon Screen Time (EditText - integer)
  - Notes (EditText)
- **Add Button:** Stores entry in parallel arrays and displays success message
- **Clear Button:** Clears all input fields
- **View Details Button:** Opens Detail Screen to view all entries
- **Feedback Display:** Shows status messages (success, error, full)

### Screen 3: Detail Screen (DetailActivity)
- Displays all entered screen time entries
- Shows Day, Morning time, Afternoon time, and Notes for each entry
- **Back Button:** Returns to Main Screen
- Data formatted and displayed using a WHILE loop

---

## Technical Implementation

### Architecture

**Three-Activity Architecture:**
- MainActivity (Splash Screen)
- MainScreenActivity (Data Entry Screen)
- DetailActivity (Data Display Screen)

### Data Management

**Parallel Arrays** (7 entries maximum):
```
val days = arrayOfNulls<String>(7)           // Stores dates
val morningTime = IntArray(7)                 // Stores morning minutes
val afternoonTime = IntArray(7)               // Stores afternoon minutes
val notes = arrayOfNulls<String>(7)           // Stores user notes
var counter = 0                               // Tracks number of entries
```

### Key Concepts Used

✅ **Variables & Data Types**
- Class-level variables for persistent data across user interactions
- String and Integer arrays for multiple data points
- Counter variable for array position tracking

✅ **Control Flow**
- IF statements (check if array is full, validate input)
- WHILE loop (iterate through array and display data)

✅ **Button Listeners**
- setOnClickListener for Add, Clear, View Details, Back buttons
- User interaction handling with appropriate feedback

✅ **Navigation Between Screens**
- Intent to open new activities
- putExtra() to pass individual data items between screens
- getIntExtra() and getSerializableExtra() to receive data
- finish() to close current screen and return to previous

✅ **UI Components**
- EditText for user input
- Button for user actions
- TextView for displaying data and feedback messages

✅ **Data Display**
- Loop through parallel arrays using WHILE loop
- Build formatted string with proper spacing and line breaks
- Display complete data set on Detail Screen

### Code Quality

- **Comments:** Student number and name on first two lines of each Kotlin file
- **Package Name:** com.example.smartscreenapp
- **Proper Naming:** Clear variable and method names following Kotlin conventions
- **Error Handling:** Input validation with user feedback

---

## How to Use

### Adding an Entry

1. **Open the app** → Click "Start" button on Splash Screen
2. **Enter data:**
   - Date: e.g., "2024-06-04"
   - Morning minutes: e.g., "30"
   - Afternoon minutes: e.g., "60"
   - Notes: e.g., "class"
3. **Click "Add"** → See "Entry added successfully"
4. Repeat steps 2-3 for more entries (max 7)

### Clearing Input

- Click **"Clear"** button to empty all fields for next entry

### Viewing All Entries

1. Click **"View Details"** button
2. Detail Screen displays all entered data in formatted view:
   ```
   Day: 2024-06-04
   Morning: 30 mins
   Afternoon: 60 mins
   Notes: class
   -------------------
   ```
3. Click **"Back"** to return to Main Screen

### Exiting the App

- Click **"Exit"** on Splash Screen to close application

---

## Screenshots

<img width="434" height="967" alt="Screenshot 2026-06-07 182740" src="https://github.com/user-attachments/assets/897b0a12-87d8-4ea4-9db9-da23271aaf2e" />

Splash Screen with app name, student information, Start and Exit buttons.

### [INSERT Main Screen Screenshot Here]
Main Screen showing input fields (date, morning time, afternoon time, notes) and buttons (Add, Clear, View Details). Shows "Entry added successfully" feedback message.

### [INSERT Detail Screen Screenshot Here]
Detail Screen displaying formatted list of all screen time entries with dates, times, and notes.

---

## GitHub Repository

**Repository:** SmartScreenApp  
**Commits Made:**
- Initial project setup with 3 activities and layouts
- MainActivity and DetailActivity implementation
- MainScreenActivity with parallel arrays
- DetailActivity data display with WHILE loop
- README documentation

All commits follow exam requirements with descriptive messages.

---

## Exam Requirements Met

✅ **Three Screens:** Splash → Main → Detail  
✅ **Parallel Arrays:** 4 related arrays (days, morningTime, afternoonTime, notes)  
✅ **Methods/Functions:** onClick listeners as event handlers  
✅ **Loop Control:** WHILE loop for displaying array data  
✅ **Error Handling:** User feedback for input validation  
✅ **GitHub Commits:** Regular commits after each feature  
✅ **README:** Complete with screenshots and explanation  
✅ **App Icon:** Custom launcher icon  
✅ **Comments:** Student number and name in code files  

---

## Testing

### Test Scenario 1: Add Single Entry
1. Start app
2. Enter: Date="2024-06-04", Morning="30", Afternoon="60", Notes="class"
3. Click Add
4. Verify: "Entry added successfully" message appears

### Test Scenario 2: View Entry
1. Click "View Details"
2. Verify: Detail Screen shows formatted entry
3. Click "Back"
4. Verify: Returns to Main Screen

### Test Scenario 3: Add Multiple Entries
1. Add 2 entries with different data
2. Click "View Details"
3. Verify: Both entries display correctly with separator lines

### Test Scenario 4: Clear Fields
1. Enter data
2. Click "Clear"
3. Verify: All fields become empty

### Test Scenario 5: Array Full
1. Add 7 entries
2. Try to add 8th entry
3. Verify: "All entries full" message appears

---

## Conclusion

SmartScreenApp successfully demonstrates core Android development concepts including multi-screen navigation, data management with parallel arrays, user input handling, and data display. The application provides a practical solution for tracking daily screen time usage.

---

**Submitted by:** Jesse Bennett (ST10519056)  
**Date:** June 2026
