import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class CdOrganizerTest {

  // testing to see if class creates an object
  @Test
  public void CdOrganizer_instantiatesCorrectly_true() {
    CdOrganizer cdOrganizer = new CdOrganizer("Rolling Stones", "Skipping rocks", 15);
    assertEquals(true, cdOrganizer instanceof CdOrganizer);
  }

  // test our rolling stones getter
  @Test
  public void getArtist_returnsArtist_RollingStones() {
    CdOrganizer newCdOrganizer = new CdOrganizer("Rolling Stones", "Skipping rocks", 15);
    assertEquals("Rolling Stones", newCdOrganizer.getArtist());
  }
}
