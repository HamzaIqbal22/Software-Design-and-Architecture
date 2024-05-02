# Software Design and Architecture

## Course Overview
This course introduced issues, techniques, strategies, representations, and patterns used to implement software systems, with an emphasis on the design and implementation of system-level software, large architectural models for System-On-Chip systems, Electronic-Design-Automation tool flows, and embedded systems.

Lab work for Software Design and Architecture accomplished using Java, Netbeans IDE and Apache Tomcat. Feel free to reference, but avoid copying.

In-depth exploration of critical aspects related to the implementation of software systems. Emphasizing the design and execution of system-level software, the delving into advanced topics such as large architectural models for System-On-Chip systems, Electronic-Design-Automation tool flows, and embedded systems. Gaining insights into issues, techniques, strategies, and prevalent patterns essential for crafting robust and efficient software systems.

## Project (Online E-Bookstore System) Overview

### Use Case Diagram
![image](https://github.com/HamzaIqbal22/Software-Design-and-Architecture/assets/81776951/c03761bc-1620-4ca2-a793-9d11404e85d8)

Key Actors:
Members: These are the main customers who can browse and purchase books from the e-bookstore. They have access to various functionalities, including searching for books by different
criteria and making purchases.
Guests: Visitors who can view catalogues and services but need to register as members to make purchases.
Sellers: Individuals who upload and sell books on the platform. They have the ability to manage their uploaded books and receive payments for successful sales.
Administrators: Facilitators who manage the overall functioning of the e-bookstore, including managing books, members, and sellers, ensuring smooth transactions, and maintaining the database.

### ER Diagram
![image](https://github.com/HamzaIqbal22/Software-Design-and-Architecture/assets/81776951/1b6d05f2-38fc-42b0-8234-26e463027ae7)

### Sequence Diagram for Member adding Book
![image](https://github.com/HamzaIqbal22/Software-Design-and-Architecture/assets/81776951/827da269-dd5f-4a5d-b0af-ecbb01e376d3)

### Sequence Diagram for Admin adding Book
![image](https://github.com/HamzaIqbal22/Software-Design-and-Architecture/assets/81776951/606aa74d-d106-465c-83ea-8f63fad0e154)

### Login View
![image](https://github.com/HamzaIqbal22/Software-Design-and-Architecture/assets/81776951/19f26908-131f-4ea6-83e9-3a6e8cded5de)

### Administrator View
![image](https://github.com/HamzaIqbal22/Software-Design-and-Architecture/assets/81776951/cc983bc6-92ce-4bb4-b411-f93d486100ff)

### Member View
![image](https://github.com/HamzaIqbal22/Software-Design-and-Architecture/assets/81776951/65f8875b-bd4a-45fe-9077-15760b9c7323)

### UI and Database View
![image](https://github.com/HamzaIqbal22/Software-Design-and-Architecture/assets/81776951/df3ab2e1-0188-4a3f-87ca-00b533659c38)
![image](https://github.com/HamzaIqbal22/Software-Design-and-Architecture/assets/81776951/3570c3d1-0f69-4019-87c5-b359f5fa1778)

Conclusion
The project is implemented using various technologies and databases tailored to each microservice's functionality. For instance, the login microservice incorporates GUI management and authentication, while the buy and add book microservices handle book purchasing and addition, respectively, using dedicated databases for each task.

Overall, the project aims to create a user-friendly and efficient online e-bookstore platform, enhancing access to literature and promoting a culture of reading globally.
