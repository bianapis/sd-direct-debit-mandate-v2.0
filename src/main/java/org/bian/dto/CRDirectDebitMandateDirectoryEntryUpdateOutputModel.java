package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDirectDebitMandateDirectoryEntryUpdateInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDirectDebitMandateDirectoryEntryUpdateOutputModel
 */
public class CRDirectDebitMandateDirectoryEntryUpdateOutputModel   {
  private CRDirectDebitMandateDirectoryEntryUpdateInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord = null;

  private String directDebitMandateDirectoryEntryUpdateActionTaskReference = null;

  private Object directDebitMandateDirectoryEntryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRDirectDebitMandateDirectoryEntryInstanceRecord
   * @return cRDirectDebitMandateDirectoryEntryInstanceRecord
  **/

  public CRDirectDebitMandateDirectoryEntryUpdateInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord getCRDirectDebitMandateDirectoryEntryInstanceRecord() {
    return cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }

  public void setCRDirectDebitMandateDirectoryEntryInstanceRecord(CRDirectDebitMandateDirectoryEntryUpdateInputModelCRDirectDebitMandateDirectoryEntryInstanceRecord cRDirectDebitMandateDirectoryEntryInstanceRecord) {
    this.cRDirectDebitMandateDirectoryEntryInstanceRecord = cRDirectDebitMandateDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return directDebitMandateDirectoryEntryUpdateActionTaskReference
  **/

  public String getDirectDebitMandateDirectoryEntryUpdateActionTaskReference() {
    return directDebitMandateDirectoryEntryUpdateActionTaskReference;
  }

  public void setDirectDebitMandateDirectoryEntryUpdateActionTaskReference(String directDebitMandateDirectoryEntryUpdateActionTaskReference) {
    this.directDebitMandateDirectoryEntryUpdateActionTaskReference = directDebitMandateDirectoryEntryUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return directDebitMandateDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getDirectDebitMandateDirectoryEntryUpdateActionTaskRecord() {
    return directDebitMandateDirectoryEntryUpdateActionTaskRecord;
  }

  public void setDirectDebitMandateDirectoryEntryUpdateActionTaskRecord(Object directDebitMandateDirectoryEntryUpdateActionTaskRecord) {
    this.directDebitMandateDirectoryEntryUpdateActionTaskRecord = directDebitMandateDirectoryEntryUpdateActionTaskRecord;
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

