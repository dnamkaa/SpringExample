package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import java.util.Set;
@Entity
public class Author {
    public Author(String firstName, String lastName, Set<Author> authors) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.authors = authors;
    }

    private String firstName;
    private  String  lastName;
    private Set<Author> authors;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }



}


