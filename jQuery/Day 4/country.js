const tbody = document.querySelector("tbody");
$.ajax({
  type: "GET",
  url: "http://restcountries.eu/rest/v2/all",
  data: "data",
  dataType: "JSON",
  success: function (response) {
    // $("#name").text(response[91].name);
    // $("#capital").text(response[91].capital);
    // $("#currency").text(response[91].currencies[0].symbol);

    response.forEach((element) => {
      let html = `<tr><td>${element.name}</td>
        <td>${element.capital}</td>
        <td><img src="${element.flag}"style="width: 100px;" alt=""></td></tr>`;
      $(tbody).append(html);
    });
  },
});
