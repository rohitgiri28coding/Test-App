package org.example.project


data class Question(
    val id: Int,
    val questionContent: Content,
    val options: List<Content>,
    val correctAnswer: Int // Index of the correct option
)

val questions1 = listOf(
    Question(
        id = 1,
        questionContent = Content.Text("Which of the following is a finite set?"),
        options = listOf(
            Content.Text("The set of real numbers."),
            Content.Text("The set of integers between 1 and 10."),
            Content.Text("The set of all points on a line."),
            Content.Text("The set of irrational numbers.")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 2,
        questionContent = Content.Text("If A = {1, 2, 3} and B = {2, 3, 4}, what is A ∩ B?"),
        options = listOf(
            Content.Text("{1, 2, 3, 4}"),
            Content.Text("{2, 3}"),
            Content.Text("{1, 4}"),
            Content.Text("{1}")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 3,
        questionContent = Content.Text("The set {x | x² - 4 = 0} is:"),
        options = listOf(
            Content.Text("{2, -2}"),
            Content.Text("{4, -4}"),
            Content.Text("{0}"),
            Content.Text("Empty Set")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 4,
        questionContent = Content.Text("Which of the following represents a singleton set?"),
        options = listOf(
            Content.Text("{1, 2}"),
            Content.Text("{a}"),
            Content.Text("{}"),
            Content.Text("{1, 2, 3}")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 5,
        questionContent = Content.Text("The universal set U = {1, 2, 3, 4, 5}. If A = {1, 2, 3}, then Aᶜ is:"),
        options = listOf(
            Content.Text("{1, 2}"),
            Content.Text("{3, 4}"),
            Content.Text("{4, 5}"),
            Content.Text("{1, 2, 3, 4, 5}")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 6,
        questionContent = Content.Text("If A = {1, 2, 3, 4} and B = {3, 4, 5, 6}, then A - B is:"),
        options = listOf(
            Content.Text("{1, 2}"),
            Content.Text("{3, 4}"),
            Content.Text("{5, 6}"),
            Content.Text("{1, 2, 5, 6}")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 7,
        questionContent = Content.Text("If P = {}, the cardinality of P is:"),
        options = listOf(
            Content.Text("1"),
            Content.Text("0"),
            Content.Text("-1"),
            Content.Text("Undefined")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 8,
        questionContent = Content.Text("If |A| = 4, then the number of subsets of A is:"),
        options = listOf(
            Content.Text("4"),
            Content.Text("8"),
            Content.Text("16"),
            Content.Text("32")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 9,
        questionContent = Content.Text("Which of the following is not a set?"),
        options = listOf(
            Content.Text("{x | x > 0}"),
            Content.Text("{x | x² = 4}"),
            Content.Text("{x | x is a beautiful flower}"),
            Content.Text("{x | x ∈ ℝ}")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 10,
        questionContent = Content.Text("Which of the following sets is a subset of every set?"),
        options = listOf(
            Content.Text("{1}"),
            Content.Text("{0}"),
            Content.Text("{}"),
            Content.Text("ℝ")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 11,
        questionContent = Content.Text("If A = {1, 2, 3} and B = {3, 4, 5}, what is A ∪ B?"),
        options = listOf(
            Content.Text("{1, 2, 3, 4, 5}"),
            Content.Text("{3, 4, 5}"),
            Content.Text("{3}"),
            Content.Text("{1, 2}")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 12,
        questionContent = Content.Text("If |A| = 10, |B| = 8, and |A ∩ B| = 4, then |A ∪ B| = ?"),
        options = listOf(
            Content.Text("22"),
            Content.Text("14"),
            Content.Text("10"),
            Content.Text("12")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 13,
        questionContent = Content.Text("If A = {1, 2, 3}, B = {2, 4}, and C = {1, 4}, then (A ∩ B) ∪ C is:"),
        options = listOf(
            Content.Text("{1, 2, 4}"),
            Content.Text("{1, 2, 3}"),
            Content.Text("{4}"),
            Content.Text("{1, 4}")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 14,
        questionContent = Content.Text("The union of two disjoint sets A and B:"),
        options = listOf(
            Content.Text("A"),
            Content.Text("B"),
            Content.Text("A ∩ B"),
            Content.Text("A ∪ B")
        ),
        correctAnswer = 3
    ),
    Question(
        id = 15,
        questionContent = Content.Text("If A = {1, 2, 3, 4} and B = {3, 4}, then B ⊆ A:"),
        options = listOf(
            Content.Text("True"),
            Content.Text("False")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 16,
        questionContent = Content.Text("If A = {x | x > 0} and B = {x | x² = 4}, then A ∩ B is:"),
        options = listOf(
            Content.Text("{2, -2}"),
            Content.Text("{2}"),
            Content.Text("{-2}"),
            Content.Text("{}")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 17,
        questionContent = Content.Text("If A ∪ B = A ∩ B, then:"),
        options = listOf(
            Content.Text("A ⊆ B"),
            Content.Text("A = B"),
            Content.Text("A ⊃ B"),
            Content.Text("None of the above")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 18,
        questionContent = Content.Text("If U = {1, 2, 3, 4, 5}, A = {2, 4}, and B = {3, 5}, then Aᶜ ∩ Bᶜ is:"),
        options = listOf(
            Content.Text("{1}"),
            Content.Text("{1, 3}"),
            Content.Text("{1, 2}"),
            Content.Text("{1, 5}")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 19,
        questionContent = Content.Text("Which of the following is true for all sets A and B?"),
        options = listOf(
            Content.Text("A ∩ A = A"),
            Content.Text("A ∪ A = A"),
            Content.Text("A ∩ ∅ = ∅"),
            Content.Text("All of the above")
        ),
        correctAnswer = 3
    ),
    Question(
        id = 20,
        questionContent = Content.Text("If A = {1, 2}, B = {2, 3}, and C = {3, 4}, then (A ∩ B) ∪ C =:"),
        options = listOf(
            Content.Text("{1, 2, 3, 4}"),
            Content.Text("{2, 3, 4}"),
            Content.Text("{3, 4}"),
            Content.Text("{2, 3}")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 21,
        questionContent = Content.Text("If A = {1, 2, 3}, how many proper subsets does A have?"),
        options = listOf(
            Content.Text("8"),
            Content.Text("7"),
            Content.Text("4"),
            Content.Text("3")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 22,
        questionContent = Content.Text("The power set of A = {a, b} is:"),
        options = listOf(
            Content.Text("{a, b}"),
            Content.Text("{{}, {a}, {b}, {a, b}}"),
            Content.Text("{a, {b}}"),
            Content.Text("{{a}, {b}}")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 23,
        questionContent = Content.Text("If A = {1, 2} and B = {1, 2, 3}, which of the following is true?"),
        options = listOf(
            Content.Text("A ⊂ B"),
            Content.Text("B ⊂ A"),
            Content.Text("A = B"),
            Content.Text("Aᶜ ⊂ B")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 24,
        questionContent = Content.Text("The number of subsets of A = {1, 2, 3, 4, 5} is:"),
        options = listOf(
            Content.Text("32"),
            Content.Text("16"),
            Content.Text("64"),
            Content.Text("25")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 25,
        questionContent = Content.Text("Which of the following sets has the maximum number of subsets?"),
        options = listOf(
            Content.Text("A = {1}"),
            Content.Text("B = {1, 2}"),
            Content.Text("C = {1, 2, 3}"),
            Content.Text("D = {1, 2, 3, 4}")
        ),
        correctAnswer = 3
    ),
    Question(
        id = 26,
        questionContent = Content.Text("If A ⊆ B and B ⊆ C, then:"),
        options = listOf(
            Content.Text("A ⊆ C"),
            Content.Text("C ⊆ A"),
            Content.Text("A ∪ C = B"),
            Content.Text("A ∩ C = B")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 27,
        questionContent = Content.Text("If a set has n elements, the number of subsets of size r is given by:"),
        options = listOf(
            Content.Text("n^r"),
            Content.Text("2^n"),
            Content.Text("nCr"), // Using "nCr" to represent binomial coefficient
            Content.Text("r^n")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 28,
        questionContent = Content.Text("If A = {1, 2, 3}, what is the cardinality of its power set?"),
        options = listOf(
            Content.Text("3"),
            Content.Text("6"),
            Content.Text("8"),
            Content.Text("9")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 29,
        questionContent = Content.Text("The subset {} of any set is called:"),
        options = listOf(
            Content.Text("Improper subset"),
            Content.Text("Proper subset"),
            Content.Text("Empty set"),
            Content.Text("None of the above")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 30,
        questionContent = Content.Text("For a set A = {1, 2, 3}, how many subsets contain exactly 2 elements?"),
        options = listOf(
            Content.Text("2"),
            Content.Text("3"),
            Content.Text("4"),
            Content.Text("6")
        ),
        correctAnswer = 3
    ),
    Question(
        id = 31,
        questionContent = Content.Text("If A ∩ B = ∅, which statement is true?"),
        options = listOf(
            Content.Text("A = B"),
            Content.Text("A and B are disjoint sets."),
            Content.Text("A ∪ B = ∅"),
            Content.Text("Aᶜ ∩ Bᶜ = ∅")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 32,
        questionContent = Content.Text("In a class of 40 students, 25 study Maths, 20 study English, and 10 study both. How many students study only Maths?"),
        options = listOf(
            Content.Text("15"),
            Content.Text("25"),
            Content.Text("10"),
            Content.Text("5")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 33,
        questionContent = Content.Text("In a survey, 100 people were asked if they liked tea or coffee. 60 liked tea, 50 liked coffee, and 30 liked both. How many liked only coffee?"),
        options = listOf(
            Content.Text("30"),
            Content.Text("20"),
            Content.Text("40"),
            Content.Text("50")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 34,
        questionContent = Content.Text("The shaded area in a Venn diagram represents A ∩ Bᶜ. What does this mean?"),
        options = listOf(
            Content.Text("Elements in A only."),
            Content.Text("Elements in B only."),
            Content.Text("Elements in A but not B."),
            Content.Text("Elements in B but not A.")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 35,
        questionContent = Content.Text("If A ∪ B = U and A ∩ B = ∅, then:"),
        options = listOf(
            Content.Text("A = B"),
            Content.Text("Aᶜ = B"),
            Content.Text("Aᶜ ∩ Bᶜ = ∅"),
            Content.Text("A ∪ Bᶜ = U")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 36,
        questionContent = Content.Text("How many regions are formed in a Venn diagram of 3 overlapping sets?"),
        options = listOf(
            Content.Text("4"),
            Content.Text("6"),
            Content.Text("8"),
            Content.Text("9")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 37,
        questionContent = Content.Text("A Venn diagram shows 50 people liking apples, 30 liking oranges, and 10 liking both. How many like only apples?"),
        options = listOf(
            Content.Text("10"),
            Content.Text("20"),
            Content.Text("30"),
            Content.Text("40")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 38,
        questionContent = Content.Text("If A ∪ B = {1, 2, 3, 4} and A = {1, 2}, then B can be:"),
        options = listOf(
            Content.Text("{3, 4}"),
            Content.Text("{1, 2}"),
            Content.Text("{1, 2, 3}"),
            Content.Text("{4}")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 39,
        questionContent = Content.Text("If A ∩ Bᶜ = A, what can we infer?"),
        options = listOf(
            Content.Text("A ⊆ B"),
            Content.Text("B ⊆ A"),
            Content.Text("A ∩ B = ∅"),
            Content.Text("A = B")
        ),
        correctAnswer = 2
    ),
    Question(
        id = 40,
        questionContent = Content.Text("In a survey, 200 people were asked about cricket and football. 120 liked cricket, 100 liked football, and 40 liked both. How many liked only football?"),
        options = listOf(
            Content.Text("40"),
            Content.Text("60"),
            Content.Text("80"),
            Content.Text("20")
        ),
        correctAnswer = 1
    ),
    Question(
        id = 41,
        questionContent = Content.Text("If A × B = {(1, a), (1, b), (2, a), (2, b)}, then A and B are:"),
        options = listOf(
            Content.Text("A = {1, 2}, B = {a, b}"),
            Content.Text("A = {a, b}, B = {1, 2}"),
            Content.Text("A = {1}, B = {a, b}"),
            Content.Text("None of the above")
        ),
        correctAnswer = 0
    ),
    Question(
        id = 42,
        questionContent = Content.Text("For A = {x | x > 0} and B = {x | x < 0}, what is A ∩ B?"),
        options = listOf(
            Content.Text("{}"),
            Content.Text("{x | x = 0}"),
            Content.Text("{x | x > 0}"),
            Content.Text("None of the above")
        ),
        correctAnswer = 0
        ),
        Question(
            id = 43,
            questionContent = Content.Text("If A × B = {(1, 2), (1, 3), (2, 2), (2, 3)}, then |A| and |B| are:"),
            options = listOf(
                Content.Text("2, 2"),
                Content.Text("1, 4"),
                Content.Text("2, 3"),
                Content.Text("4, 2")
            ),
            correctAnswer = 0
        ),
        Question(
            id = 44,
            questionContent = Content.Text("If A = {1, 2}, B = {a, b}, and C = {x, y}, how many elements are there in A × B × C?"),
            options = listOf(
                Content.Text("4"),
                Content.Text("8"),
                Content.Text("12"),
                Content.Text("16")
            ),
            correctAnswer = 2
        ),
        Question(
            id = 45,
            questionContent = Content.Text("For sets A and B, |A| = 3, |B| = 4. How many elements are in A × B?"),
            options = listOf(
                Content.Text("12"),
                Content.Text("7"),
                Content.Text("4"),
                Content.Text("3")
            ),
            correctAnswer = 0
        ),
        Question(
            id = 46,
            questionContent = Content.Text("If A ⊆ B, then A × C ⊆ B × C:"),
            options = listOf(
                Content.Text("True"),
                Content.Text("False")
            ),
            correctAnswer = 0
        ),
        Question(
            id = 47,
            questionContent = Content.Text("The Cartesian product of a set A with itself is:"),
            options = listOf(
                Content.Text("A²"),
                Content.Text("A × A"),
                Content.Text("A ∪ A"),
                Content.Text("None of the above")
            ),
            correctAnswer = 1
        ),
        Question(
            id = 48,
            questionContent = Content.Text("If A = {1, 2} and B = {a, b, c}, then how many ordered pairs can be formed?"),
            options = listOf(
                Content.Text("3"),
                Content.Text("6"),
                Content.Text("9"),
                Content.Text("12")
            ),
            correctAnswer = 1
        ),
        Question(
            id = 49,
            questionContent = Content.Text("If A = {1, 2, 3} and B = {x, y}, then A × B contains how many elements?"),
            options = listOf(
                Content.Text("5"),
                Content.Text("6"),
                Content.Text("9"),
                Content.Text("4")
            ),
            correctAnswer = 1
        ),
        Question(
            id = 50,
            questionContent = Content.Text("If A = {1, 2, 3}, B = {4, 5}, and C = {a, b}, how many elements are there in A × B × C?"),
            options = listOf(
                Content.Text("30"),
                Content.Text("20"),
                Content.Text("15"),
                Content.Text("12")
            ),
            correctAnswer = 0
        )

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


