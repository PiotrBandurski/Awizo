package pl.bandurski.ui.locator

import androidx.compose.ui.graphics.Color
import pl.bandurski.awizo.domain.model.RequestType

fun RequestType.color(): Color = when(this){
    RequestType.GET -> Color.Green
    RequestType.POST -> Color.Cyan
}
