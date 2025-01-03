package dev.maxiscoding.shoppinglist.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import dev.maxiscoding.shoppinglist.model.ShoppingListItemModel

@Composable
fun List(
    items: List<ShoppingListItemModel>,
    onItemCheckedChange: (ShoppingListItemModel) -> Unit,
    onItemDelete: (ShoppingListItemModel) -> Unit,
    onItemEdit: (ShoppingListItemModel) -> Unit
) {
    LazyColumn {
        items(items.size) { index ->
            val item = items[index]
            ListItem(
                item = item,
                onCheckedChange = { isChecked -> onItemCheckedChange(item.copy(isChecked = isChecked)) },
                onDeleteClick = { onItemDelete(item) },
                onEditClick = { onItemEdit(item) }
            )
        }
    }
}