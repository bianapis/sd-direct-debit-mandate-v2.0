package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord
 */
public class CRDirectDebitMandateDirectoryEntryRegisterInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord   {
  private String mandatedCustomerReference = null;

  private String mandateDescription = null;

  private String mandateCollectionValidPeriod = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the corporate entity related to this specific collection of customer mandates 
   * @return mandatedCustomerReference
  **/

  public String getMandatedCustomerReference() {
    return mandatedCustomerReference;
  }

  public void setMandatedCustomerReference(String mandatedCustomerReference) {
    this.mandatedCustomerReference = mandatedCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the purpose for this collection of customer mandates 
   * @return mandateDescription
  **/

  public String getMandateDescription() {
    return mandateDescription;
  }

  public void setMandateDescription(String mandateDescription) {
    this.mandateDescription = mandateDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The date and time the mandate collection is valid from to (allows for duration limits) 
   * @return mandateCollectionValidPeriod
  **/

  public String getMandateCollectionValidPeriod() {
    return mandateCollectionValidPeriod;
  }

  public void setMandateCollectionValidPeriod(String mandateCollectionValidPeriod) {
    this.mandateCollectionValidPeriod = mandateCollectionValidPeriod;
  }


}

