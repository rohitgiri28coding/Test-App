package org.example.project

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay


@Composable
fun TestSectionWithTimer(questions: List<Question>, totalTimeSeconds: Int = 5400) {
    var currentQuestionIndex by remember { mutableStateOf(0) }
    var selectedOption by remember { mutableStateOf(-1) }
    var showResult by remember { mutableStateOf(false) }
    var showEvaluationScreen by remember { mutableStateOf(false) } // New state for evaluation screen
    var score by remember { mutableStateOf(0) }
    var timeLeft by remember { mutableStateOf(totalTimeSeconds) }
    val incorrectQuestions = remember { mutableStateListOf<Question>() }

    // Timer logic
    LaunchedEffect(showResult) {
        if (!showResult) {
            while (timeLeft > 0) {
                delay(1000L)
                timeLeft--
            }
            showResult = true
        }
    }

    when {
        showEvaluationScreen -> {
            // Show evaluation screen
            showEvaluation(incorrectQuestions) {
                // Callback to go back to the result screen
                showEvaluationScreen = false
            }
        }
        showResult -> {
            // Result Screen
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Your Score: $score/${questions.size}", fontSize = 24.sp)
                    Spacer(Modifier.height(16.dp))
                    Button(onClick = {
                        // Restart test
                        showResult = false
                        currentQuestionIndex = 0
                        score = 0
                        selectedOption = -1
                        incorrectQuestions.clear()
                        timeLeft = totalTimeSeconds
                    }) {
                        Text("Restart Test")
                    }
                    Spacer(Modifier.height(16.dp))
                    Button(onClick = {
                        // Navigate to evaluation screen
                        showEvaluationScreen = true
                    }) {
                        Text("Evaluate Incorrect Questions")
                    }
                }
            }
        }
        else -> {
            // Question Screen
            val question = questions[currentQuestionIndex]

            Column(
                modifier = Modifier.fillMaxSize().padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Timer Display
                Text(
                    text = "Time Left: ${timeLeft / 3600}:${(timeLeft % 3600) / 60}:${timeLeft % 60}",
                    fontSize = 18.sp
                )

                // Render question content
                RenderContent(question.questionContent)

                // Options List
                question.options.forEachIndexed { index, option ->
                    Row(
                        modifier = Modifier.fillMaxWidth().clickable { selectedOption = index },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = selectedOption == index,
                            onClick = { selectedOption = index }
                        )
                        RenderContent(option)
                    }
                }

                Spacer(Modifier.height(16.dp))

                // Navigation Buttons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(onClick = {
                        if (currentQuestionIndex > 0) {
                            currentQuestionIndex--
                            selectedOption = -1
                        }
                    }, enabled = currentQuestionIndex > 0) {
                        Text("Previous")
                    }

                    Button(onClick = {
                        if (selectedOption == question.correctAnswer) {
                            score++
                        } else {
                            incorrectQuestions.add(question)
                        }

                        if (currentQuestionIndex < questions.size - 1) {
                            currentQuestionIndex++
                            selectedOption = -1
                        } else {
                            showResult = true
                        }
                    }, enabled = selectedOption != -1) {
                        Text(if (currentQuestionIndex == questions.size - 1) "Submit" else "Next")
                    }
                }
            }
        }
    }
}

@Composable
fun showEvaluation(incorrectQuestions: List<Question>, onBack: () -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Title
        item {
            Text("Incorrect Questions:", fontSize = 20.sp)
            Spacer(Modifier.height(16.dp))
        }

        // Iterate over incorrect questions
        items(incorrectQuestions) { question ->
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                RenderContent(question.questionContent)
                Spacer(Modifier.height(8.dp))

                // Iterate over options
                question.options.forEachIndexed { index, option ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val isCorrect = index == question.correctAnswer
                        Text(
                            text = if (isCorrect) "Correct Answer: " else "Option: ",
                            color = if (isCorrect) Color.Green else Color.Black,
                            modifier = Modifier.weight(1f)
                        )
                        RenderContent(option)
                    }
                }
                Spacer(Modifier.height(16.dp))
            }
        }

        // Back Button
        item {
            Spacer(Modifier.height(16.dp))
            Button(onClick = onBack, modifier = Modifier.fillMaxWidth()) {
                Text("Back to Results")
            }
        }
    }
}

