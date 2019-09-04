package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceRecord
 */
public class BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceRecord   {
  private String directDebitMandateCustomerReference = null;

  private String directDebitMandateCustomerPseudonym = null;

  private String directDebitMandateBankReference = null;

  private String directDebitMandateAccountReference = null;

  private String directDebitMandateValidDates = null;

  private String directDebitMandateTerms = null;

  private String correspondenceInstanceReference = null;

  private String correspondenceContent = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String documentContent = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The reference used to identify the customer to the corporate subject of the mandate (maintains secrecy of bank's internal reference) 
   * @return directDebitMandateCustomerPseudonym
  **/

  public String getDirectDebitMandateCustomerPseudonym() {
    return directDebitMandateCustomerPseudonym;
  }

  public void setDirectDebitMandateCustomerPseudonym(String directDebitMandateCustomerPseudonym) {
    this.directDebitMandateCustomerPseudonym = directDebitMandateCustomerPseudonym;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondence generated and received with the maintenance of the mandate 
   * @return correspondenceInstanceReference
  **/

  public String getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Correspondence content - direct debit mandate agreement messages and forms sent and completed by involved parties 
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Document content - legal documents created & referenced for the mandate 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


}

