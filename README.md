# Movie App Automation Suite 🎬

A professional **Automation Testing Framework** for a Movie Streaming Web Application, built with **Java + Selenium WebDriver** and designed following **industry-standard best practices**.

This project demonstrates my skills in:

- UI & API Automation Testing  
- Test Framework Design  
- Maintainable Test Architecture  
- Real-world QA Practices  

---

## 🚀 Project Overview

This automation suite validates core business flows of a movie streaming platform, focusing on reliability, scalability, and maintainability.

### Key Functional Areas Covered

- User Authentication (Login, Register, Forgot Password)  
- Movie Search & Filtering  
- Pagination  
- UI Validation  
- API Testing for Movie Data  

The framework is built to simulate **real QA project structure** used in professional environments.

---

## 🧠 Testing Approach

### ✔️ Automation Strategy

- Focus on **critical user journeys**
- Validate both **positive & negative scenarios**
- Combine **UI and API testing**
- Use data-driven testing where applicable

### ✔️ Design Principles

- Page Object Model (POM)
- Separation of concerns
- Reusable components
- Centralized configuration
- Clean logging & reporting

---

## 🛠 Tech Stack

- **Language:** Java 23  
- **UI Automation:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **API Testing:** REST Assured  
- **Build Tool:** Maven  
- **Reporting:** Allure Report  
- **Logging:** Log4j2 + SLF4J  
- **Data Handling:** OpenCSV  

---

## Project Structure

The project follows the **Page Object Model (POM)** pattern to enhance test maintenance and code reusability.

```text
src
├── main
│   └── java
│       ├── base        # BasePage and common configurations
│       ├── components  # Shared components (Header, Footer, etc.)
│       ├── driver      # WebDriver management (DriverManager)
│       ├── pages       # Page Classes (LoginPage, HomePage, etc.)
│       └── utils       # Utilities (ConfigReader, ScreenshotUtils, CSVUtils)
└── test
    └── java
        ├── api         # API Test classes
        ├── base        # BaseTest (Driver Setup/Teardown)
        ├── listeners   # TestNG Listeners (Logging, Screenshots on failure)
        └── tests       # Main Test Classes (LoginTest, SearchMovieTest, etc.)
    └── resources
        ├── config      # Configuration files (config.properties)
        ├── log4j2.xml  # Logging configuration
        └── ...         # Test Data (CSV, etc.)
```

---

## 📊 Reporting & Debugging

- Allure Report integration  
- Automatic screenshot capture on failures  
- Structured logging for easier debugging  
- Clear test result visualization  

---

## 📝 Test Coverage Status

| Feature | Coverage |
|--------|---------|
| Login | ✅ |
| Register | ✅ |
| Search | ✅ |
| Forgot Password | ✅ |
| Movie Filter | ✅ |
| Pagination | ✅ |
| API Testing | 🚧 In Progress |

---

## 💡 What This Project Demonstrates

- Ability to design a maintainable automation framework  
- Understanding of real QA workflows  
- Knowledge of UI & API automation  
- Clean coding practices  
- Scalable project structure  

---

## 📌 Future Improvements

- CI/CD integration (GitHub Actions/Jenkins)  
- Cross-browser execution  
- Dockerized test execution  
- Test data management enhancement

---

## 👨‍💻 Author

Automation Tester passionate about building reliable and scalable test frameworks.

---
