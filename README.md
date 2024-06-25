[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/FZvennty)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=15285904&assignment_repo_type=AssignmentRepo)
  [![HitCount](https://hits.dwyl.com/youth-innovations/LibraryManagementSystem.svg?style=flat-square)](http://hits.dwyl.com/youth-innovations/LibraryManagementSystem)
  
# Welcome to Our Engineering Community!

**Welcome to our engineering community!** We're thrilled to **welcome** you on board. Engineering is a journey filled with **exciting challenges** and **rewarding triumphs**, and we're here to **wholeheartedly support** you every step of the way.

As you embark on this **exciting adventure**, remember that you're **never alone**. Our community is a place where you can **learn, grow, and thrive**. Whether you're passionate about **coding, design, robotics**, or any other field of engineering, there's a place for you here.

Together, we'll **tackle complex problems**, **push the boundaries of innovation**, and **make a profound impact** on the world. So **roll up your sleeves**, unleash your **creativity**, and let's **forge something remarkable together**!

**Why It Matters:**

In today's dynamic IT landscape, excelling in technical competencies such as **Java programming** and **software design** is foundational. Equally vital are your **GitHub skills**, which empower you to actively contribute to open-source projects, collaborate seamlessly, manage versions effectively, and present your work transparently to recruiters. Strong GitHub profiles are highly sought after by recruiters, underscoring your readiness for pivotal roles in collaborative coding and project management within the tech industry.


**Welcome aboard, future engineers**. Your journey starts now. Let's make it **unforgettable**! 💡✨🔧🔬🔭🌟

<details>
<summary markdown="span"><h2>Welcome to the World of Library Management Systems! 📚✨</h2></summary>

Library Management Systems (LMS) are like magic wands for libraries, helping organize and share books with ease. Whether you're a librarian, student, or book enthusiast, LMS makes finding and enjoying books a breeze!

**What LMS Can Do:**

- **Easy Access:** LMS organizes books and materials so anyone can find what they need quickly.
- **Smooth Operations:** It helps librarians keep track of borrowed books, manage fines, and keep the library running smoothly.
- **User-Friendly:** Patrons can search for books, reserve them, and even renew online, making library visits a joy.

**Imagine This:**

Picture a library where finding your favorite book is as easy as a click. LMS makes it possible! Librarians can manage everything behind the scenes, ensuring every visit is a delightful experience.

Whether you're diving into a new adventure, researching a topic, or simply relaxing with a good book, our Library Management System is here to enhance your journey. Welcome to a world of knowledge and discovery!

Enjoy your time exploring books and beyond with our Library Management System. Let's embark on this reading adventure together! 🌟📖
</details>
<details>
<summary markdown="span"><h2>About the Assignment 📝</h2></summary>

In this assignment, students will develop a basic Library Management System (LMS) using Java. The assignment involves creating the following files and classes within the `src` directory:

### LibrarySystem.java

**Classes and Methods to Implement:**
- **LibrarySystem class:** This main class will serve as the entry point for the library management system.
  - **Methods to Implement:**
    - `addBook(String title, String author, String isbn)`: Adds a new book to the library inventory with the specified title, author, and ISBN.
    - `removeBook(String isbn)`: Removes a book from the library inventory based on its ISBN.
    - `updateBook(String isbn, String title, String author)`: Updates the title and author information of a book.
    - `checkoutBook(String isbn)`: Marks a book as checked out.
    - `returnBook(String isbn)`: Marks a checked-out book as returned.
    - `generateReport()`: Generates a report on library inventory and book borrowing statistics.

### Book.java

**Classes and Members to Implement:**
- **Book class:** Define the structure of a book object with the following attributes:
  - `String title`: The title of the book.
  - `String author`: The author of the book.
  - `String isbn`: The ISBN (International Standard Book Number) of the book.
  - `boolean available`: Indicates whether the book is available for borrowing (`true`) or checked out (`false`).
  
  - **Methods to Implement:**
    - `setTitle(String title)`, `setAuthor(String author)`, `setIsbn(String isbn)`: Methods to set the title, author, and ISBN of the book.
    - `getTitle()`, `getAuthor()`, `getIsbn()`: Methods to retrieve the title, author, and ISBN of the book.
    - `isAvailable()`, `setAvailable(boolean available)`: Methods to check the availability of the book and update its availability status.
    - `displayBookInfo()`: Method to display all information about the book, including title, author, ISBN, and availability status.

### Technical Hints:
- **Object-Oriented Design:** Use meaningful class and method names to improve code readability. Consider using encapsulation to protect the internal state of objects.
- **Error Handling:** Implement error handling for cases such as invalid ISBN format or book not found scenarios.
- **Documentation:** Add comments and documentation within your code to explain the purpose of each method and clarify how to use them.
- **Testing:** Test your implementation with sample data to ensure that all methods work correctly and handle edge cases appropriately.

This assignment introduces fundamental concepts of Java programming, including object-oriented principles, class design, and basic file handling. It aims to provide hands-on experience in developing a small-scale application while focusing on clarity and simplicity for beginners.

For more details on Java programming concepts or class design, refer to reliable Java resources such as Oracle's Java documentation or Java tutorials online.
</details>
<details>
<summary markdown="span"><h2>What You Need to Do ✅</h2></summary>

Follow these steps carefully to complete the Library Management System (LMS) assignment:
1. **Clone the Repository:** Start by cloning or forking the repository using the following command:
2. **Navigate to `src` Directory:** Go to the `src` directory of the cloned repository where you will implement your Java files:
3. **Implement the Classes and Methods:**
- **LibrarySystem.java:**
  - Implement the following methods in the `LibrarySystem` class:
    - `addBook(String title, String author, String isbn)`: Adds a new book to the library inventory.
    - `removeBook(String isbn)`: Removes a book from the library inventory.
    - `updateBook(String isbn, String title, String author)`: Updates the title and author information of a book.
    - `checkoutBook(String isbn)`: Marks a book as checked out.
    - `returnBook(String isbn)`: Marks a checked-out book as returned.
    - `generateReport()`: Generates a report on library inventory and book borrowing statistics.

- **Book.java:**
  - Define the `Book` class with the following attributes and methods:
    - Attributes: `String title`, `String author`, `String isbn`, `boolean available`.
    - Methods: `setTitle(String title)`, `setAuthor(String author)`, `setIsbn(String isbn)`, `getTitle()`, `getAuthor()`, `getIsbn()`, `isAvailable()`, `setAvailable(boolean available)`, `displayBookInfo()`.

4. **Build the Code:** Once you've implemented the classes and methods, build the code using the following command in the terminal:
5. **Test Your Code:** Run the compiled code to test your implementations. You can create a test file (`LibrarySystemTest.java`) to test each method individually or use a test suite for comprehensive testing.
6. **Submit Your Assignment:** Once you've verified that your code works correctly, you can submit your assignment as per the submission instructions provided by your instructor.
   
Follow these steps carefully to complete the assignment. Happy coding! 🚀
</details>
<details>
<summary markdown="span"><h2>📘🌟 Java Tutorials for Your Library Management System Project🌟📘<h2></summary>

- **Object-Oriented Programming in Java:**
  - [Object-Oriented Programming Concepts in Java](https://www.javatpoint.com/java-oops-concepts)

- **File Handling in Java:**
  - [Java File Handling Tutorial](https://www.geeksforgeeks.org/file-handling-java-using-filewriter-filereader/)

- **Exception Handling in Java:**
  - [Java Exception Handling](https://www.tutorialspoint.com/java/java_exceptions.htm)

- **JUnit Testing Framework:**
  - [JUnit Tutorial](https://www.tutorialspoint.com/junit/index.htm)

- **Java Documentation and API Reference:**
  - [Oracle Java SE Documentation](https://docs.oracle.com/javase/8/docs/)
</details>
