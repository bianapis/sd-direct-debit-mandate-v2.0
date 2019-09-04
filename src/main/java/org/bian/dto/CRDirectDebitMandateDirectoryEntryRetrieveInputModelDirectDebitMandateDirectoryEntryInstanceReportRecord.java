package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceReportRecord
 */
public class CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceReportRecord   {
  private String directDebitMandateDirectoryEntryInstanceReportReference = null;

  private String directDebitMandateDirectoryEntryInstanceReportType = null;

  private String directDebitMandateDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return directDebitMandateDirectoryEntryInstanceReportReference
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceReportReference() {
    return directDebitMandateDirectoryEntryInstanceReportReference;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceReportReference(String directDebitMandateDirectoryEntryInstanceReportReference) {
    this.directDebitMandateDirectoryEntryInstanceReportReference = directDebitMandateDirectoryEntryInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return directDebitMandateDirectoryEntryInstanceReportType
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceReportType() {
    return directDebitMandateDirectoryEntryInstanceReportType;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceReportType(String directDebitMandateDirectoryEntryInstanceReportType) {
    this.directDebitMandateDirectoryEntryInstanceReportType = directDebitMandateDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return directDebitMandateDirectoryEntryInstanceReportParameters
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceReportParameters() {
    return directDebitMandateDirectoryEntryInstanceReportParameters;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceReportParameters(String directDebitMandateDirectoryEntryInstanceReportParameters) {
    this.directDebitMandateDirectoryEntryInstanceReportParameters = directDebitMandateDirectoryEntryInstanceReportParameters;
  }


}

