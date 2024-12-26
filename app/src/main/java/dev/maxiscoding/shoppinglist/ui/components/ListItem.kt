package dev.maxiscoding.shoppinglist.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.maxiscoding.shoppinglist.model.ShoppingListItemModel

@Composable
fun ListItem(params: ShoppingListItemModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = params.isChecked,
                    onCheckedChange = { params.isChecked = !params.isChecked })
                Text(text = params.name)
            }
        }
    }
}