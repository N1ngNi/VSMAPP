package OOPWitchcraft.utils;

import OOPWitchcraft.transactions.Transaction;
import OOPWitchcraft.transactions.TransactionManager;

public class TransactionIO extends ObjectIO<Transaction> {
    public TransactionIO(TransactionManager manager, TransactionUtils utils) {
        super(manager, utils, "transactions");
    }
}