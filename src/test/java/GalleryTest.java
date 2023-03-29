import org.example.Artwork;
import org.example.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery centralGallery;
    @BeforeEach
    public void setUp(){
       centralGallery = new Gallery("Tate Modern", 1000.00);
    }
    @Test

    public void hasGalleryName() {
            assertThat(centralGallery.getgalleryName()).isEqualTo("Tate Modern");

    }

    @Test
    public void hasTillValue(){
            assertThat(centralGallery.getTill()).isEqualTo(1000.00);
        }

    @Test
    public void addsTillValue(){
        centralGallery.receive(500.00);
        assertThat(centralGallery.getTill()).isEqualTo(1500.00);
    }

    @Test
    public void addsToArtworkList(){
        Artwork artwork = new Artwork("Mona Lisa", "DaVinci", 10000);
        centralGallery.addArtwork(artwork);
        assertThat(centralGallery.countArtworks()).isEqualTo(1);
    }
    }




