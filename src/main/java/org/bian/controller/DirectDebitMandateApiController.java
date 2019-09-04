/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Catalog;

@BianRestController
public class DirectDebitMandateApiController {

	@Autowired
	DirectDebitMandateApiService service;
	
	@Catalog.Activate
	public BianResponse<SDDirectDebitMandateActivateOutputModel> activate(@RequestBody BianRequest<SDDirectDebitMandateActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Catalog.Configure
	public BianResponse<SDDirectDebitMandateConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDDirectDebitMandateConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Control
	public BianResponse<CRDirectDebitMandateDirectoryEntryControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDirectDebitMandateDirectoryEntryControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("mandateregistration")
	@Catalog.Exchange
	public BianResponse<BQMandateRegistrationExchangeOutputModel> exchangeMandateregistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMandateRegistrationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeMandateregistration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("mandateregistration")
	@Catalog.Execute
	public BianResponse<BQMandateRegistrationExecuteOutputModel> executeMandateregistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMandateRegistrationExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeMandateregistration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Feedback
	public BianResponse<SDDirectDebitMandateFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDDirectDebitMandateFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Register
	public BianResponse<CRDirectDebitMandateDirectoryEntryRegisterOutputModel> register(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRDirectDebitMandateDirectoryEntryRegisterInputModel> bianRequest) {
		return BianResponse.forSuccess(service.register(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("mandateregistration")
	@Catalog.Register
	public BianResponse<BQMandateRegistrationRegisterOutputModel> registerMandateregistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQMandateRegistrationRegisterInputModel> bianRequest) {
		return BianResponse.forSuccess(service.registerMandateregistration(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("mandateregistration")
	@Catalog.Request
	public BianResponse<BQMandateRegistrationRequestOutputModel> requestMandateregistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMandateRegistrationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestMandateregistration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Retrieve
	public BianResponse<CRDirectDebitMandateDirectoryEntryRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Catalog.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Catalog.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("mandateregistration")
	@Catalog.Retrieve
	public BianResponse<BQMandateRegistrationRetrieveOutputModel> retrieveMandateregistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMandateregistration(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Catalog.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Catalog.RetrieveSD
	public BianResponse<SDDirectDebitMandateRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Catalog.Update
	public BianResponse<CRDirectDebitMandateDirectoryEntryUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDirectDebitMandateDirectoryEntryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("mandateregistration")
	@Catalog.Update
	public BianResponse<BQMandateRegistrationUpdateOutputModel> updateMandateregistration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMandateRegistrationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateMandateregistration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
