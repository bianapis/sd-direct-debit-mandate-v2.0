package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceAnalysis;
import org.bian.dto.BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceRecord;
import org.bian.dto.BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMandateRegistrationRetrieveOutputModel
 */
public class BQMandateRegistrationRetrieveOutputModel   {
  private BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord = null;

  private String mandateRegistrationRetrieveActionTaskReference = null;

  private Object mandateRegistrationRetrieveActionTaskRecord = null;

  private String mandateRegistrationRetrieveActionResponse = null;

  private BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceReport mandateRegistrationInstanceReport = null;

  private BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceAnalysis mandateRegistrationInstanceAnalysis = null;


  /**
   * Get mandateRegistrationInstanceRecord
   * @return mandateRegistrationInstanceRecord
  **/

  public BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceRecord getMandateRegistrationInstanceRecord() {
    return mandateRegistrationInstanceRecord;
  }

  public void setMandateRegistrationInstanceRecord(BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceRecord mandateRegistrationInstanceRecord) {
    this.mandateRegistrationInstanceRecord = mandateRegistrationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Mandate Registration instance retrieve service call 
   * @return mandateRegistrationRetrieveActionTaskReference
  **/

  public String getMandateRegistrationRetrieveActionTaskReference() {
    return mandateRegistrationRetrieveActionTaskReference;
  }

  public void setMandateRegistrationRetrieveActionTaskReference(String mandateRegistrationRetrieveActionTaskReference) {
    this.mandateRegistrationRetrieveActionTaskReference = mandateRegistrationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return mandateRegistrationRetrieveActionTaskRecord
  **/

  public Object getMandateRegistrationRetrieveActionTaskRecord() {
    return mandateRegistrationRetrieveActionTaskRecord;
  }

  public void setMandateRegistrationRetrieveActionTaskRecord(Object mandateRegistrationRetrieveActionTaskRecord) {
    this.mandateRegistrationRetrieveActionTaskRecord = mandateRegistrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return mandateRegistrationRetrieveActionResponse
  **/

  public String getMandateRegistrationRetrieveActionResponse() {
    return mandateRegistrationRetrieveActionResponse;
  }

  public void setMandateRegistrationRetrieveActionResponse(String mandateRegistrationRetrieveActionResponse) {
    this.mandateRegistrationRetrieveActionResponse = mandateRegistrationRetrieveActionResponse;
  }


  /**
   * Get mandateRegistrationInstanceReport
   * @return mandateRegistrationInstanceReport
  **/

  public BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceReport getMandateRegistrationInstanceReport() {
    return mandateRegistrationInstanceReport;
  }

  public void setMandateRegistrationInstanceReport(BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceReport mandateRegistrationInstanceReport) {
    this.mandateRegistrationInstanceReport = mandateRegistrationInstanceReport;
  }


  /**
   * Get mandateRegistrationInstanceAnalysis
   * @return mandateRegistrationInstanceAnalysis
  **/

  public BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceAnalysis getMandateRegistrationInstanceAnalysis() {
    return mandateRegistrationInstanceAnalysis;
  }

  public void setMandateRegistrationInstanceAnalysis(BQMandateRegistrationRetrieveOutputModelMandateRegistrationInstanceAnalysis mandateRegistrationInstanceAnalysis) {
    this.mandateRegistrationInstanceAnalysis = mandateRegistrationInstanceAnalysis;
  }


}

