package OOPWitchcraft.transactions;

import OOPWitchcraft.auth.Account;

import OOPWitchcraft.core.Entity;
import OOPWitchcraft.items.Item;

public class Transaction extends Entity {
    private final Account account;
    private final Item item;
    private boolean resolved = false;

    public Transaction(Account account, Item item) {
        super(account.getId() + item.getId());
        this.account = account;
        this.item = item;
        this.resolved = false;
    }

    public Transaction(Account account, Item item, boolean resolved) {
        super(account.getId() + item.getId());
        this.account = account;
        this.item = item;
        this.resolved = resolved;
    }

    public Account getAccount() {
        return account;
    }

    public Item getItem() {
        return item;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void resolve() {
        this.resolved = true;
    }
}
