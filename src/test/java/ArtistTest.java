import org.example.Artist;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    @Test
    public void hasName(){
        Artist artist = new Artist("Van Gogh");
        assertThat(artist.getArtistName()).isEqualTo("Van Gogh");
    }

}
