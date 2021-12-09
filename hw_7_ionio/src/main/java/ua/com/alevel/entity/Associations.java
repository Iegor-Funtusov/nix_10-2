package ua.com.alevel.entity;


import lombok.Data;

@Data
public class Associations {
    private Integer id;
    private Integer authorId;
    private Integer bookId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Associations that = (Associations) o;
        if (getAuthorId() != null ? !getAuthorId().equals(that.getAuthorId()) : that.getAuthorId() != null)
            return false;
        return getBookId() != null ? getBookId().equals(that.getBookId()) : that.getBookId() == null;
    }

    @Override
    public int hashCode() {
        int result = getAuthorId() != null ? getAuthorId().hashCode() : 0;
        result = 31 * result + (getBookId() != null ? getBookId().hashCode() : 0);
        return result;
    }
}
