<div align="center">

<br/>

# Java Console Quiz Application

<p>
  <img src="https://img.shields.io/badge/Java-17%2B-f89820?style=flat-square&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Paradigm-OOP-5865F2?style=flat-square" />
  <img src="https://img.shields.io/badge/Files-3%20only-22c55e?style=flat-square" />
  <img src="https://img.shields.io/badge/Dependencies-None-6b7280?style=flat-square" />
  <img src="https://img.shields.io/badge/License-MIT-f0c000?style=flat-square" />
</p>

<p>A simple, beginner-friendly Java quiz application built with OOP principles —<br/>just 3 files, no setup hassle.</p>

[Overview](#overview) &nbsp;·&nbsp; [Features](#features) &nbsp;·&nbsp; [Structure](#project-structure) &nbsp;·&nbsp; [OOP Concepts](#oop-concepts) &nbsp;·&nbsp; [Running](#how-to-run) &nbsp;·&nbsp; [Roadmap](#roadmap)

<br/>

</div>

---

## Overview

A **console-based multiple-choice quiz** that tests your Java knowledge. The user answers 10 questions (A / B / C / D), gets instant feedback after each answer, and sees a final score with a performance message at the end.

---

## Features

- 10 multiple choice questions (MCQs)
- Instant right / wrong feedback after each answer
- Final score with percentage
- Performance message based on score range
- Input validation — handles unexpected or empty inputs
- Option to play again at the end

---

## Project Structure

```
SimpleQuizApp/
├── Main.java        ← Entry point (starts the quiz)
├── QuizApp.java     ← All quiz logic + 10 questions
└── Question.java    ← Question model (OOP class)
```

---

## OOP Concepts

| Concept | Where Used |
|---|---|
| **Class & Object** | `Question` class; `QuizApp` object created in `Main` |
| **Encapsulation** | Private fields in `Question` with public getters |
| **ArrayList** | Stores all questions dynamically |
| **Methods** | Logic split into `loadQuestions()`, `displayQuestion()`, `showResults()` |

---

## Technologies Used

<img src="https://img.shields.io/badge/Java-17%2B-f89820?style=flat-square&logo=openjdk&logoColor=white" /> &nbsp;Core Java only — no external libraries.

`Scanner` for console input &nbsp;·&nbsp; `ArrayList` for storing questions

---

## How to Run

### Option 1 &nbsp;·&nbsp; VS Code (Easiest)

1. Install [VS Code](https://code.visualstudio.com/)
2. Install the **Extension Pack for Java** by Microsoft
3. Open the `SimpleQuizApp` folder in VS Code
4. Open `Main.java` and click the **Run** button

### Option 2 &nbsp;·&nbsp; Terminal

```bash
# Step 1 — Compile all files
javac Main.java Question.java QuizApp.java

# Step 2 — Run the app
java Main
```

---

## Sample Output

```
==================================================
        WELCOME TO THE JAVA QUIZ APP!
==================================================
  Total Questions : 10
  Enter A, B, C or D for each question.
==================================================

Press ENTER to start...

--------------------------------------------------
Q1: What does JVM stand for?
--------------------------------------------------
   A) Java Very Much
   B) Java Virtual Machine
   C) Java Visual Manager
   D) Just a Virtual Module
--------------------------------------------------
Your answer (A/B/C/D): B
  Correct!

--------------------------------------------------
Q2: Which keyword is used to create an object in Java?
--------------------------------------------------
   A) create
   B) object
   C) new
   D) make
--------------------------------------------------
Your answer (A/B/C/D): C
  Correct!

==================================================
                   QUIZ RESULTS
==================================================
  Total Questions : 10
  Correct Answers : 8
  Wrong Answers   : 2
  Your Score      : 80%
--------------------------------------------------
  Excellent! Keep it up!
==================================================

Would you like to play again? (y/n):
```

---

## Score & Performance

| Score | Message |
|---|---|
| 100% | PERFECT SCORE! Outstanding! |
| 80% – 99% | Excellent! Keep it up! |
| 60% – 79% | Good job! Keep practicing! |
| 40% – 59% | Fair attempt. Review and retry! |
| Below 40% | Don't give up! Try again! |

---

## Roadmap

- [ ] Add more questions
- [ ] Shuffle questions randomly
- [ ] Add difficulty levels (Easy / Medium / Hard)
- [ ] Save high score to a file
- [ ] Add a timer per question

---

## Author

**Nishant Yadav** &nbsp;·&nbsp; <img src="https://cdn.simpleicons.org/github/181717" width="14" valign="middle"/> &nbsp;[@nishantnirwan](https://github.com/nishantnirwan) &nbsp;·&nbsp; <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/LinkedIn_icon.svg/250px-LinkedIn_icon.svg.png?20210220164014" width="14" valign="middle"/> &nbsp;[LinkedIn](https://linkedin.com/in/nishantyadav13)

---

## License

Released under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

<div align="center">
  <sub>Built by <a href="https://github.com/nishantnirwan">Nishant Yadav</a></sub>
</div>