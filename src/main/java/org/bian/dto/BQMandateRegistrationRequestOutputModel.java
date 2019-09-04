package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationRequestOutputModelMandateRegistrationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRequestOutputModel
 */
public class BQMandateRegistrationRequestOutputModel   {
  private BQMandateRegistrationRequestOutputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord = null;

  private String mandateRegistrationRequestActionTaskReference = null;

  private Object mandateRegistrationRequestActionTaskRecord = null;

  private String mandateRegistrationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get mandateRegistrationInstanceRecord
   * @return mandateRegistrationInstanceRecord
  **/

  public BQMandateRegistrationRequestOutputModelMandateRegistrationInstanceRecord getMandateRegistrationInstanceRecord() {
    return mandateRegistrationInstanceRecord;
  }

  public void setMandateRegistrationInstanceRecord(BQMandateRegistrationRequestOutputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord) {
    this.mandateRegistrationInstanceRecord = mandateRegistrationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Mandate Registration instance request service call 
   * @return mandateRegistrationRequestActionTaskReference
  **/

  public String getMandateRegistrationRequestActionTaskReference() {
    return mandateRegistrationRequestActionTaskReference;
  }

  public void setMandateRegistrationRequestActionTaskReference(String mandateRegistrationRequestActionTaskReference) {
    this.mandateRegistrationRequestActionTaskReference = mandateRegistrationRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Mandate Registration service request record 
   * @return mandateRegistrationRequestRecordReference
  **/

  public String getMandateRegistrationRequestRecordReference() {
    return mandateRegistrationRequestRecordReference;
  }

  public void setMandateRegistrationRequestRecordReference(String mandateRegistrationRequestRecordReference) {
    this.mandateRegistrationRequestRecordReference = mandateRegistrationRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

