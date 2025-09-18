# 🎓 Student Grade Management System

A simple **console-based Java application** to manage student records and calculate grades based on subject marks.  
This project demonstrates the use of **Core Java, OOP concepts, and arrays/objects**.

---

## 🚀 Features
- Add multiple students with:
  - Name
  - Roll Number
  - Marks for multiple subjects
- Calculates:
  - Total and Average Marks
  - Grade based on Average
- Displays a neat **Student Grade Report**

---

## 🛠️ Tools & Technologies
- **Java (Core)**
- **Eclipse / IntelliJ IDEA**
- **OOP Concepts**

---

## 📂 Project Structure
├── Student.java # Student class

├── StudentGradeManagement.java # Main program

├── README.md # Project documentation

---

## 📖 How It Works
1. The program asks for the **number of students** and **number of subjects**.  
2. For each student:
   - Enter Name and Roll Number
   - Enter marks for each subject
   - The program calculates the **average marks** and assigns a grade:
     - `A` : 90 and above  
     - `B` : 75 – 89  
     - `C` : 60 – 74  
     - `D` : 40 – 59  
     - `F` : Below 40  
3. At the end, a **Student Grade Report** is displayed.

---

## ▶️ Run the Program
### COMPILE

javac StudentGradeManagement.java

## Run

java StudentGradeManagement


## 📝 Sample Output

Enter number of students: 2
Enter number of subjects: 3

Enter name of Student 1: John
Enter Roll No of Student 1: 101
Enter marks for Subject 1: 90
Enter marks for Subject 2: 85
Enter marks for Subject 3: 88

Enter name of Student 2: Alice
Enter Roll No of Student 2: 102
Enter marks for Subject 1: 70
Enter marks for Subject 2: 65
Enter marks for Subject 3: 60

=== STUDENT GRADE REPORT ===

Student Name: John

Roll No: 101

Marks: 90 85 88 

Average: 87.66666666666667

Grade: B
-----------------------------

Student Name: Alice

Roll No: 102

Marks: 70 65 60 

Average: 65.0

Grade: C
-----------------------------




