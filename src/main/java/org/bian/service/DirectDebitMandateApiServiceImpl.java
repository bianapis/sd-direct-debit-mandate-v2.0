/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DirectDebitMandateApiServiceImpl implements DirectDebitMandateApiService {

	public SDDirectDebitMandateActivateOutputModel activate(SDDirectDebitMandateActivateInputModel request){
		return JsonReader.read("activate-SDDirectDebitMandateActivateOutputModel.json",new TypeReference<SDDirectDebitMandateActivateOutputModel>(){});
	}
	
	public SDDirectDebitMandateConfigureOutputModel configure(String sdReferenceId, SDDirectDebitMandateConfigureInputModel request){
		return JsonReader.read("configure-SDDirectDebitMandateConfigureOutputModel.json",new TypeReference<SDDirectDebitMandateConfigureOutputModel>(){});
	}
	
	public CRDirectDebitMandateDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRDirectDebitMandateDirectoryEntryControlInputModel request){
		return JsonReader.read("control-CRDirectDebitMandateDirectoryEntryControlOutputModel.json",new TypeReference<CRDirectDebitMandateDirectoryEntryControlOutputModel>(){});
	}
	
	public BQMandateRegistrationExchangeOutputModel exchangeMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMandateRegistrationExchangeInputModel request){
		return JsonReader.read("exchange-BQMandateRegistrationExchangeOutputModel.json",new TypeReference<BQMandateRegistrationExchangeOutputModel>(){});
	}
	
	public BQMandateRegistrationExecuteOutputModel executeMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMandateRegistrationExecuteInputModel request){
		return JsonReader.read("execute-BQMandateRegistrationExecuteOutputModel.json",new TypeReference<BQMandateRegistrationExecuteOutputModel>(){});
	}
	
	public SDDirectDebitMandateFeedbackOutputModel feedback(String sdReferenceId, SDDirectDebitMandateFeedbackInputModel request){
		return JsonReader.read("feedback-SDDirectDebitMandateFeedbackOutputModel.json",new TypeReference<SDDirectDebitMandateFeedbackOutputModel>(){});
	}
	
	public CRDirectDebitMandateDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRDirectDebitMandateDirectoryEntryRegisterInputModel request){
		return JsonReader.read("register-CRDirectDebitMandateDirectoryEntryRegisterOutputModel.json",new TypeReference<CRDirectDebitMandateDirectoryEntryRegisterOutputModel>(){});
	}
	
	public BQMandateRegistrationRegisterOutputModel registerMandateregistration(String sdReferenceId, String crReferenceId, BQMandateRegistrationRegisterInputModel request){
		return JsonReader.read("register-BQMandateRegistrationRegisterOutputModel.json",new TypeReference<BQMandateRegistrationRegisterOutputModel>(){});
	}
	
	public BQMandateRegistrationRequestOutputModel requestMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMandateRegistrationRequestInputModel request){
		return JsonReader.read("request-BQMandateRegistrationRequestOutputModel.json",new TypeReference<BQMandateRegistrationRequestOutputModel>(){});
	}
	
	public CRDirectDebitMandateDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRDirectDebitMandateDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRDirectDebitMandateDirectoryEntryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQMandateRegistrationRetrieveOutputModel retrieveMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMandateRegistrationRetrieveOutputModel.json",new TypeReference<BQMandateRegistrationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDDirectDebitMandateRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDDirectDebitMandateRetrieveOutputModel.json",new TypeReference<SDDirectDebitMandateRetrieveOutputModel>(){});
	}
	
	public CRDirectDebitMandateDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDirectDebitMandateDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRDirectDebitMandateDirectoryEntryUpdateOutputModel.json",new TypeReference<CRDirectDebitMandateDirectoryEntryUpdateOutputModel>(){});
	}
	
	public BQMandateRegistrationUpdateOutputModel updateMandateregistration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMandateRegistrationUpdateInputModel request){
		return JsonReader.read("update-BQMandateRegistrationUpdateOutputModel.json",new TypeReference<BQMandateRegistrationUpdateOutputModel>(){});
	}
	
}
