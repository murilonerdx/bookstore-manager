package com.murilonerdx.bookmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
@EnableTransactionManagement
@EnableJpaRepositories(value={"com.murilonerdx.bookmanager.model.author.repository",
        "com.murilonerdx.bookmanager.model.user.repository",
        "com.murilonerdx.bookmanager.model.book.repository",
        "com.murilonerdx.bookmanager.model.publisher.repository"})
public class BookmanagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookmanagerApplication.class, args);
    }

}
