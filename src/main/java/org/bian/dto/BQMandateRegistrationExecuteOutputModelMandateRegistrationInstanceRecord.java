package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationExecuteOutputModelMandateRegistrationInstanceRecord
 */
public class BQMandateRegistrationExecuteOutputModelMandateRegistrationInstanceRecord   {
  private String directDebitMandateCustomerReference = null;

  private String directDebitMandateBankReference = null;

  private String directDebitMandateAccountReference = null;

  private String directDebitMandateValidDates = null;

  private String directDebitMandateTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer providing the mandate to the corporate 
   * @return directDebitMandateCustomerReference
  **/

  public String getDirectDebitMandateCustomerReference() {
    return directDebitMandateCustomerReference;
  }

  public void setDirectDebitMandateCustomerReference(String directDebitMandateCustomerReference) {
    this.directDebitMandateCustomerReference = directDebitMandateCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The bank holding the payer's account 
   * @return directDebitMandateBankReference
  **/

  public String getDirectDebitMandateBankReference() {
    return directDebitMandateBankReference;
  }

  public void setDirectDebitMandateBankReference(String directDebitMandateBankReference) {
    this.directDebitMandateBankReference = directDebitMandateBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payer's account 
   * @return directDebitMandateAccountReference
  **/

  public String getDirectDebitMandateAccountReference() {
    return directDebitMandateAccountReference;
  }

  public void setDirectDebitMandateAccountReference(String directDebitMandateAccountReference) {
    this.directDebitMandateAccountReference = directDebitMandateAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The period for which the customer mandate is in force 
   * @return directDebitMandateValidDates
  **/

  public String getDirectDebitMandateValidDates() {
    return directDebitMandateValidDates;
  }

  public void setDirectDebitMandateValidDates(String directDebitMandateValidDates) {
    this.directDebitMandateValidDates = directDebitMandateValidDates;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of allowed usage details and restrictions that apply to use of the mandate (e.g. maximum amount and frequency)  
   * @return directDebitMandateTerms
  **/

  public String getDirectDebitMandateTerms() {
    return directDebitMandateTerms;
  }

  public void setDirectDebitMandateTerms(String directDebitMandateTerms) {
    this.directDebitMandateTerms = directDebitMandateTerms;
  }


}

