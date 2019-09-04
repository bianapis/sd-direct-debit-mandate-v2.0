package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryControlOutputModel
 */
public class CRDirectDebitMandateDirectoryEntryControlOutputModel   {
  private String directDebitMandateDirectoryEntryControlActionTaskReference = null;

  private Object directDebitMandateDirectoryEntryControlActionTaskRecord = null;

  private String directDebitMandateDirectoryEntryControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Direct Debit Mandate Directory Entry instance control processing service call 
   * @return directDebitMandateDirectoryEntryControlActionTaskReference
  **/

  public String getDirectDebitMandateDirectoryEntryControlActionTaskReference() {
    return directDebitMandateDirectoryEntryControlActionTaskReference;
  }

  public void setDirectDebitMandateDirectoryEntryControlActionTaskReference(String directDebitMandateDirectoryEntryControlActionTaskReference) {
    this.directDebitMandateDirectoryEntryControlActionTaskReference = directDebitMandateDirectoryEntryControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return directDebitMandateDirectoryEntryControlActionTaskRecord
  **/

  public Object getDirectDebitMandateDirectoryEntryControlActionTaskRecord() {
    return directDebitMandateDirectoryEntryControlActionTaskRecord;
  }

  public void setDirectDebitMandateDirectoryEntryControlActionTaskRecord(Object directDebitMandateDirectoryEntryControlActionTaskRecord) {
    this.directDebitMandateDirectoryEntryControlActionTaskRecord = directDebitMandateDirectoryEntryControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return directDebitMandateDirectoryEntryControlActionResponse
  **/

  public String getDirectDebitMandateDirectoryEntryControlActionResponse() {
    return directDebitMandateDirectoryEntryControlActionResponse;
  }

  public void setDirectDebitMandateDirectoryEntryControlActionResponse(String directDebitMandateDirectoryEntryControlActionResponse) {
    this.directDebitMandateDirectoryEntryControlActionResponse = directDebitMandateDirectoryEntryControlActionResponse;
  }


}

