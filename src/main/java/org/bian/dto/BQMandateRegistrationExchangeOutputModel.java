package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationExchangeOutputModel
 */
public class BQMandateRegistrationExchangeOutputModel   {
  private String mandateRegistrationExchangeActionTaskReference = null;

  private Object mandateRegistrationExchangeActionTaskRecord = null;

  private String mandateRegistrationExchangeActionResponse = null;

  private String mandateRegistrationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Mandate Registration instance exchange service call 
   * @return mandateRegistrationExchangeActionTaskReference
  **/

  public String getMandateRegistrationExchangeActionTaskReference() {
    return mandateRegistrationExchangeActionTaskReference;
  }

  public void setMandateRegistrationExchangeActionTaskReference(String mandateRegistrationExchangeActionTaskReference) {
    this.mandateRegistrationExchangeActionTaskReference = mandateRegistrationExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return mandateRegistrationExchangeActionResponse
  **/

  public String getMandateRegistrationExchangeActionResponse() {
    return mandateRegistrationExchangeActionResponse;
  }

  public void setMandateRegistrationExchangeActionResponse(String mandateRegistrationExchangeActionResponse) {
    this.mandateRegistrationExchangeActionResponse = mandateRegistrationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Mandate Registration instance (e.g. accepted, rejected, verified) 
   * @return mandateRegistrationInstanceStatus
  **/

  public String getMandateRegistrationInstanceStatus() {
    return mandateRegistrationInstanceStatus;
  }

  public void setMandateRegistrationInstanceStatus(String mandateRegistrationInstanceStatus) {
    this.mandateRegistrationInstanceStatus = mandateRegistrationInstanceStatus;
  }


}

