package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceAnalysis
 */
public class CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceAnalysis   {
  private String directDebitMandateDirectoryEntryInstanceAnalysisReference = null;

  private String directDebitMandateDirectoryEntryInstanceAnalysisReportType = null;

  private String directDebitMandateDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return directDebitMandateDirectoryEntryInstanceAnalysisReference
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceAnalysisReference() {
    return directDebitMandateDirectoryEntryInstanceAnalysisReference;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceAnalysisReference(String directDebitMandateDirectoryEntryInstanceAnalysisReference) {
    this.directDebitMandateDirectoryEntryInstanceAnalysisReference = directDebitMandateDirectoryEntryInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return directDebitMandateDirectoryEntryInstanceAnalysisParameters
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceAnalysisParameters() {
    return directDebitMandateDirectoryEntryInstanceAnalysisParameters;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceAnalysisParameters(String directDebitMandateDirectoryEntryInstanceAnalysisParameters) {
    this.directDebitMandateDirectoryEntryInstanceAnalysisParameters = directDebitMandateDirectoryEntryInstanceAnalysisParameters;
  }


}

