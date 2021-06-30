package com.example.playlistapp.base

import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.playlistapp.R

@BindingAdapter("srcFromUrl")
fun ImageView.setSrcFromUrl(url: String) {
    Glide.with(this.context)
        .load(url)
        .placeholder(R.drawable.ic_launcher_background)
        .into(this)
}

@BindingAdapter("setPrefixByText")
fun TextView.setPrefixByText(text: String) {
    val stringAddPrefix = "By $text"
    this.text = stringAddPrefix
}

@BindingAdapter("app:setImageSrc")
fun ImageView.setImageSrc(@DrawableRes src: Int) {
    setImageResource(src)
}

@BindingAdapter("setAdminBookmark")
fun ImageView.setAdminBookmark(isMoimAdmin: Boolean) {
    isVisible = isMoimAdmin
}
