package ua.org.marsroverapiapp;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ua.org.marsroverapiapp.response.MarsRoverApiResponse;

/**
 * @author Alex
 * @link https://intvw.me
 */
public class MarsRoverApiTest {

  @Test
  public void smallTest() {
    RestTemplate rt = new RestTemplate();

    ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY", MarsRoverApiResponse.class);
    System.out.println(response.getBody());

//    System.out.println(response.getBody().getPhotos().size());
  }

}
