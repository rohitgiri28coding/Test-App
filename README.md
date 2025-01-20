# Desktop Test App

This is a **Compose Multiplatform** desktop application designed to test your knowledge by presenting multiple-choice questions. The app supports both text-based and image-based content for questions and options, making it versatile for various use cases like quizzes, exams, or educational applications.

## Features

1. **Test Section**:

   - Displays questions (text or images).
   - Allows users to select answers with radio buttons.
   - Navigates between questions with "Next" and "Previous" buttons.
   - Submits the test and calculates the score.

2. **Evaluation Section**:

   - Displays incorrectly answered questions.
   - Shows the correct answers alongside the user's selected answers.
   - Supports mixed content types (text and images).
   - Back button to return to results.

3. **Timer**:

   - A countdown timer is displayed during the test.
   - Automatically submits the test when the time runs out.

4. **Dynamic Content**:

   - Supports questions and options with both text and image content.
   - Customizable question list using a sealed `Content` class.

5. **Restartable**:

   - Restart the test after viewing results or evaluations.

## Technologies Used

- **Compose Multiplatform**: For creating the user interface.
- **Coil**: For loading and displaying images.
- **Kotlin**: Core programming language.

## Installation

### Prerequisites

- JDK 11 or higher
- Kotlin 1.9 or later

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/rohitgiri28coding/Test-App
   ```

2. Open the project in your favorite IDE (e.g., Android Studios, IntelliJ IDEA).

3. Build the project:

   ```bash
   ./gradlew build
   ```

4. Run the app:

   ```bash
   ./gradlew run
   ```


## Data Model

### `Content` Sealed Class

Used for defining the type of content in questions and options:

```kotlin
sealed class Content {
    data class Text(val text: String) : Content()
    data class Image(val img: String) : Content() // URL or local image path
}
```

### `Question` Data Class

Defines the structure of each question:

```kotlin
data class Question(
    val id: Int,
    val questionContent: Content, // Text or Image for the question
    val options: List<Content>,   // List of Text or Image options
    val correctAnswer: Int        // Index of the correct answer
)
```

## How to Add Questions

1. Define questions and options in the `Question` data class.
2. Use `Content.Text` for text-based questions or options.
3. Use `Content.Image` for image-based questions or options (provide a URL or local path).
4. Add the question to the `questions` list.

## How It Works

1. The `TestSectionWithTimer` composable handles the test flow.
2. Each question is rendered using the `RenderContent` composable, which dynamically handles text or images.
3. After completing the test, the result screen is displayed.
4. Incorrect answers are displayed in the evaluation section with their correct options highlighted.

---

Feel free to contribute to this project! If you have suggestions or find bugs, open an issue or submit a pull request.

