package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationUpdateInputModelMandateRegistrationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationUpdateInputModel
 */
public class BQMandateRegistrationUpdateInputModel   {
  private String directDebitMandateDirectoryEntryInstanceReference = null;

  private String mandateRegistrationInstanceReference = null;

  private BQMandateRegistrationUpdateInputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord = null;

  private Object mandateRegistrationUpdateActionTaskRecord = null;

  private String mandateRegistrationUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Mandate Registration instance 
   * @return mandateRegistrationInstanceReference
  **/

  public String getMandateRegistrationInstanceReference() {
    return mandateRegistrationInstanceReference;
  }

  public void setMandateRegistrationInstanceReference(String mandateRegistrationInstanceReference) {
    this.mandateRegistrationInstanceReference = mandateRegistrationInstanceReference;
  }


  /**
   * Get mandateRegistrationInstanceRecord
   * @return mandateRegistrationInstanceRecord
  **/

  public BQMandateRegistrationUpdateInputModelMandateRegistrationInstanceRecord getMandateRegistrationInstanceRecord() {
    return mandateRegistrationInstanceRecord;
  }

  public void setMandateRegistrationInstanceRecord(BQMandateRegistrationUpdateInputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord) {
    this.mandateRegistrationInstanceRecord = mandateRegistrationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return mandateRegistrationUpdateActionTaskRecord
  **/

  public Object getMandateRegistrationUpdateActionTaskRecord() {
    return mandateRegistrationUpdateActionTaskRecord;
  }

  public void setMandateRegistrationUpdateActionTaskRecord(Object mandateRegistrationUpdateActionTaskRecord) {
    this.mandateRegistrationUpdateActionTaskRecord = mandateRegistrationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return mandateRegistrationUpdateActionRequest
  **/

  public String getMandateRegistrationUpdateActionRequest() {
    return mandateRegistrationUpdateActionRequest;
  }

  public void setMandateRegistrationUpdateActionRequest(String mandateRegistrationUpdateActionRequest) {
    this.mandateRegistrationUpdateActionRequest = mandateRegistrationUpdateActionRequest;
  }


}

