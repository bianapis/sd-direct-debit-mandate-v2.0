package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationExecuteOutputModelMandateRegistrationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationExecuteOutputModel
 */
public class BQMandateRegistrationExecuteOutputModel   {
  private BQMandateRegistrationExecuteOutputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord = null;

  private String mandateRegistrationExecuteActionTaskReference = null;

  private Object mandateRegistrationExecuteActionTaskRecord = null;

  private String mandateRegistrationExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get mandateRegistrationInstanceRecord
   * @return mandateRegistrationInstanceRecord
  **/

  public BQMandateRegistrationExecuteOutputModelMandateRegistrationInstanceRecord getMandateRegistrationInstanceRecord() {
    return mandateRegistrationInstanceRecord;
  }

  public void setMandateRegistrationInstanceRecord(BQMandateRegistrationExecuteOutputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord) {
    this.mandateRegistrationInstanceRecord = mandateRegistrationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Mandate Registration instance execute service call 
   * @return mandateRegistrationExecuteActionTaskReference
  **/

  public String getMandateRegistrationExecuteActionTaskReference() {
    return mandateRegistrationExecuteActionTaskReference;
  }

  public void setMandateRegistrationExecuteActionTaskReference(String mandateRegistrationExecuteActionTaskReference) {
    this.mandateRegistrationExecuteActionTaskReference = mandateRegistrationExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Mandate Registration execute transaction/record 
   * @return mandateRegistrationExecuteRecordReference
  **/

  public String getMandateRegistrationExecuteRecordReference() {
    return mandateRegistrationExecuteRecordReference;
  }

  public void setMandateRegistrationExecuteRecordReference(String mandateRegistrationExecuteRecordReference) {
    this.mandateRegistrationExecuteRecordReference = mandateRegistrationExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

