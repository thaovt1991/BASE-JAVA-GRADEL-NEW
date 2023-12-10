package jp.co.okasan.domain.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jp.co.okasan.core.errorhandler.domain.AbstractSearchCriteria;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@ConfigurableValidation
public class ExportUserRequest extends AbstractSearchCriteria {

  private LocalDate fromDate;

  private LocalTime fromTime;

  private LocalDate toDate;

  private LocalTime toTime;

  private Integer clientNo;

  private String nameMei;

  private String nameSei;

  private String kanaNameMei;

  private String kanaNamSei;

  private LocalDate birthDay;

  private String mobileNumber;

  private String entryEmail;

  private String addressPrefectures;

  private String addressMuinicipalities;

  private String citizenshipCd;

}
