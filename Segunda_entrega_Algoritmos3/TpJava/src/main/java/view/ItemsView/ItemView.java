package view.ItemsView;

import Item.Item;

public abstract class ItemView {

    protected Item item;

    public ItemView(Item item) {
        this.item = item;
    }

    public abstract void mostrar();
}
