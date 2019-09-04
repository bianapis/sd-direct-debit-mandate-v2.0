package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationExecuteInputModelMandateRegistrationInstanceRecord
 */
public class BQMandateRegistrationExecuteInputModelMandateRegistrationInstanceRecord   {
  private String directDebitMandateCustomerPseudonym = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The reference used to identify the customer to the corporate subject of the mandate (maintains secrecy of bank's internal reference) 
   * @return directDebitMandateCustomerPseudonym
  **/

  public String getDirectDebitMandateCustomerPseudonym() {
    return directDebitMandateCustomerPseudonym;
  }

  public void setDirectDebitMandateCustomerPseudonym(String directDebitMandateCustomerPseudonym) {
    this.directDebitMandateCustomerPseudonym = directDebitMandateCustomerPseudonym;
  }


}

