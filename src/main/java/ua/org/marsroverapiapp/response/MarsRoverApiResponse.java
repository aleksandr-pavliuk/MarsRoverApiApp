package ua.org.marsroverapiapp.response;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Alex
 * @link https://intvw.me
 */
@Getter
@Setter
@ToString
public class MarsRoverApiResponse {

  List<MarsPhoto> photos = new ArrayList<>();

}
