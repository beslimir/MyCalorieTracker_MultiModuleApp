package com.example.tracker_presentation.search

import com.example.tracker_domain.model.TrackableFood

/**
 * Didn't make as an extension in the model of the domain layer
 * because it's needed just for the UI in this part.
 * Therefore, made a new class.
 * */

data class TrackableFoodUiState(
    val food: TrackableFood,
    val isExpanded: Boolean = false,
    val amount: String = ""
)
