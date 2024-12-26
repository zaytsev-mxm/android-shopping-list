package dev.maxiscoding.shoppinglist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.maxiscoding.shoppinglist.ui.screens.ShoppingListScreen
import dev.maxiscoding.shoppinglist.ui.theme.ShoppingListTheme
import dev.maxiscoding.shoppinglist.viewModel.ShoppingListViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoppingListTheme {
                ShoppingListScreen(viewModel = ShoppingListViewModel())
            }
        }
    }
}