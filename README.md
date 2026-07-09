# Wells Fargo Task 2 — Financial Counselor API

A Spring Boot application modelling the data layer for a financial counseling platform. Built with Spring Data JPA and an H2 in-memory database.


---

## Data Model

The application defines five JPA entities that map to the following relationship hierarchy:

```
Advisor ──< Client ──< Portfolio ──< PortfolioSecurity >── Security
```

### Entities

#### `Advisor`
Represents a financial advisor who manages one or more clients.

| Field | Type | Description |
|-------|------|-------------|
| `advisorId` | `long` | Auto-generated primary key |
| `firstName` | `String` | Advisor's first name |
| `lastName` | `String` | Advisor's last name |
| `address` | `String` | Advisor's address |
| `phone` | `String` | Advisor's phone number |
| `email` | `String` | Advisor's email address |

---

#### `Client`
Represents a client who is managed by an `Advisor`.

| Field | Type | Description |
|-------|------|-------------|
| `clientId` | `long` | Auto-generated primary key |
| `advisor` | `Advisor` | FK — the advisor managing this client |
| `firstName` | `String` | Client's first name |
| `lastName` | `String` | Client's last name |
| `address` | `String` | Client's address |
| `phone` | `String` | Client's phone number |
| `email` | `String` | Client's email address |
| `dob` | `String` | Client's date of birth |

---

#### `Portfolio`
Represents an investment portfolio owned by a `Client`.

| Field | Type | Description |
|-------|------|-------------|
| `portfolioId` | `long` | Auto-generated primary key |
| `client` | `Client` | FK — the client who owns this portfolio |
| `creationDate` | `String` | Date the portfolio was created |

---

#### `Security`
Represents a financial instrument (e.g. stock, bond, ETF).

| Field | Type | Description |
|-------|------|-------------|
| `securityId` | `long` | Auto-generated primary key |
| `issuerName` | `String` | Name of the issuing organisation |
| `securityType` | `String` | Type of security (e.g. Stock, Bond) |

---

#### `PortfolioSecurity`
A join entity linking a `Portfolio` to a `Security`, capturing the holding details.

| Field | Type | Description |
|-------|------|-------------|
| `portfolioSecurityId` | `long` | Auto-generated primary key |
| `portfolio` | `Portfolio` | FK — the portfolio holding this security |
| `security` | `Security` | FK — the security being held |
| `quantity` | `int` | Number of units held |
| `purchasePrice` | `double` | Price per unit at time of purchase |
| `purchaseDate` | `String` | Date the security was purchased |

---

## Entity Design Conventions

All entities follow the same JPA conventions, modelled after the provided `Advisor` template:

- Annotated with `@Entity` from `jakarta.persistence`
- Primary key annotated with `@Id` and `@GeneratedValue()` (auto-incremented, no setter exposed)
- Every column annotated with `@Column(nullable = false)` or a relationship annotation (`@ManyToOne` + `@JoinColumn`)
- A protected no-arg constructor (required by JPA)
- A public all-args constructor to initialise all instance variables
- Public getters and setters for every field except the ID

---

## Tech Stack

| Technology | Version |
|------------|---------|
| Java | 21 |
| Spring Boot | 3.0.4 |
| Spring Data JPA | (managed by Boot) |
| H2 Database | (in-memory, runtime) |
| Build Tool | Maven |

---

## Project Structure

```
src/main/java/com/wellsfargo/counselor/
├── Entrypoint.java
└── entity/
    ├── Advisor.java
    ├── Client.java
    ├── Portfolio.java
    ├── PortfolioSecurity.java
    └── Security.java
```

---

## How to Build and Run

### Prerequisites
- Java 21
- Maven (wrapper `./mvnw` is included in the project)

### Clean and Build
To compile the project and build the JAR file:
```bash
./mvnw clean package
```

### Run the Application
To run the Spring Boot application locally:
```bash
./mvnw spring-boot:run
```
Since the database configuration uses an in-memory H2 database, the application will spin up a transient database instance during runtime.

