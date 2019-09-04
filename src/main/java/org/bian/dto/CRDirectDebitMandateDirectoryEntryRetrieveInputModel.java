package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryRetrieveInputModel
 */
public class CRDirectDebitMandateDirectoryEntryRetrieveInputModel   {
  private Object directDebitMandateDirectoryEntryRetrieveActionTaskRecord = null;

  private String directDebitMandateDirectoryEntryRetrieveActionRequest = null;

  private CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceReportRecord directDebitMandateDirectoryEntryInstanceReportRecord = null;

  private CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceAnalysis directDebitMandateDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return directDebitMandateDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getDirectDebitMandateDirectoryEntryRetrieveActionTaskRecord() {
    return directDebitMandateDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setDirectDebitMandateDirectoryEntryRetrieveActionTaskRecord(Object directDebitMandateDirectoryEntryRetrieveActionTaskRecord) {
    this.directDebitMandateDirectoryEntryRetrieveActionTaskRecord = directDebitMandateDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return directDebitMandateDirectoryEntryRetrieveActionRequest
  **/

  public String getDirectDebitMandateDirectoryEntryRetrieveActionRequest() {
    return directDebitMandateDirectoryEntryRetrieveActionRequest;
  }

  public void setDirectDebitMandateDirectoryEntryRetrieveActionRequest(String directDebitMandateDirectoryEntryRetrieveActionRequest) {
    this.directDebitMandateDirectoryEntryRetrieveActionRequest = directDebitMandateDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get directDebitMandateDirectoryEntryInstanceReportRecord
   * @return directDebitMandateDirectoryEntryInstanceReportRecord
  **/

  public CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceReportRecord getDirectDebitMandateDirectoryEntryInstanceReportRecord() {
    return directDebitMandateDirectoryEntryInstanceReportRecord;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceReportRecord(CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceReportRecord directDebitMandateDirectoryEntryInstanceReportRecord) {
    this.directDebitMandateDirectoryEntryInstanceReportRecord = directDebitMandateDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get directDebitMandateDirectoryEntryInstanceAnalysis
   * @return directDebitMandateDirectoryEntryInstanceAnalysis
  **/

  public CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceAnalysis getDirectDebitMandateDirectoryEntryInstanceAnalysis() {
    return directDebitMandateDirectoryEntryInstanceAnalysis;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceAnalysis(CRDirectDebitMandateDirectoryEntryRetrieveInputModelDirectDebitMandateDirectoryEntryInstanceAnalysis directDebitMandateDirectoryEntryInstanceAnalysis) {
    this.directDebitMandateDirectoryEntryInstanceAnalysis = directDebitMandateDirectoryEntryInstanceAnalysis;
  }


}

