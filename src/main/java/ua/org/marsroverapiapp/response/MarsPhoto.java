package ua.org.marsroverapiapp.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Alex
 * @link https://intvw.me
 */
@Setter
@Getter
@ToString
public class MarsPhoto {

  private Long id;
  private Long sol;
  private MarsCamera camera;

  @JsonProperty("img_src")
  private String imgSrc;
  @JsonProperty("earth_date")
  private Date earthDate;
  private MarsRover rover;

}
