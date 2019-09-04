package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationExecuteInputModelMandateRegistrationInstanceRecord;
import org.bian.dto.BQMandateRegistrationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRequestInputModel
 */
public class BQMandateRegistrationRequestInputModel   {
  private String directDebitMandateDirectoryEntryInstanceReference = null;

  private String mandateRegistrationInstanceReference = null;

  private BQMandateRegistrationExecuteInputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord = null;

  private Object mandateRegistrationRequestActionTaskRecord = null;

  private BQMandateRegistrationRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQMandateRegistrationExecuteInputModelMandateRegistrationInstanceRecord getMandateRegistrationInstanceRecord() {
    return mandateRegistrationInstanceRecord;
  }

  public void setMandateRegistrationInstanceRecord(BQMandateRegistrationExecuteInputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord) {
    this.mandateRegistrationInstanceRecord = mandateRegistrationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return mandateRegistrationRequestActionTaskRecord
  **/

  public Object getMandateRegistrationRequestActionTaskRecord() {
    return mandateRegistrationRequestActionTaskRecord;
  }

  public void setMandateRegistrationRequestActionTaskRecord(Object mandateRegistrationRequestActionTaskRecord) {
    this.mandateRegistrationRequestActionTaskRecord = mandateRegistrationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQMandateRegistrationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQMandateRegistrationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

