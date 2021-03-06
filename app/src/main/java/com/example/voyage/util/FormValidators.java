package com.example.voyage.util;

import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;

public class FormValidators {
    public static boolean isNameValid(Editable text) {
        return !TextUtils.isEmpty(text);
    }

    public static boolean isEmailValid(Editable text) {
        return !TextUtils.isEmpty(text) && Patterns.EMAIL_ADDRESS.matcher(text).matches();
    }

    public static boolean isPasswordValid(Editable text) {
        return !TextUtils.isEmpty(text) && text.length() >= 8;
    }

    public static boolean isPasswordConfirmValid(Editable password, Editable passwordConfirm) {
        return isPasswordValid(password) &&
                isPasswordValid(passwordConfirm) &&
                passwordConfirm.toString().compareTo(password.toString()) == 0;
    }

    public static boolean isPhoneNumberValid(Editable phoneNumber) {
        return (phoneNumber.length() == 9) && Patterns.PHONE.matcher(phoneNumber).matches();
    }
}
