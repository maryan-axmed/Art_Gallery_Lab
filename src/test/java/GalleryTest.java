import org.example.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery CentralGallery;
    @BeforeEach
    public void setUp(){
       CentralGallery = new Gallery("Tate Modern", 1000.00);
    }
    @Test

    public void hasGalleryName() {
            assertThat(CentralGallery.getgalleryName()).isEqualTo("Tate Modern");

    }

    @Test
    public void hasTillValue(){
            assertThat(CentralGallery.getTill()).isEqualTo(1000.00);
        }

    @Test
    public void addsTillValue(){
        CentralGallery.receive(500.00);
        assertThat(CentralGallery.getTill()).isEqualTo(1500.00);
    }

    }




