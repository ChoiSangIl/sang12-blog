package com.sang12.blog.infrastructure.adapter.out.persistence

import com.sang12.blog.application.port.out.BoardStore
import com.sang12.blog.domain.Board
import org.springframework.stereotype.Repository

@Repository
open class BoardPersistenceJpaAdapter : BoardStore{
    override fun findByBoardList(): List<Board> {
        TODO("Load Board List")
    }
}