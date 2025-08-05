package com.example.thirtytipscalisthenics.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Tip (
    val dayOfTheMonth: String,
    @StringRes val summaryOfGoal: Int,
    @StringRes val descriptionTitle: Int,
    @StringRes val descriptionRes: Int,
    @StringRes val nutritionRes: Int,
    @StringRes val nutritionContentRes: Int,
    @DrawableRes val imageRes: List<Int>,
    val imageDescription: List<String>
)