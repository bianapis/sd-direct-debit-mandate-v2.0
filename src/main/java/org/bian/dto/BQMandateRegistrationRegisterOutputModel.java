package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationRegisterOutputModelMandateRegistrationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRegisterOutputModel
 */
public class BQMandateRegistrationRegisterOutputModel   {
  private String mandateRegistrationInstanceReference = null;

  private String mandateRegistrationInitiateActionReference = null;

  private Object mandateRegistrationInitiateActionRecord = null;

  private String mandateRegistrationInstanceStatus = null;

  private BQMandateRegistrationRegisterOutputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return mandateRegistrationInitiateActionReference
  **/

  public String getMandateRegistrationInitiateActionReference() {
    return mandateRegistrationInitiateActionReference;
  }

  public void setMandateRegistrationInitiateActionReference(String mandateRegistrationInitiateActionReference) {
    this.mandateRegistrationInitiateActionReference = mandateRegistrationInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Mandate Registration instance (e.g. initialised, pending, active) 
   * @return mandateRegistrationInstanceStatus
  **/

  public String getMandateRegistrationInstanceStatus() {
    return mandateRegistrationInstanceStatus;
  }

  public void setMandateRegistrationInstanceStatus(String mandateRegistrationInstanceStatus) {
    this.mandateRegistrationInstanceStatus = mandateRegistrationInstanceStatus;
  }


  /**
   * Get mandateRegistrationInstanceRecord
   * @return mandateRegistrationInstanceRecord
  **/

  public BQMandateRegistrationRegisterOutputModelMandateRegistrationInstanceRecord getMandateRegistrationInstanceRecord() {
    return mandateRegistrationInstanceRecord;
  }

  public void setMandateRegistrationInstanceRecord(BQMandateRegistrationRegisterOutputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord) {
    this.mandateRegistrationInstanceRecord = mandateRegistrationInstanceRecord;
  }


}

