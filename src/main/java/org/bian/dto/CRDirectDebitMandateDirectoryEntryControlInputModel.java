package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDirectDebitMandateDirectoryEntryControlInputModelDirectDebitMandateDirectoryEntryControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryControlInputModel
 */
public class CRDirectDebitMandateDirectoryEntryControlInputModel   {
  private String directDebitMandateServicingSessionReference = null;

  private String directDebitMandateDirectoryEntryInstanceReference = null;

  private Object directDebitMandateDirectoryEntryControlActionTaskRecord = null;

  private CRDirectDebitMandateDirectoryEntryControlInputModelDirectDebitMandateDirectoryEntryControlActionRequest directDebitMandateDirectoryEntryControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return directDebitMandateServicingSessionReference
  **/

  public String getDirectDebitMandateServicingSessionReference() {
    return directDebitMandateServicingSessionReference;
  }

  public void setDirectDebitMandateServicingSessionReference(String directDebitMandateServicingSessionReference) {
    this.directDebitMandateServicingSessionReference = directDebitMandateServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Direct Debit Mandate Directory Entry instance 
   * @return directDebitMandateDirectoryEntryInstanceReference
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceReference() {
    return directDebitMandateDirectoryEntryInstanceReference;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceReference(String directDebitMandateDirectoryEntryInstanceReference) {
    this.directDebitMandateDirectoryEntryInstanceReference = directDebitMandateDirectoryEntryInstanceReference;
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
   * Get directDebitMandateDirectoryEntryControlActionRequest
   * @return directDebitMandateDirectoryEntryControlActionRequest
  **/

  public CRDirectDebitMandateDirectoryEntryControlInputModelDirectDebitMandateDirectoryEntryControlActionRequest getDirectDebitMandateDirectoryEntryControlActionRequest() {
    return directDebitMandateDirectoryEntryControlActionRequest;
  }

  public void setDirectDebitMandateDirectoryEntryControlActionRequest(CRDirectDebitMandateDirectoryEntryControlInputModelDirectDebitMandateDirectoryEntryControlActionRequest directDebitMandateDirectoryEntryControlActionRequest) {
    this.directDebitMandateDirectoryEntryControlActionRequest = directDebitMandateDirectoryEntryControlActionRequest;
  }


}

