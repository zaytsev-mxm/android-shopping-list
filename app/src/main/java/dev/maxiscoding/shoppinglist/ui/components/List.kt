package dev.maxiscoding.shoppinglist.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import dev.maxiscoding.shoppinglist.model.ShoppingListItemModel

@Composable
fun List(items: List<ShoppingListItemModel>) {
    LazyColumn {
        items(items.size) { index ->
            ListItem(params = items[index])
        }
    }
}