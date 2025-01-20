package org.example.project


data class Question(
    val id: Int,
    val questionContent: Content,
    val options: List<Content>,
    val correctAnswer: Int // Index of the correct option
)

val question = listOf(
    Question(
        id = 1,
        questionContent = Content.Text("Consider implementation of a database. Among the following options, choose the most appropriate data structure for this."),
        options = listOf(
            Content.Text("B+ tree"),
            Content.Text("Linked list"),
            Content.Text("Queue"),
            Content.Text("Stack")
        ),
        correctAnswer = 0 // First option is correct
    ),
    Question(
        id = 2,
        questionContent = Content.Text("There are 200 students in a school, out of which 120 students play football, 50 students play cricket, and 30 students play both football and cricket. The number of students who play one game only is:"),
        options = listOf(
            Content.Text("110"),
            Content.Text("140"),
            Content.Text("200"),
            Content.Text("170")
        ),
        correctAnswer = 0 // First option is correct
    ),
    Question(
        id = 3,
        questionContent = Content.Text("Which of the following are true:\n" +
                "(A) Ogive graph is used to measure the median of the collection of data.\n" +
                "(B) Two events A and B are such that P(A) = 1/2 and P(B) = 7/12, and P(not A not B) = 1/4, then A and B are independent events.\n" +
                "(C) Relation for mean, mode, and median is given by Mode = 3 Median – 2 Mean.\n" +
                "(D) The number of two-digit even numbers formed from digits 1, 2, 3, 4, 5 is 10.\n\n" +
                "Choose the correct answer from the options given below:"),
        options = listOf(
            Content.Text("(A) and (B) only"),
            Content.Text("(A), (C) and (D) only"),
            Content.Text("(C) and (D) only"),
            Content.Text("(B) and (C) only")
        ),
        correctAnswer = 1 // Second option is correct
    ),
    Question(
        id = 4,
        questionContent = Content.Text("There are 15 points in a plane such that 5 points are collinear and no three of the remaining points are collinear. Then the total number of straight lines formed are:"),
        options = listOf(
            Content.Text("105"),
            Content.Text("95"),
            Content.Text("96"),
            Content.Text("106")
        ),
        correctAnswer = 2 // Third option is correct
    ),
    Question(
        id = 5,
        questionContent = Content.Text("Match List – I with List – II:\n" +
                "List – I: Asynchronous, Trigger, J-K Flip-flop, D flip-flop\n" +
                "List – II: A pulse that causes a logic device to be activated, The operation is not executed in step with the clock, Flip-flop with set, reset, toggle and hold modes, Flip-flop with at least set and reset modes."),
        options = listOf(
            Content.Text("[(A – I); (B – II); (C – III); (D – IV)]"),
            Content.Text("[(A – II); (B – I); (C – III); (D – IV)]"),
            Content.Text("[(A – III); (B – IV); (C – II); (D – I)]"),
            Content.Text("[(A – I); (B – II); (C – IV); (D – III)]")
        ),
        correctAnswer = 1 // Second option is correct
    ),

)


