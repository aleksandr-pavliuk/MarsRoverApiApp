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
public class MarsRover {

  private Long id;
  private String name;
  @JsonProperty("landing_date")
  private Date landingDate;
  @JsonProperty("launch_date")
  private Date launchDate;
  private String status;

}
