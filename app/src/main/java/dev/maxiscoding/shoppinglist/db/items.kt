package dev.maxiscoding.shoppinglist.db

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import dev.maxiscoding.shoppinglist.model.ShoppingListItemModel

val MY_ITEMS = listOf(
    ShoppingListItemModel(id = "1", name = "Milk", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "2", name = "Bread", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "3", name = "Eggs", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "4", name = "Cheese", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "5", name = "Apples", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "6", name = "Carrots", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "7", name = "Chicken Breast", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "8", name = "Rice", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "9", name = "Butter", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "10", name = "Orange Juice", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "11", name = "Potatoes", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "12", name = "Onions", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "13", name = "Tomatoes", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "14", name = "Bananas", isChecked = false, isEditing = false),
    ShoppingListItemModel(id = "15", name = "Yogurt", isChecked = false, isEditing = false)
)

@Composable
fun getItems(): List<ShoppingListItemModel> {
    val items by remember { mutableStateOf(MY_ITEMS) }
    return items

}