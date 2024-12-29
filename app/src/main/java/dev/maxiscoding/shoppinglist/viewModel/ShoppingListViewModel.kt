package dev.maxiscoding.shoppinglist.viewModel

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dev.maxiscoding.shoppinglist.db.MY_ITEMS
import dev.maxiscoding.shoppinglist.model.ShoppingListItemModel

class ShoppingListViewModel : ViewModel() {
    private val _items = mutableStateListOf(*MY_ITEMS.toTypedArray())
    val items: List<ShoppingListItemModel> get() = _items

    private val _editingItem = mutableStateOf<ShoppingListItemModel?>(null)
    val editingItem: ShoppingListItemModel? get() = _editingItem.value

    private val _isAdding = mutableStateOf(false)
    private val isAdding: Boolean get() = _isAdding.value

    val isEditing: Boolean get() = _editingItem.value != null

    fun updateItem(updatedItem: ShoppingListItemModel) {
        val index = _items.indexOfFirst { it.id == updatedItem.id }
        if (index != -1) {
            _items[index] = updatedItem
        }
    }

    fun addItem(item: ShoppingListItemModel) {
        _items.add(item.copy(id = (items.size + 1).toString()))
    }

    fun closeEditor(item: ShoppingListItemModel) {
        if (isAdding) {
            addItem(item)
        } else {
            updateItem(item)
        }
        hideEditor()
    }

    fun removeItem(item: ShoppingListItemModel) {
        _items.remove(item)
    }

    fun showEditor(item: ShoppingListItemModel? = null) {
        val currentItem = item ?: ShoppingListItemModel()
        _editingItem.value = currentItem
        _isAdding.value = item == null
    }

    fun hideEditor() {
        _editingItem.value = null
    }
}