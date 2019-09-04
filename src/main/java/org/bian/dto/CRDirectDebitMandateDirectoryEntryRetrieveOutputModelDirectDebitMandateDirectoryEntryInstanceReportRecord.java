package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceReportRecord
 */
public class CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceReportRecord   {
  private String directDebitMandateDirectoryEntryInstanceReportData = null;

  private String directDebitMandateDirectoryEntryInstanceReportType = null;

  private Object directDebitMandateDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return directDebitMandateDirectoryEntryInstanceReportData
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceReportData() {
    return directDebitMandateDirectoryEntryInstanceReportData;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceReportData(String directDebitMandateDirectoryEntryInstanceReportData) {
    this.directDebitMandateDirectoryEntryInstanceReportData = directDebitMandateDirectoryEntryInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return directDebitMandateDirectoryEntryInstanceReport
  **/

  public Object getDirectDebitMandateDirectoryEntryInstanceReport() {
    return directDebitMandateDirectoryEntryInstanceReport;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceReport(Object directDebitMandateDirectoryEntryInstanceReport) {
    this.directDebitMandateDirectoryEntryInstanceReport = directDebitMandateDirectoryEntryInstanceReport;
  }


}

