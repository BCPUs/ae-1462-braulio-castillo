package com.pucetec.ae1462exam1.controllers

import com.pucetec.ae1462exam1.dto.BookRequest
import com.pucetec.ae1462exam1.dto.BookResponse
import com.pucetec.ae1462exam1.services.BookService
import org.springframework.web.bind.annotation.*

@RestController
class BookController(
    private val bookService: BookService
) {

    @PostMapping("/api/books")
    fun createBook(
        @RequestBody request: BookRequest
    ): BookResponse {
        return bookService.createBook(request)
    }

    @GetMapping("/api/books")
    fun getAllBooks(): List<BookResponse> {
        return bookService.getAllBooks()
    }
}