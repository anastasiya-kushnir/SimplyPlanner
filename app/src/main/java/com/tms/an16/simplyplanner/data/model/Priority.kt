package com.tms.an16.simplyplanner.data.model

import androidx.compose.ui.graphics.Color
import com.tms.an16.simplyplanner.ui.theme.HighPriorityColor
import com.tms.an16.simplyplanner.ui.theme.LowPriorityColor
import com.tms.an16.simplyplanner.ui.theme.MediumPriorityColor
import com.tms.an16.simplyplanner.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}