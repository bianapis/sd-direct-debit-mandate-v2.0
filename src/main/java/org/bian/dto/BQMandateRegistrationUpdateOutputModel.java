package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationUpdateInputModelMandateRegistrationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationUpdateOutputModel
 */
public class BQMandateRegistrationUpdateOutputModel   {
  private BQMandateRegistrationUpdateInputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord = null;

  private String mandateRegistrationUpdateActionTaskReference = null;

  private Object mandateRegistrationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return mandateRegistrationUpdateActionTaskReference
  **/

  public String getMandateRegistrationUpdateActionTaskReference() {
    return mandateRegistrationUpdateActionTaskReference;
  }

  public void setMandateRegistrationUpdateActionTaskReference(String mandateRegistrationUpdateActionTaskReference) {
    this.mandateRegistrationUpdateActionTaskReference = mandateRegistrationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

