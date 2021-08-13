import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

public class MovieVO {
	public String MOVIE_NAME, DIRECTOR, TYPES;
	
	get selectMovie() {
		return `${this.name} ${this.surname}`;
	}
}