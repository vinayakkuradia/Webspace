const usernameRegex = /[a-zA-Z0-9]{8,}/;
const passwordRegex = /[a-zA-Z0-9]{8,}/;
const fullNameRegex = /[a-zA-Z]{1}[a-zA-Z ]{9,}/;;

let username = document.getElementById("username");
let password = document.getElementById("password");
let password1 = document.getElementById("password1");
let fullName = document.getElementById("fullName")
let usernameFlag = passwordFlag = password1Flag = fullNameFlag = false;

const usernameMinLength = 8;
const passwordMinLength = 8;
const fullNameMinLength = 10;


const fullNameValidator = () => {
    let fullNameMsg = document.getElementById("fullNameMsg");
    if (fullName.value.length<fullNameMinLength) {
        fullNameMsg.innerHTML = "Full name should contain minimum "+fullNameMinLength+" characters";
        fullNameFlag=false
        return false;
    } else {
        if(fullName.value.search(fullNameRegex)!=0) {
            fullNameMsg.innerHTML = "Full name should be alphabetical and can only contain single space";
            fullNameFlag=false;
            return false;
        }
        else {
            fullNameMsg.innerHTML="";
            fullNameFlag=true;
            return true;
        }
    }
}

const usernameValidator = () => {    
    let usernameMsg = document.getElementById("usernameMsg");
    if (username.value.length<usernameMinLength) {
        usernameMsg.innerHTML = "Username should contain minimum "+usernameMinLength+" characters";
        usernameFlag=false
        return false;
    } else {
        if(username.value.search(usernameRegex)!=0) {
            usernameMsg.innerHTML = "Username should be alphanumeric";
            usernameFlag=false;
            return false;
        }
        else {
            usernameMsg.innerHTML="";
            usernameFlag=true;
            return true;
        }
    }
    
}

const passwordValidator = () => {
    let passwordMsg = document.getElementById("passwordMsg");
    
    if (password.value.length<passwordMinLength) {
        passwordMsg.innerHTML = "Password should contain minimum "+passwordMinLength+" characters";
        passwordFlag=false;
        return false;
    } else {
        if(password.value.search(passwordRegex)!=0) {
            passwordMsg.innerHTML = "Password can contain only alphabets, numbers and symbols: .-_@";
            passwordFlag=false
            return false;
        }
        else {
            passwordMsg.innerHTML = "";
            passwordFlag=true;
            return true;
        }
    }
   
}

const password1Validator = () => {
    let password1Msg = document.getElementById("password1Msg");
    
    if (password1.value!=password.value) {
        password1Msg.innerHTML = "Password should match with above password";
        password1Flag=false;
        return false;
    } else {
        password1Msg.innerHTML = "";
        password1Flag=true;
        return true;
    }
   
}

const loginFormValidator = () => {
    if(usernameFlag && passwordFlag) {
        return true;
    } else {
        return false;
    }
}

const signupFormValidator = () => {
    if (password1Flag && fullNameFlag && usernameFlag && passwordFlag) {
        return true;
    }
    else {
        return false;
    }
}

username.onchange = usernameValidator;
password.onchange = passwordValidator;
password1.onchange = password1Validator;
fullName.onchange = fullNameValidator;
//const usernameRegex = /[a-zA-Z]{1}[a-zA-Z0-9._]+[a-zA-Z0-9]{6,}/;