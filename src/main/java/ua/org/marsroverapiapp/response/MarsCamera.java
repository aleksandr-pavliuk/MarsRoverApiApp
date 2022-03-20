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
public class MarsCamera {

  private Long id;
  private String name;
  @JsonProperty("rover_id")
  private Long roverId;
  @JsonProperty("full_name")
  private String fullName;


}
