# Attendance_management_project

### Part 3 - Constructor Initialization & Auto-ID Generation
Added constructors for Student and Course with automatic unique ID generation using static counters.

### Part 4 - Encapsulation & AttendanceRecord Management
Implemented encapsulation and created the AttendanceRecord class:

**Changes Made:**
- **Student.java**: Made fields private, added public getters for studentId and name
- **Course.java**: Made fields private, added public getters for courseId and courseName
- **AttendanceRecord.java**: New class with:
  - Private fields: studentId (int), courseId (int), status (String)
  - Constructor with status validation (accepts "Present" or "Absent", case-insensitive; defaults to "Invalid" with warning)
  - Public getters for all fields
  - displayRecord() method to output attendance information
- **Main.java**: 
  - Added ArrayList to manage multiple attendance records
  - Created sample AttendanceRecord objects including validation testing
  - Displays all attendance records with validation warnings
