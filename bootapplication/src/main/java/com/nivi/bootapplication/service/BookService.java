package com.nivi.bootapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivi.bootapplication.model.Book;
import com.nivi.bootapplication.repository.BookRepository;


@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findOne(Long id) {
		return bookRepository.findOne(id);
	}

	public List<Book> findByPriceDesc() {
		return bookRepository.findByOrderByPriceDesc();
	}

	public List<Book> findByPriceAsc() {
		return bookRepository.findByOrderByPriceAsc();
	}

	public List<Book> findByReleasedDateDesc() {
		return bookRepository.findByOrderByReleasedDateDesc();
	}

}
