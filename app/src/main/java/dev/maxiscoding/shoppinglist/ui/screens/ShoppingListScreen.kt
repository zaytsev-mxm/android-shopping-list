package dev.maxiscoding.shoppinglist.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.maxiscoding.shoppinglist.viewModel.ShoppingListViewModel
import dev.maxiscoding.shoppinglist.ui.components.List


@Composable
fun ShoppingListScreen(viewModel: ShoppingListViewModel) {
    val items = viewModel.items
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            List(items = items) { updatedItem -> viewModel.updateItem(updatedItem) }
        }
    }
}