package com.problem.solutions.redamehali.loginui;

import com.problem.solutions.redamehali.loginui.util.UiUtil;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Reda Mehali on 2020-01-20.
 */

public class ValidateEmailTest {

    @Test
    public void validateEmail_emailInputNotEmpty_returnsTrue() {
        assertThat(UiUtil.isUserNameValid("1")).isTrue();
    }

}
