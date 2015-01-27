package bookmarks.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BookmarkRepository extends CrudRepository<Bookmark, Long>
{
    @RestResource(path="note")
    List<Bookmark> findByNoteContaining(@Param("text")String note);
}
