package org.fundacionjala.pivotaluitest.cucumber.hooks;

import cucumber.api.java.Before;
import org.fundacionjala.pivotaluitest.ui.pages.SignInForm;
import org.fundacionjala.pivotaluitest.utils.Environment;

/**
 * login hooks.
 */
public class GlobalLoginHook {

    private static boolean beforeAllFlag;

    /**
     * global hook for login.
     */
    @Before
    public void loginToPivotal() {

        if (!beforeAllFlag) {
            final String userName = Environment.getInstance().getPrimaryUser();
            final String password = Environment.getInstance().getPrimaryPassword();
            SignInForm.loginAs(userName, password);
            beforeAllFlag = true;
        }
    }
}
