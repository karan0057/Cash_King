package com.cultofgames.funearn.helper

import android.view.View
import com.facebook.shimmer.ShimmerFrameLayout

fun ShimmerFrameLayout.safelyHide() {
    this?.apply {
        stopShimmer()
        this.hideShimmer()
        this.visibility = View.GONE
    }
}