This pull request includes updates to the Client, Portfolio, and Security classes to implement the required entities and their relationships. The changes ensure that the class structure aligns with the provided specifications for managing financial advisors, clients, portfolios, and securities.

Changes made:
Client Class:

Added @Entity annotation to mark the class as a persistent entity.
Defined attributes (clientId, firstName, lastName, email, phone) with appropriate annotations to map to database columns.
Implemented the many-to-one relationship with Advisor using @ManyToOne and @JoinColumn annotations.
Implemented methods for adding, updating, and removing portfolios for a client.
Portfolio Class:

Added: @Entity annotation to mark the class as a persistent entity.
Defined attributes (portfolioId, name) with appropriate annotations to map to database columns.
Implemented the one-to-one relationship with Client using @OneToOne and @JoinColumn annotations.
Implemented methods for adding, updating, and removing securities in the portfolio.
Security Class:

Added: @Entity annotation to mark the class as a persistent entity.
Defined attributes (securityId, name, category, purchaseDate, purchasePrice, quantity) with appropriate annotations to map to database columns.
Implemented the many-to-one relationship with Portfolio using @ManyToOne and @JoinColumn annotations.
Testing
I have tested all the classes with various scenarios to ensure that the changes are functioning as expected. All unit tests have passed successfully.
