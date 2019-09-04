package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceReport
 */
public class BQMandateRegistrationRetrieveInputModelMandateRegistrationInstanceReport   {
  private String mandateRegistrationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return mandateRegistrationInstanceReportReference
  **/

  public String getMandateRegistrationInstanceReportReference() {
    return mandateRegistrationInstanceReportReference;
  }

  public void setMandateRegistrationInstanceReportReference(String mandateRegistrationInstanceReportReference) {
    this.mandateRegistrationInstanceReportReference = mandateRegistrationInstanceReportReference;
  }


}

