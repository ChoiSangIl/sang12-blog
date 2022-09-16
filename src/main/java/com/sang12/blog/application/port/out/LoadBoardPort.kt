package com.sang12.blog.application.port.out

import com.sang12.blog.domain.Board

interface LoadBoardPort {
    fun findByBoardList() : List<Board>
}