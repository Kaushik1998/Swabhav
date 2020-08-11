var ctx = document.getElementById("myChart").getContext("2d");

let rightAnswers = localStorage.getItem("rightAnswers");
let wrongAnswers = localStorage.getItem("wrongAnswers");
let unAnswered = localStorage.getItem("questionsUnAttempted");

var myChart = new Chart(ctx, {
  type: "pie",
  data: {
    labels: ["Right", "Wrong", "Unanswered"],
    datasets: [
      {
        label: "# of Votes",
        data: [rightAnswers, wrongAnswers, unAnswered],
        backgroundColor: [
          "rgba(54,241,102, 0.2)",
          "rgba(254,57,57, 0.2)",
          "rgba(255, 206, 86, 0.2)",
        ],
        borderColor: [
          "rgba(54,241,102, 1)",
          "rgba(254,57,57, 1)",
          "rgba(255, 206, 86, 1)",
        ],
        borderWidth: 1,
      },
    ],
  },
  options: {
    scales: {
      yAxes: [
        {
          ticks: {
            beginAtZero: true,
          },
        },
      ],
    },
  },
});
