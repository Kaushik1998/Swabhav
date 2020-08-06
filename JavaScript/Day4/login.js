const userID = document.getElementById("userID");
const password = document.getElementById("password");
const pUser = document.getElementById("pUser");
const pPassword = document.getElementById("pPassword");
function validate() {
  if (userID.value == "") {
    pUser.innerText = "User ID is Required";
    pUser.style.color = "red";
    // alert("User ID not Entered");
  } else {
    pUser.innerText = "";
  }
  if (password.value == "") {
    pPassword.innerText = "Password is Required";
    pPassword.style.color = "red";
    //alert("Password not Entered");
  } else {
    pPassword.innerText = "";
  }
  if (userID.value != "" && password.value != "") {
    //h6.innerText = `Welcome User ${userID.value} to the webpage.`;
    pUser.innerText = "";
    pPassword.innerText = "";
    alert(`Welcome User ${userID.value} to the webpage.`);
  }
}
