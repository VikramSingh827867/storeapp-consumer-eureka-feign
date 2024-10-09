package com.mphasis.proxy;



import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mphasis.domain.Book;

@FeignClient("book-service")
public interface BookServiceProxy {
	
	@GetMapping(value="/books/{id}")
	public Book getBookById(@PathVariable("id") Long id) ;
	
	@GetMapping(value="/books")
	public List<Book> getAllBooks() ;
		
	

}
