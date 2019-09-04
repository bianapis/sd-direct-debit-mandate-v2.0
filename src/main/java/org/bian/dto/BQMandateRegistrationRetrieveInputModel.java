package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceAnalysis;
import org.bian.dto.BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRetrieveInputModel
 */
public class BQMandateRegistrationRetrieveInputModel   {
  private Object mandateRegistrationRetrieveActionTaskRecord = null;

  private String mandateRegistrationRetrieveActionRequest = null;

  private BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceReport mandateRegistrationInstanceReport = null;

  private BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceAnalysis mandateRegistrationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return mandateRegistrationRetrieveActionTaskRecord
  **/

  public Object getMandateRegistrationRetrieveActionTaskRecord() {
    return mandateRegistrationRetrieveActionTaskRecord;
  }

  public void setMandateRegistrationRetrieveActionTaskRecord(Object mandateRegistrationRetrieveActionTaskRecord) {
    this.mandateRegistrationRetrieveActionTaskRecord = mandateRegistrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return mandateRegistrationRetrieveActionRequest
  **/

  public String getMandateRegistrationRetrieveActionRequest() {
    return mandateRegistrationRetrieveActionRequest;
  }

  public void setMandateRegistrationRetrieveActionRequest(String mandateRegistrationRetrieveActionRequest) {
    this.mandateRegistrationRetrieveActionRequest = mandateRegistrationRetrieveActionRequest;
  }


  /**
   * Get mandateRegistrationInstanceReport
   * @return mandateRegistrationInstanceReport
  **/

  public BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceReport getMandateRegistrationInstanceReport() {
    return mandateRegistrationInstanceReport;
  }

  public void setMandateRegistrationInstanceReport(BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceReport mandateRegistrationInstanceReport) {
    this.mandateRegistrationInstanceReport = mandateRegistrationInstanceReport;
  }


  /**
   * Get mandateRegistrationInstanceAnalysis
   * @return mandateRegistrationInstanceAnalysis
  **/

  public BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceAnalysis getMandateRegistrationInstanceAnalysis() {
    return mandateRegistrationInstanceAnalysis;
  }

  public void setMandateRegistrationInstanceAnalysis(BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceAnalysis mandateRegistrationInstanceAnalysis) {
    this.mandateRegistrationInstanceAnalysis = mandateRegistrationInstanceAnalysis;
  }


}

