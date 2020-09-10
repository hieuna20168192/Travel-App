package com.sunasterisk.travelapp.utils

import android.graphics.Point
import android.view.View
import com.google.android.material.snackbar.Snackbar
import java.util.*

fun View.showSnackBar(message: String, duration: Int) {
    Snackbar.make(this, message, duration).show()
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun Long.calendar(): Calendar = Calendar.getInstance().also {
    it.time = Date(this)
}

fun View.location(): Point {
    val location = IntArray(2)
    this.getLocationOnScreen(location)
    return Point(location[0], location[1])
}
