package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDirectDebitMandateDirectoryEntryRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryRegisterInputModel
 */
public class CRDirectDebitMandateDirectoryEntryRegisterInputModel   {
  private String directDebitMandateServicingSessionReference = null;

  private Object directDebitMandateDirectoryEntryRegisterActionRecord = null;

  private String directDebitMandateDirectoryEntryInstanceStatus = null;

  private CRDirectDebitMandateDirectoryEntryRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Register service call input and output record 
   * @return directDebitMandateDirectoryEntryRegisterActionRecord
  **/

  public Object getDirectDebitMandateDirectoryEntryRegisterActionRecord() {
    return directDebitMandateDirectoryEntryRegisterActionRecord;
  }

  public void setDirectDebitMandateDirectoryEntryRegisterActionRecord(Object directDebitMandateDirectoryEntryRegisterActionRecord) {
    this.directDebitMandateDirectoryEntryRegisterActionRecord = directDebitMandateDirectoryEntryRegisterActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Direct Debit Mandate Directory Entry instance (e.g. initialised, pending, active) 
   * @return directDebitMandateDirectoryEntryInstanceStatus
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceStatus() {
    return directDebitMandateDirectoryEntryInstanceStatus;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceStatus(String directDebitMandateDirectoryEntryInstanceStatus) {
    this.directDebitMandateDirectoryEntryInstanceStatus = directDebitMandateDirectoryEntryInstanceStatus;
  }


  /**
   * Get cRDirectDebitMandateDirectoryEntryInstanceRecord
   * @return cRDirectDebitMandateDirectoryEntryInstanceRecord
  **/

  public CRDirectDebitMandateDirectoryEntryRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord getCRDirectDebitMandateDirectoryEntryInstanceRecord() {
    return cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }

  public void setCRDirectDebitMandateDirectoryEntryInstanceRecord(CRDirectDebitMandateDirectoryEntryRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord) {
    this.cRDirectDebitMandateDirectoryEntryInstanceRecord = cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }


}

