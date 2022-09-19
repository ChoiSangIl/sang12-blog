package com.sang12.blog.application.port.out

import com.sang12.blog.domain.Board

interface BoardStore {
    fun findByBoardList() : List<Board>
}