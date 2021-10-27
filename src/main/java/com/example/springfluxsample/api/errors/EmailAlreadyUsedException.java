package com.example.springfluxsample.api.errors;

import com.example.springfluxsample.error.BadRequestAlertException;
import com.example.springfluxsample.error.ErrorConstants;

public class EmailAlreadyUsedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public EmailAlreadyUsedException() {
        super(ErrorConstants.EMAIL_ALREADY_USED_TYPE, "Email is already in use!", "userManagement", "emailexists");
    }
}
