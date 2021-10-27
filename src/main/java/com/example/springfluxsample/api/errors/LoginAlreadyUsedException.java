package com.example.springfluxsample.api.errors;


import com.example.springfluxsample.error.BadRequestAlertException;
import com.example.springfluxsample.error.ErrorConstants;

public class LoginAlreadyUsedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public LoginAlreadyUsedException() {
        super(ErrorConstants.LOGIN_ALREADY_USED_TYPE, "Login name already used!", "userManagement", "userexists");
    }
}
