@file:JvmMultifileClass
@file:JvmName("BannerbarKt")

package com.google.android.material.snackbar

import android.view.View
import androidx.annotation.NonNull
import androidx.annotation.StringRes

/**
 * Display [Bannerbar] with [Bannerbar.LENGTH_SHORT] duration.
 *
 * @param title the title message.
 */
inline fun View.shortBannerbar(@NonNull title: CharSequence, configuration: Bannerbar.() -> Unit): Bannerbar =
    Bannerbar.make(this, title, Bannerbar.LENGTH_SHORT)
        .apply {
            configuration()
            show()
        }

/**
 * Display [Bannerbar] with [Bannerbar.LENGTH_SHORT] duration.
 *
 * @param titleId the title message.
 */
inline fun View.shortBannerbar(@StringRes titleId: Int, configuration: Bannerbar.() -> Unit): Bannerbar =
    Bannerbar.make(this, titleId, Bannerbar.LENGTH_SHORT)
        .apply {
            configuration()
            show()
        }

/**
 * Display [Bannerbar] with [Bannerbar.LENGTH_LONG] duration.
 *
 * @param title the title message.
 */
inline fun View.longBannerbar(@NonNull title: CharSequence, configuration: Bannerbar.() -> Unit): Bannerbar =
    Bannerbar.make(this, title, Bannerbar.LENGTH_LONG)
        .apply {
            configuration()
            show()
        }

/**
 * Display [Bannerbar] with [Bannerbar.LENGTH_LONG] duration.
 *
 * @param titleId the title message.
 */
inline fun View.longBannerbar(@StringRes titleId: Int, configuration: Bannerbar.() -> Unit): Bannerbar =
    Bannerbar.make(this, titleId, Bannerbar.LENGTH_LONG)
        .apply {
            configuration()
            show()
        }

/**
 * Display [Bannerbar] with [Bannerbar.LENGTH_INDEFINITE] duration.
 *
 * @param title the title message.
 */
inline fun View.bannerbar(@NonNull title: CharSequence, configuration: Bannerbar.() -> Unit): Bannerbar =
    Bannerbar.make(this, title, Bannerbar.LENGTH_INDEFINITE)
        .apply {
            configuration()
            show()
        }

/**
 * Display [Bannerbar] with [Bannerbar.LENGTH_INDEFINITE] duration.
 *
 * @param titleId the title message.
 */
inline fun View.bannerbar(@StringRes titleId: Int, configuration: Bannerbar.() -> Unit): Bannerbar =
    Bannerbar.make(this, titleId, Bannerbar.LENGTH_INDEFINITE)
        .apply {
            configuration()
            show()
        }