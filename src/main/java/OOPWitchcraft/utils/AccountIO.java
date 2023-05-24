package OOPWitchcraft.utils;

import OOPWitchcraft.auth.Account;
import OOPWitchcraft.auth.AccountManager;

public class AccountIO extends ObjectIO<Account> {
    public AccountIO(AccountManager manager, AccountUtils utils) {
        super(manager, utils, "accounts");
    }
}
