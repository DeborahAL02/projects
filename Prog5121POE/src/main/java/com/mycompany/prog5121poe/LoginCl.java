/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

/**
 *
 * @author Deborah
 */
public class LoginCl {
  
    //creating fields
    protected String _userName;
    protected String _passWord;
    protected String _firstname;
    protected String _lastname;
    protected boolean _loginCheck;
    protected boolean _registrationCheck;

    public void setUsername(String username) {
        _userName = username;
    }

    public String getUsername() {
        return _userName;
    }

    public void setFirstName(String firstName) {
        _firstname = firstName;
    }

    public String getFirstName() {
        return _firstname;
    }

    public void setLastName(String lastName) {
        _lastname = lastName;
    }

    public String getLastName() {
        return _lastname;
    }

    public void setPassword(String password) {
        _passWord = password;
    }

    public String getPassword() {
        return _passWord;
    }

    public boolean getRegistrationCheck() {
        return _registrationCheck;
    }

    public LoginCl() {
        // empty constructor 
    }

    public LoginCl(String username, String password) {
        // overloaded constructor
        _userName = username;
        _passWord = password;

    }

    public boolean checkUserName(String userName) {
        if ((userName.contains("_")) && (userName.length() <= 5)) {
            return true;

        } else {

            System.out.println("Error,please check that the password has at least 8 characters, a capital \n letter, a number and a special character.");
            return false;
        }

    }

    public boolean checkPasswordComplexity(String passWord) {
        int intAsciiValue;
        boolean checkLength;
        boolean capitalLetter = false;
        boolean containNum = false;
        boolean specialChar = false;
        char oneChar;

        if (passWord.length() <= 8) {
            checkLength = true;
            // check for int using ascii chart in form of loop
            //finding the number in password and index will help me find the value
            /*
          } */

            for (int intIndex = 0; intIndex < passWord.length(); intIndex++) {
                oneChar = passWord.charAt(intIndex);
                intAsciiValue = (int) oneChar;

                // checks for capital letters
                if ((intAsciiValue >= 65) && (intAsciiValue <= 90)) {
                    capitalLetter = true;
                }
                //checks for a number in the password
                if ((intAsciiValue >= 48) && (intAsciiValue <= 57)) {
                    containNum = true;
                }

                //goes through a range of special char in the ascii cahrt 
                if (((intAsciiValue >= 32) && (intAsciiValue <= 47))
                        || ((intAsciiValue >= 58) && (intAsciiValue <= 64))
                        || ((intAsciiValue >= 91) && (intAsciiValue <= 96))
                        || ((intAsciiValue >= 123) && (intAsciiValue <= 126))) {

                    specialChar = true;
                }

            }
            if (checkLength && capitalLetter && containNum && specialChar) {
                return true;

            } else {

                System.out.println("Error,please check that the password has at least 8 characters, a capital letter,\n a number and a special character.");
                return false;
            }
        }
        return true;
    }

    public String registerUser() {
        // create an if to ask if check user and pass are correct if 
        // you enter stuff if not ask them again

        String returnLoginStatus = "";

        if (checkUserName(_userName) && checkPasswordComplexity(_passWord)) {
            returnLoginStatus = "User succesfully registered";
            _registrationCheck = true;
        } else {
            _registrationCheck = false;
            if (!checkUserName(_userName)) {
                returnLoginStatus = "The username is incorrectly formatted";

            }
            if (!checkPasswordComplexity(_passWord)) {
                returnLoginStatus = "The password does not meet the complexity requirements";

            }

        }

        return returnLoginStatus;
    }

    public boolean loginUser(String username, String password) {

        _loginCheck = false;

        if (!username.equals(_userName)) {
            System.out.println("username incorrect");
            return false;
        } else {
            if (!password.equals(_passWord)) {
                System.out.println("password incorrect");
                return false;
            } else {
                _loginCheck = true;
                return true;
            }

        }
    }

    public String returnLoginStatus() {
        if (_loginCheck) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }

}
/*
 do{
        if ((userName.contains("_")) && (userName.length() <= 5)) {
            System.out.println("Username successfully captured");

        } else {
            
            System.out.println("Error,please check that the password has at least 8 characters, a capital \n letter, a number and a special character.");

        }
        }while((!userName.contains("_")) && (userName.length() != 5))
                
                ;
        return true;
    }

 */

