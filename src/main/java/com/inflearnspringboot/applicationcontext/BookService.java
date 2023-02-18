package com.inflearnspringboot.applicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service //component-scan으로 가능... (자바 설정 파일 사용 초기에는 사용 X - 자바 설정 파일에서 직접 등록)
public class BookService {
    @Autowired //comonent-scan으로 작동 시 Autowired를 사용해야 의존성 주입 가능
    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
