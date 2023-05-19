const sign_in_btn = document.querySelector("#sign-in-btn");
const sign_up_btn = document.querySelector("#sign-up-btn");
const container = document.querySelector(".container");

sign_up_btn.addEventListener("click", () => {
  container.classList.add("sign-up-mode");
});

sign_in_btn.addEventListener("click", () => {
  container.classList.remove("sign-up-mode");
});


function validateUserName() {
var inputValue = document.getElementById("input").value;
var regexPattern = /^[A-Za-z][A-Za-z0-9_]{7,29}$/;

if(regexPattern.test(inputValue)) { return true; }

else { 
  alert("Enter a Valid UserName");
  return false;
  }
}