// Collection containing the list of drugs that we offer.
// This allows us to dynamically maintain the drug list in one place,
// across all of our pages.
/*const map = new Map([
  ["Diabetedox", "Used in the treatment of diabetes"],
  ["Arthriticol", "Helps with arthritis"],
  ["Urimex", "Treats kidney failure"],
  ["Thrombitinin", "Prevents the onset of deep vein thrombosis"],
  ["Cervisave", "Reduces the symptoms associated with cervical cancer"],
]);*/

// Iterate through the drug map using the forEach loop, and generate table rows in Home Page.
/*map.forEach((value, key) => {
  try {
    document.getElementById("demo").innerHTML +=
      "<tr><td>" + `${key}` + "</td><td>" + `${value}` + "</td></tr>";
  } catch (e) {}
});*/

// Iterate through the drug map using the forEach loop, and generate dropdown options in Registration Page.
//map.forEach((value, key) => {
  //try {
    //document.getElementById("drugName").innerHTML +=
      //'<option value="' + `${key}` + '">' + `${key}` + "</option>";
//  } catch (e) {}
//});

// Generates a random card ID.
/*try {
  document.getElementById("random").innerHTML += Math.floor(
    Math.random() * 10000000000 + 1
  );
} catch (e) {}*/

// Validates that both answers are YES. If either is NO, then prints a message, and does not allow
// user to continue to the Registration Page.
var validateInput = () => {
  try {
    if (
      document.getElementById("citizen_yes").checked &&
      document.getElementById("insurance_yes").checked &&
      document.getElementById("age_yes").checked
      
    ) {
      return true;
    }
    document.getElementById("error_home_msg").innerHTML =
      "I'm sorry you're not eligible for this program!";
  } catch (e) {}
  return false;
};

// Validates that answer is YES. If NO, then prints a message.
var validateClaimInput = () => {
  try {
    if (
      document.getElementById("claim_yes").checked 
    ) {
      return true;
    }
    document.getElementById("error_claim_msg").innerHTML =
      "Click Yes to submit a claim.";
  } catch (e) {}
  return false;
};

/*// Validates that answer is YES. If NO, then prints a message.
var validateUserInput = () => {
  try {
    if (
      document.getElementById("user_yes").checked 
    ) {
      return true;
    }
    document.getElementById("error_user_msg").innerHTML =
      "Click Yes to delete your account.";
  } catch (e) {}
  return false;
};*/

// Validates that answer is YES. If NO, then prints a message.
/*var validatePharmacyInput = () => {
  try {
    if (
      document.getElementById("pharmacy").checked
    ) {
      return true;
    }
    document.getElementById("error_pharmacy_msg").innerHTML =
      "Please select a pharmacy.";
  } catch (e) {}
  return false;
};*/
