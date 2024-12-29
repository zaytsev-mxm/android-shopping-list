package dev.maxiscoding.shoppinglist.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.maxiscoding.shoppinglist.ui.components.ItemDetailsDialog
import dev.maxiscoding.shoppinglist.viewModel.ShoppingListViewModel
import dev.maxiscoding.shoppinglist.ui.components.List


@Composable
fun ShoppingListScreen(viewModel: ShoppingListViewModel) {
    val items = viewModel.items
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Column {
                Box(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Button(onClick = { viewModel.showEditor() }) {
                        Text(text = "Add Item")
                    }
                }

                List(
                    items = items,
                    onItemCheckedChange = { updatedItem -> viewModel.updateItem(updatedItem) },
                    onItemDelete = { itemToDelete -> viewModel.removeItem(itemToDelete) },
                    onItemEdit = { itemToEdit -> viewModel.showEditor(itemToEdit) }
                )
            }

            if (viewModel.isEditing) {
                ItemDetailsDialog(
                    onDismissRequest = { viewModel.hideEditor() },
                    onConfirmation = { updatedItem -> viewModel.closeEditor(updatedItem) },
                    item = viewModel.editingItem
                )
            }
        }
    }
}