package dev.maxiscoding.shoppinglist.model

data class ShoppingListItemModel(
    val id: String = "",
    var name: String = "",
    var isChecked: Boolean = false,
    var isEditing: Boolean = false,
    var quantity: Int? = null
) {
}