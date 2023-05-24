package OOPWitchcraft.utils;

import OOPWitchcraft.core.Manager;

import OOPWitchcraft.items.Item;

public class ItemIO extends ObjectIO<Item> {
    public ItemIO(Manager<Item> manager, ItemUtils utils) {
        super(manager, utils, "items");
    }
}
