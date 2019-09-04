package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationExecuteInputModelExecuteRecordType;
import org.bian.dto.BQMandateRegistrationExecuteInputModelMandateRegistrationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationExecuteInputModel
 */
public class BQMandateRegistrationExecuteInputModel   {
  private String directDebitMandateDirectoryEntryInstanceReference = null;

  private String mandateRegistrationInstanceReference = null;

  private BQMandateRegistrationExecuteInputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord = null;

  private Object mandateRegistrationExecuteActionTaskRecord = null;

  private BQMandateRegistrationExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return mandateRegistrationExecuteActionTaskRecord
  **/

  public Object getMandateRegistrationExecuteActionTaskRecord() {
    return mandateRegistrationExecuteActionTaskRecord;
  }

  public void setMandateRegistrationExecuteActionTaskRecord(Object mandateRegistrationExecuteActionTaskRecord) {
    this.mandateRegistrationExecuteActionTaskRecord = mandateRegistrationExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQMandateRegistrationExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQMandateRegistrationExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

