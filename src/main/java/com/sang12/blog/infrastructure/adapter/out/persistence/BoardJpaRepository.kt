package com.sang12.blog.infrastructure.adapter.out.persistence

import com.sang12.blog.application.port.out.LoadBoardPort
import com.sang12.blog.domain.Board

class BoardJpaRepository :LoadBoardPort{
    override fun findByBoardList(): List<Board> {
        TODO("Load Board List")
    }
}