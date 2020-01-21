package com.problem.solutions.redamehali.loginui.util;

import android.util.Patterns;

/**
 * Created by Reda Mehali on 2020-01-20.
 */
public class UiUtil {

    // A placeholder username validation check
    public static boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }
}
