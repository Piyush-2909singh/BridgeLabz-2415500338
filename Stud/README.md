
# JDBC Maven Project (generated)

This project is a Maven-based Java console application that demonstrates a menu-driven student database manager using JDBC.

## Structure
- Interfaces: `IConnection`, `IStudent`, `IMenu`
- Implementations: `DBConnection`, `StudentImpl`, `Menu`
- Model: `Student`
- Main class: `App` (starts the `Menu`)

## Setup
1. Edit `DBConnection.java` and change `URL`, `USER`, and `PASS` to match your database credentials.
2. Ensure the JDBC driver dependency in `pom.xml` matches your DB (default is MySQL).
3. Build with `mvn package` and run with `mvn exec:java` or run `App` from your IDE.

## Notes
- `StudentImpl` will create the `students` table if it doesn't exist.
- This project is generated to match the design shown in the provided image and the uploaded zip reference.
