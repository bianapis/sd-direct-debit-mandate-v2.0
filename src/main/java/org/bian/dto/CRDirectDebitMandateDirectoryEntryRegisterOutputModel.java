package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryRegisterOutputModel
 */
public class CRDirectDebitMandateDirectoryEntryRegisterOutputModel   {
  private String directDebitMandateDirectoryEntryInstanceReference = null;

  private String directDebitMandateDirectoryEntryRegisterActionReference = null;

  private Object directDebitMandateDirectoryEntryRegisterActionRecord = null;

  private String directDebitMandateDirectoryEntryInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Register service call 
   * @return directDebitMandateDirectoryEntryRegisterActionReference
  **/

  public String getDirectDebitMandateDirectoryEntryRegisterActionReference() {
    return directDebitMandateDirectoryEntryRegisterActionReference;
  }

  public void setDirectDebitMandateDirectoryEntryRegisterActionReference(String directDebitMandateDirectoryEntryRegisterActionReference) {
    this.directDebitMandateDirectoryEntryRegisterActionReference = directDebitMandateDirectoryEntryRegisterActionReference;
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


}

