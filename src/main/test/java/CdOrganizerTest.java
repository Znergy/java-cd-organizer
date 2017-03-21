import org.junit.*;
import static org.junit.Assert.*;

public class CdOrganizerTest {

  // testing to see if class creates an object
  @Test
  public void CdOrganizer_instantiatesCorrectly_true() {
    CdOrganizer cdOrganizer = new CdOrganizer();
    assertEquals(true, cdOrganizer instanceof CdOrganizer);
  }
}
