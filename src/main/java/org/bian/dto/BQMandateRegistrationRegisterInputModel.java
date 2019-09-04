package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord;
import org.bian.dto.BQMandateRegistrationRegisterInputModelMandateRegistrationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRegisterInputModel
 */
public class BQMandateRegistrationRegisterInputModel   {
  private BQMandateRegistrationRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord = null;

  private String directDebitMandateDirectoryEntryInstanceReference = null;

  private Object mandateRegistrationInitiateActionRecord = null;

  private BQMandateRegistrationRegisterInputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord = null;


  /**
   * Get cRDirectDebitMandateDirectoryEntryInstanceRecord
   * @return cRDirectDebitMandateDirectoryEntryInstanceRecord
  **/

  public BQMandateRegistrationRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord getCRDirectDebitMandateDirectoryEntryInstanceRecord() {
    return cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }

  public void setCRDirectDebitMandateDirectoryEntryInstanceRecord(BQMandateRegistrationRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord) {
    this.cRDirectDebitMandateDirectoryEntryInstanceRecord = cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Direct Debit Mandate Directory Entry instance 
   * @return directDebitMandateDirectoryEntryInstanceReference
  **/

  public String getDirectDebitMandateDirectoryEntryInstanceReference() {
    return directDebitMandateDirectoryEntryInstanceReference;
  }

  public void setDirectDebitMandateDirectoryEntryInstanceReference(String directDebitMandateDirectoryEntryInstanceReference) {
    this.directDebitMandateDirectoryEntryInstanceReference = directDebitMandateDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return mandateRegistrationInitiateActionRecord
  **/

  public Object getMandateRegistrationInitiateActionRecord() {
    return mandateRegistrationInitiateActionRecord;
  }

  public void setMandateRegistrationInitiateActionRecord(Object mandateRegistrationInitiateActionRecord) {
    this.mandateRegistrationInitiateActionRecord = mandateRegistrationInitiateActionRecord;
  }


  /**
   * Get mandateRegistrationInstanceRecord
   * @return mandateRegistrationInstanceRecord
  **/

  public BQMandateRegistrationRegisterInputModelMandateRegistrationInstanceRecord getMandateRegistrationInstanceRecord() {
    return mandateRegistrationInstanceRecord;
  }

  public void setMandateRegistrationInstanceRecord(BQMandateRegistrationRegisterInputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord) {
    this.mandateRegistrationInstanceRecord = mandateRegistrationInstanceRecord;
  }


}

