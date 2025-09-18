# 🎓 Student Grade Management System

A simple **console-based Java application** to manage student records and calculate grades based on subject marks.  
This version uses **ArrayList** for dynamic storage of student objects and applies **OOP concepts**.

---

## 🚀 Features
- Add multiple students with:
  - Name
  - Marks for any number of subjects
- Automatically calculates:
  - Average marks
  - Grade based on average
- Displays all student records in a clean format

---

## 🛠️ Tools & Technologies
- **Java (Core)**
- **Eclipse / IntelliJ IDEA**
- **OOP Concepts**
- **ArrayList Collection**

---

## 📂 Project Structure

├── Student.class

├── StudentGradeManagementSystem.class

├── StudentGradeManagementSystem.java # Main program 

├── README.md # Project documentation

---

## 📖 How It Works
1. User enters the **number of students**.  
2. For each student:
   - Enter **name**  
   - Enter **number of subjects**  
   - Enter marks for each subject  
   - Program calculates the **average marks** and assigns a grade:  
     - `A` : 90 and above  
     - `B` : 75 – 89  
     - `C` : 60 – 74  
     - `D` : 40 – 59  
     - `F` : Below 40  
3. Displays a summary of all students in the system.

---

## ▶️ Run the Program
## Compile

javac StudentGradeManagementSystem.java

## Run

java StudentGradeManagementSystem

## 📝 Sample Output

Enter number of students: 2





Enter student name: John

Enter number of subjects: 3

Enter marks for subject 1: 90

Enter marks for subject 2: 85

Enter marks for subject 3: 88





Enter student name: Alice

Enter number of subjects: 3

Enter marks for subject 1: 70

Enter marks for subject 2: 65

Enter marks for subject 3: 60

===== Student Records =====
Name: John
Marks: 90 85 88 
Average: 87.66666666666667
Grade: B
-------------------------
Name: Alice
Marks: 70 65 60 
Average: 65.0
Grade: C
-------------------------

