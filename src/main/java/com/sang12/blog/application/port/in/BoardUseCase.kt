package com.sang12.blog.application.port.`in`

import com.sang12.blog.domain.Board

interface BoardUseCase {
    fun getBoardList() : List<Board>
}