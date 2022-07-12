package pl.olazagrabska.tutorial00;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "articles")
public class Element {
    
    @Id
    @Column(name = "id")
    private char id;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "article")
    private String article;

    @Column(name = "link", length = 100)
    private String link;

    public void setId(char id) {
        this.id = id;
    }

    public char getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }
}