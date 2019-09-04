package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceReport
 */
public class BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceReport   {
  private Object mandateRegistrationInstanceReportRecord = null;

  private String mandateRegistrationInstanceReportType = null;

  private String mandateRegistrationInstanceReportParameters = null;

  private Object mandateRegistrationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return mandateRegistrationInstanceReportRecord
  **/

  public Object getMandateRegistrationInstanceReportRecord() {
    return mandateRegistrationInstanceReportRecord;
  }

  public void setMandateRegistrationInstanceReportRecord(Object mandateRegistrationInstanceReportRecord) {
    this.mandateRegistrationInstanceReportRecord = mandateRegistrationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return mandateRegistrationInstanceReportType
  **/

  public String getMandateRegistrationInstanceReportType() {
    return mandateRegistrationInstanceReportType;
  }

  public void setMandateRegistrationInstanceReportType(String mandateRegistrationInstanceReportType) {
    this.mandateRegistrationInstanceReportType = mandateRegistrationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return mandateRegistrationInstanceReportParameters
  **/

  public String getMandateRegistrationInstanceReportParameters() {
    return mandateRegistrationInstanceReportParameters;
  }

  public void setMandateRegistrationInstanceReportParameters(String mandateRegistrationInstanceReportParameters) {
    this.mandateRegistrationInstanceReportParameters = mandateRegistrationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return mandateRegistrationInstanceReport
  **/

  public Object getMandateRegistrationInstanceReport() {
    return mandateRegistrationInstanceReport;
  }

  public void setMandateRegistrationInstanceReport(Object mandateRegistrationInstanceReport) {
    this.mandateRegistrationInstanceReport = mandateRegistrationInstanceReport;
  }


}

