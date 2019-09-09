package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDirectDebitMandateDirectoryEntryRetrieveOutputModelCRDirectDebitMandateDirectoryEntryInstanceRecord;
import org.bian.dto.CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryRetrieveOutputModel
 */
public class CRDirectDebitMandateDirectoryEntryRetrieveOutputModel   {
  private CRDirectDebitMandateDirectoryEntryRetrieveOutputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord = null;

  private String directDebitMandateDirectoryEntryRetrieveActionTaskReference = null;

  private Object directDebitMandateDirectoryEntryRetrieveActionTaskRecord = null;

  private String directDebitMandateDirectoryEntryRetrieveActionResponse = null;

  private CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceReportRecord directDebitMandateDirectoryEntryInstanceReportRecord = null;

  private CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceAnalysis directDebitMandateDirectoryEntryInstanceAnalysis = null;


  /**
   * Get cRDirectDebitMandateDirectoryEntryInstanceRecord
   * @return cRDirectDebitMandateDirectoryEntryInstanceRecord
  **/

  public CRDirectDebitMandateDirectoryEntryRetrieveOutputModelCRDirectDebitMandateDirectoryEntryInstanceRecord getCRDirectDebitMandateDirectoryEntryInstanceRecord() {
    return cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }
   
  @JsonProperty("cRDirectDebitMandateDirectoryEntryInstanceRecord")
  public void setCRDirectDebitMandateDirectoryEntryInstanceRecord(CRDirectDebitMandateDirectoryEntryRetrieveOutputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord) {
    this.cRDirectDebitMandateDirectoryEntryInstanceRecord = cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Direct Debit Mandate Directory Entry instance retrieve service call 
   * @return directDebitMandateDirectoryEntryRetrieveActionTaskReference
  **/

  public String getDirectDebitMandateDirectoryEntryRetrieveActionTaskReference() {
    return directDebitMandateDirectoryEntryRetrieveActionTaskReference;
  }

  public void setDirectDebitMandateDirectoryEntryRetrieveActionTaskReference(String directDebitMandateDirectoryEntryRetrieveActionTaskReference) {
    this.directDebitMandateDirectoryEntryRetrieveActionTaskReference = directDebitMandateDirectoryEntryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return directDebitMandateDirectoryEntryRetrieveActionResponse
  **/

  public String getDirectDebitMandateDirectoryEntryRetrieveActionResponse() {
    return directDebitMandateDirectoryEntryRetrieveActionResponse;
  }

  public void setDirectDebitMandateDirectoryEntryRetrieveActionResponse(String directDebitMandateDirectoryEntryRetrieveActionResponse) {
    this.directDebitMandateDirectoryEntryRetrieveActionResponse = directDebitMandateDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get directDebitMandateDirectoryEntryInstanceReportRecord
   * @return directDebitMandateDirectoryEntryInstanceReportRecord
  **/

  public CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceReportRecord getDirectDebitMandateDirectoryEntryInstanceReportRecord() {
    return directDebitMandateDirectoryEntryInstanceReportRecord;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceReportRecord(CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceReportRecord directDebitMandateDirectoryEntryInstanceReportRecord) {
    this.directDebitMandateDirectoryEntryInstanceReportRecord = directDebitMandateDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get directDebitMandateDirectoryEntryInstanceAnalysis
   * @return directDebitMandateDirectoryEntryInstanceAnalysis
  **/

  public CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceAnalysis getDirectDebitMandateDirectoryEntryInstanceAnalysis() {
    return directDebitMandateDirectoryEntryInstanceAnalysis;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceAnalysis(CRDirectDebitMandateDirectoryEntryRetrieveOutputModelDirectDebitMandateDirectoryEntryInstanceAnalysis directDebitMandateDirectoryEntryInstanceAnalysis) {
    this.directDebitMandateDirectoryEntryInstanceAnalysis = directDebitMandateDirectoryEntryInstanceAnalysis;
  }


}

