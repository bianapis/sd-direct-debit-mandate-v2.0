package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationExchangeInputModelMandateRegistrationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationExchangeInputModel
 */
public class BQMandateRegistrationExchangeInputModel   {
  private String directDebitMandateDirectoryEntryInstanceReference = null;

  private String mandateRegistrationInstanceReference = null;

  private Object mandateRegistrationExchangeActionTaskRecord = null;

  private BQMandateRegistrationExchangeInputModelMandateRegistrationExchangeActionRequest mandateRegistrationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return mandateRegistrationExchangeActionTaskRecord
  **/

  public Object getMandateRegistrationExchangeActionTaskRecord() {
    return mandateRegistrationExchangeActionTaskRecord;
  }

  public void setMandateRegistrationExchangeActionTaskRecord(Object mandateRegistrationExchangeActionTaskRecord) {
    this.mandateRegistrationExchangeActionTaskRecord = mandateRegistrationExchangeActionTaskRecord;
  }


  /**
   * Get mandateRegistrationExchangeActionRequest
   * @return mandateRegistrationExchangeActionRequest
  **/

  public BQMandateRegistrationExchangeInputModelMandateRegistrationExchangeActionRequest getMandateRegistrationExchangeActionRequest() {
    return mandateRegistrationExchangeActionRequest;
  }

  public void setMandateRegistrationExchangeActionRequest(BQMandateRegistrationExchangeInputModelMandateRegistrationExchangeActionRequest mandateRegistrationExchangeActionRequest) {
    this.mandateRegistrationExchangeActionRequest = mandateRegistrationExchangeActionRequest;
  }


}

