package ch.bbw.m151.liquibasedemo;

import ch.bbw.m151.liquibasedemo.entities.ArticleEntity;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(properties = "spring.liquibase.drop-first=true")
class LiquibaseDemoApplicationTests implements WithAssertions {
    @Autowired
    ArticleRepository articleRepository;

    @Test
    void setupAndTestDatabase() {
        ArticleEntity article = new ArticleEntity();
        article.setTitle("a title");
        article = articleRepository.saveAndFlush(article);
        assertThat(article.getId()).isNotNull();
    }
}