package ua.org.marsroverapiapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Alex
 * @link https://intvw.me
 */
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="mars_api_preferences")
public class HomeDto {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long userId;
  @Column(length=20)
  private String marsApiRoverData;

  private Integer marsSol;
  private Boolean cameraFhaz;
  private Boolean cameraRhaz;
  private Boolean cameraMast;
  private Boolean cameraChemcam;
  private Boolean cameraMahli;
  private Boolean cameraMardi;
  private Boolean cameraNavcam;
  private Boolean cameraPancam;
  private Boolean cameraMinites;
  private Boolean rememberPreferences;

}