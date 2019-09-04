package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceAnalysis
 */
public class BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceAnalysis   {
  private Object mandateRegistrationInstanceAnalysisRecord = null;

  private String mandateRegistrationInstanceAnalysisReportType = null;

  private String mandateRegistrationInstanceAnalysisParameters = null;

  private Object mandateRegistrationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return mandateRegistrationInstanceAnalysisRecord
  **/

  public Object getMandateRegistrationInstanceAnalysisRecord() {
    return mandateRegistrationInstanceAnalysisRecord;
  }

  public void setMandateRegistrationInstanceAnalysisRecord(Object mandateRegistrationInstanceAnalysisRecord) {
    this.mandateRegistrationInstanceAnalysisRecord = mandateRegistrationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return mandateRegistrationInstanceAnalysisReportType
  **/

  public String getMandateRegistrationInstanceAnalysisReportType() {
    return mandateRegistrationInstanceAnalysisReportType;
  }

  public void setMandateRegistrationInstanceAnalysisReportType(String mandateRegistrationInstanceAnalysisReportType) {
    this.mandateRegistrationInstanceAnalysisReportType = mandateRegistrationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return mandateRegistrationInstanceAnalysisParameters
  **/

  public String getMandateRegistrationInstanceAnalysisParameters() {
    return mandateRegistrationInstanceAnalysisParameters;
  }

  public void setMandateRegistrationInstanceAnalysisParameters(String mandateRegistrationInstanceAnalysisParameters) {
    this.mandateRegistrationInstanceAnalysisParameters = mandateRegistrationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return mandateRegistrationInstanceAnalysisReport
  **/

  public Object getMandateRegistrationInstanceAnalysisReport() {
    return mandateRegistrationInstanceAnalysisReport;
  }

  public void setMandateRegistrationInstanceAnalysisReport(Object mandateRegistrationInstanceAnalysisReport) {
    this.mandateRegistrationInstanceAnalysisReport = mandateRegistrationInstanceAnalysisReport;
  }


}

