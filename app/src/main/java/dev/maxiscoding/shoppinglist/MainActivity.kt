package dev.maxiscoding.shoppinglist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import dev.maxiscoding.shoppinglist.db.MY_ITEMS
import dev.maxiscoding.shoppinglist.ui.components.List
import dev.maxiscoding.shoppinglist.ui.theme.ShoppingListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoppingListTheme {
                val items = remember { mutableStateListOf(*MY_ITEMS.toTypedArray()) }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        List(items = items) { updatedItem ->
                            val index = items.indexOfFirst { it.id == updatedItem.id }
                            if (index != -1) {
                                items[index] = updatedItem
                            }
                        }
                    }
                }
            }
        }
    }
}