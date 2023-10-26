function resetForm() {
    document.getElementById('surveyForm').reset();
}

document.getElementById('surveyForm').addEventListener('submit', function (e) {
    e.preventDefault();
    var firstName = document.getElementById('first-name').value;
    var lastName = document.getElementById('last-name').value;
    var dob = document.getElementById('dob').value;
    var country = document.getElementById('country').value;
    var gender = [];
    var genderInputs = document.getElementsByName('gender');
    genderInputs.forEach(function (input) {
        if (input.checked) {
            gender.push(input.value);
        }
    });
    var profession = document.getElementById('profession').value;
    var email = document.getElementById('email').value;
    var mobile = document.getElementById('mobile').value;

    var message = `
    First Name: ${firstName}
    Last Name: ${lastName}
    Date of Birth: ${dob}
    Country: ${country}
    Gender: ${gender.join(', ')}
    Profession: ${profession}
    Email: ${email}
    Mobile Number: ${mobile}
    `;

    alert(message);

    resetForm();
});