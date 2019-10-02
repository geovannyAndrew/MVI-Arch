package com.gyros.mvi_arch.ui.main.state

import com.gyros.mvi_arch.model.BlogPost
import com.gyros.mvi_arch.model.User

data class MainViewState(
    var blogPosts: List<BlogPost>? = null,
    var user: User? = null
)