package dev.maxiscoding.shoppinglist.viewModel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import dev.maxiscoding.shoppinglist.db.MY_ITEMS
import dev.maxiscoding.shoppinglist.model.ShoppingListItemModel

class ShoppingListViewModel : ViewModel() {
    private val _items = mutableStateListOf(*MY_ITEMS.toTypedArray())
    val items: List<ShoppingListItemModel> get() = _items

    fun updateItem(updatedItem: ShoppingListItemModel) {
        val index = _items.indexOfFirst { it.id == updatedItem.id }
        if (index != -1) {
            _items[index] = updatedItem
        }
    }
}