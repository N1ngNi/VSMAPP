package OOPWitchcraft.controllers;

import OOPWitchcraft.auth.Account;
import OOPWitchcraft.items.Item;

public class Flag {
    static int check = 0;

    static Item item;

    static Account account;

    static void setCheck(int num)
    {
        check = num;
    }
    static void setItem(Item newItem) {item = newItem;}

    static void setAccount(Account newAccount) {account = newAccount;}
}
