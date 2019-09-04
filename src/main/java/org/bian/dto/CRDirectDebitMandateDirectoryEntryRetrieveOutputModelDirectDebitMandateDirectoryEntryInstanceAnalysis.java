package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceAnalysis
 */
public class CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceAnalysis   {
  private String directDebitMandateDirectoryEntryInstanceAnalysisData = null;

  private String directDebitMandateDirectoryEntryInstanceAnalysisReportType = null;

  private Object directDebitMandateDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return directDebitMandateDirectoryEntryInstanceAnalysisData
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceAnalysisData() {
    return directDebitMandateDirectoryEntryInstanceAnalysisData;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceAnalysisData(String directDebitMandateDirectoryEntryInstanceAnalysisData) {
    this.directDebitMandateDirectoryEntryInstanceAnalysisData = directDebitMandateDirectoryEntryInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return directDebitMandateDirectoryEntryInstanceAnalysisReportType
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceAnalysisReportType() {
    return directDebitMandateDirectoryEntryInstanceAnalysisReportType;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceAnalysisReportType(String directDebitMandateDirectoryEntryInstanceAnalysisReportType) {
    this.directDebitMandateDirectoryEntryInstanceAnalysisReportType = directDebitMandateDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return directDebitMandateDirectoryEntryInstanceAnalysisReport
  **/

  public Object getDirectDebitMandateDirectoryEntryInstanceAnalysisReport() {
    return directDebitMandateDirectoryEntryInstanceAnalysisReport;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceAnalysisReport(Object directDebitMandateDirectoryEntryInstanceAnalysisReport) {
    this.directDebitMandateDirectoryEntryInstanceAnalysisReport = directDebitMandateDirectoryEntryInstanceAnalysisReport;
  }


}

