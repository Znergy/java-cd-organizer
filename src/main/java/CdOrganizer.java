import java.util.*;

public class CdOrganizer {

  private String artist;
  private String title;
  private int price;

  public CdOrganizer(String artist, String title, int price) {
    this.artist = artist;
    this.title = title;
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }

  public String getArtist() {
    return this.artist;
  }

  public String getTitle() {
    return this.title;
  }
}
