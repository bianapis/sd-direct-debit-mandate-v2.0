package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDirectDebitMandateDirectoryEntryUpdateInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryUpdateInputModel
 */
public class CRDirectDebitMandateDirectoryEntryUpdateInputModel   {
  private String directDebitMandateServicingSessionReference = null;

  private String directDebitMandateDirectoryEntryInstanceReference = null;

  private CRDirectDebitMandateDirectoryEntryUpdateInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord = null;

  private Object directDebitMandateDirectoryEntryUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cRDirectDebitMandateDirectoryEntryInstanceRecord
   * @return cRDirectDebitMandateDirectoryEntryInstanceRecord
  **/

  public CRDirectDebitMandateDirectoryEntryUpdateInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord getCRDirectDebitMandateDirectoryEntryInstanceRecord() {
    return cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }

  public void setCRDirectDebitMandateDirectoryEntryInstanceRecord(CRDirectDebitMandateDirectoryEntryUpdateInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord) {
    this.cRDirectDebitMandateDirectoryEntryInstanceRecord = cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return directDebitMandateDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getDirectDebitMandateDirectoryEntryUpdateActionTaskRecord() {
    return directDebitMandateDirectoryEntryUpdateActionTaskRecord;
  }

  public void setDirectDebitMandateDirectoryEntryUpdateActionTaskRecord(Object directDebitMandateDirectoryEntryUpdateActionTaskRecord) {
    this.directDebitMandateDirectoryEntryUpdateActionTaskRecord = directDebitMandateDirectoryEntryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

