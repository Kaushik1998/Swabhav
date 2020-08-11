const startButton = document.getElementById("start-btn");
const nextButton = document.getElementById("next-btn");
const previousButton = document.getElementById("previous-btn");
const submitButton = document.getElementById("submit-btn");
const questionContainer = document.getElementById("question-container");
const answerButtons = document.getElementById("answer-buttons");
const question = document.getElementById("question");
let rightAnswers = 0;
let wrongAnswers = 0;
let questionsAttempted = 0;

let i = 0;

startButton.addEventListener("click", startGame);
nextButton.addEventListener("click", nextQuestion);
previousButton.addEventListener("click", previousQuestion);
submitButton.addEventListener("click", addLocalStorage);

function addLocalStorage() {
  localStorage.setItem("rightAnswers", rightAnswers);
  localStorage.setItem("wrongAnswers", wrongAnswers);
  localStorage.setItem(
    "questionsUnAttempted",
    questions.length - questionsAttempted
  );
}

function nextQuestion() {
  if (questionsAttempted < questions.length) {
    if (i + 1 == questions.length) {
      i = 0;
    } else {
      i++;
    }
    setQuestion();
  } else {
    alert("You have attempted all questions .\nPlease click on Submit Button.");
  }
  document.body.style.backgroundColor = "aquamarine";
}

function previousQuestion() {
  if (i == 0) {
    i = questions.length - 1;
  } else {
    i--;
  }
  setQuestion();
  document.body.style.backgroundColor = "aquamarine";
}

function startGame() {
  startButton.classList.toggle("hide");
  questionContainer.classList.toggle("hide");
  nextButton.classList.toggle("hide");
  previousButton.classList.toggle("hide");
  submitButton.classList.toggle("hide");
  setQuestion();
}

function setQuestion() {
  removeAnswer();
  question.innerText = `${i + 1})  ${questions[i].question}`;
  questions[i].answers.forEach((element) => {
    let button = document.createElement("button");
    button.innerText = element.text;
    button.classList.add("btn");
    button.dataset.correct = element.correct;
    button.setAttribute("onclick", "submitAnswer(this)");
    //button.addEventListener("click", submitAnswer(button));
    answerButtons.appendChild(button);
  });
}

function submitAnswer(btn) {
  if (!questions[i].attempted) {
    questions[i].attempted = true;
    questionsAttempted++;
    if (btn.dataset.correct == "true") {
      rightAnswers++;
      document.body.style.backgroundColor = "rgb(54,241,102)";
      //alert("Right");
    } else {
      wrongAnswers++;
      document.body.style.backgroundColor = "rgb(254,57,57)";
      //alert("Wrong");
    }
  } else {
    alert("You have already attempted");
  }
  //   if (questionsAttempted == questions.length) {
  //     submitButton.classList.remove("hide");
  //   }
}

function removeAnswer() {
  while (answerButtons.firstChild) {
    answerButtons.removeChild(answerButtons.firstChild);
  }
}

const questions = [
  {
    question: "What is 2 + 2?",
    answers: [
      { text: "4", correct: true },
      { text: "22", correct: false },
    ],
    attempted: false,
  },
  {
    question: "What is the name of our country?",
    answers: [
      { text: "India", correct: true },
      { text: "Pakistan", correct: false },
      { text: "Iran", correct: false },
      { text: "Britain", correct: false },
    ],
    attempted: false,
  },
  {
    question: "What is going on in the training?",
    answers: [
      { text: "GoLang", correct: false },
      { text: "JavaScript", correct: true },
      { text: "Java", correct: false },
      { text: "Python", correct: false },
    ],
    attempted: false,
  },
  {
    question: "What is 4 * 2?",
    answers: [
      { text: "6", correct: false },
      { text: "8", correct: true },
    ],
    attempted: false,
  },
  {
    question: "What is the best code editor?",
    answers: [
      { text: "VS Code", correct: true },
      { text: "Notepad++", correct: false },
      { text: "LibreOffice", correct: false },
      { text: "Notepad", correct: false },
    ],
    attempted: false,
  },
];
