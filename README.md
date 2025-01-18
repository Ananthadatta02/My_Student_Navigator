# Student Management System
A simple Java application to manage student records with operations like add, remove, update, and display.

## Features
- Add a new student.
- Remove a student by name.
- Update a student's mobile number by ID.
- Display all student records.

## How to Run
1. Clone the repository:
   ```
   git clone https://github.com/username/student-management-system.git
   ```
2. Navigate to the project directory and compile the code:
   ```
   javac src/project/student_management_system/*.java
   ```
3. Run the program:
   ```
   java project.student_management_system.StudentMainClass
   ```

## Improvements for Better Usability and Maintenance

1. **Array Growth Logic**
   - The `grow()` method is included but not called in the code. This limits the application to managing 100 students. Implement the method or replace the array with a dynamic structure like `ArrayList`.

2. **Scanner Handling**
   - Ensure the newline character after `nextInt()` is handled using `s.nextLine()` to avoid input issues.

3. **Input Validation**
   - Validate inputs like `id`, `mobileNumber`, and `age` to ensure data integrity. For example:
     - Verify mobile numbers follow a valid format.
     - Restrict age to a reasonable range.

4. **User Experience**
   - Provide clearer error messages to guide the user (e.g., "Student Not Found" or "Enter Valid Mobile Number").

5. **Code Optimization**
   - Use collections like `ArrayList<Student>` to eliminate manual resizing and null handling for the student array.

6. **Exception Handling**
   - Add try-catch blocks to handle invalid user inputs and prevent application crashes.

7. **Readability**
   - Add meaningful comments to explain key parts of the code.
   - Use constants or enums for menu options (e.g., `ENROLL = 1`, `REMOVE = 2`) to make the code self-explanatory.

8. **Future Enhancements**
   - Modularize the code by separating logic into a `StudentManager` class.
   - Add file storage to save and load student records for persistence.

## Code Details
- The `Student` class represents student entities with attributes like ID, name, mobile number, age, degree, and stream.
- The `StudentMainClass` contains the main logic, including menu-driven operations for:
  - Enrolling a student.
  - Removing a student.
  - Updating a student's mobile number.
  - Displaying all student records.
- A fixed-size array is used to manage students, but it can be replaced with a dynamic data structure for scalability.

## Requirements
- Java 7 or higher.
