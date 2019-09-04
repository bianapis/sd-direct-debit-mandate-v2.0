/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DirectDebitMandateApiService {

	SDDirectDebitMandateActivateOutputModel activate(SDDirectDebitMandateActivateInputModel request);
	
	SDDirectDebitMandateConfigureOutputModel configure(String sdReferenceId, SDDirectDebitMandateConfigureInputModel request);
	
	CRDirectDebitMandateDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRDirectDebitMandateDirectoryEntryControlInputModel request);
	
	BQMandateRegistrationExchangeOutputModel exchangeMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMandateRegistrationExchangeInputModel request);
	
	BQMandateRegistrationExecuteOutputModel executeMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMandateRegistrationExecuteInputModel request);
	
	SDDirectDebitMandateFeedbackOutputModel feedback(String sdReferenceId, SDDirectDebitMandateFeedbackInputModel request);
	
	CRDirectDebitMandateDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRDirectDebitMandateDirectoryEntryRegisterInputModel request);
	
	BQMandateRegistrationRegisterOutputModel registerMandateregistration(String sdReferenceId, String crReferenceId, BQMandateRegistrationRegisterInputModel request);
	
	BQMandateRegistrationRequestOutputModel requestMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMandateRegistrationRequestInputModel request);
	
	CRDirectDebitMandateDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQMandateRegistrationRetrieveOutputModel retrieveMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDDirectDebitMandateRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRDirectDebitMandateDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDirectDebitMandateDirectoryEntryUpdateInputModel request);
	
	BQMandateRegistrationUpdateOutputModel updateMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMandateRegistrationUpdateInputModel request);
	
}
