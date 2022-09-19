package com.sang12.blog.application.service

import com.sang12.blog.application.port.`in`.BoardUseCase
import com.sang12.blog.application.port.out.BoardStore
import com.sang12.blog.domain.Board
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BoardService @Autowired constructor(
    val boardStore : BoardStore
) : BoardUseCase {
    override fun getBoardList(): List<Board> {
        return boardStore.findByBoardList();
    }

}