package com.inflearnspringboot.applicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 자바 설정 파일임을 알림
@ComponentScan(basePackageClasses = DemoApplication.class)
//basePackages 도 가능하나 string 입력이라, type safe 하지는 않다. (string 이라 파일 이름이 변화하면 자동 변환이 안됨....)
//따라서 basePackageClasses가 좋음 (해당 하는 클래스가 위치한 부분부터 탐색)
public class ApplicationConfig {

    //Bean 설정을 일일히 하기 번거로워 component-scan을 이용하는 방식이 등장했다.
    /*@Bean
    public BookRepository bookRepository(){
        return new BookRepository();
    }

    @Bean
    public BookService bookService(){
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository());
        return bookService;
    }

    @Bean
    public BookService bookService(){
        return new BookService();
    }
    //이렇게 Bean을 만들 수도 있는데, 이 때는 위와는 달리 BookService에서 @Autowired를 통해 Bookrepository를 연동해야함.
    //즉, 의존관계를 만들지 않아도 Bean으로만 등록되면, 해당 빈에서 @Autowired가 적용된다.
    //단, 생성자로 만들게 될 경우에는 직접 의존관계를 만들어 주어야 한다. (아니면 객체 생성자체가 불가)
    */
}
