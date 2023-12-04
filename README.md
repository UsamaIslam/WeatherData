# Weather Data Project

This project fetches weather data using Spring Boot and exposes it through a RESTful API.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Running the Project](#running-the-project)
- [Usage](#usage)
- [Tests](#tests)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

These instructions will help you set up and run the project on your local machine.

### Prerequisites

Ensure that you have the following software installed on your machine:

- [Java](https://www.java.com/) (version X.X or higher)
- [Gradle](https://gradle.org/) (version X.X or higher)

### Installation

1. Clone the repository:

   ```bash
   git clone git@github.com:UsamaIslam/WeatherData.git
   ```

2. Navigate to the project directory:

   ```bash
   cd WeatherData
   ```

3. Build the project:

   ```bash
   ./gradlew build
   ```

## Running the Project

Follow these steps to run the project:

1. Run the application:

   ```bash
   ./gradlew bootRun
   ```

2. The application will start, and you can access it at [http://localhost:8080](http://localhost:8080).

## Usage

To use the application, make HTTP requests to the provided endpoints. For example:

- Get weather data: `GET http://localhost:8080/weather`

## Tests

Run tests using the following command:

```bash
./gradlew test
```

## Contributing

If you'd like to contribute to this project, please follow the [Contributing Guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE).
```