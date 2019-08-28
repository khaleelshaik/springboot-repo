package com.khaleel.springboot;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.khaleel.springboot.entities.DocumentList;
//import com.khaleel.springboot.entities.DocumentLists;
////import com.khaleel.springboot.entities.Employee;
//import com.khaleel.springboot.entities.Employee2;

@RestController
public class App 
{
//	@Autowired
//	private EmployeeDAO emp;
	
	@Value("${test}")
	private String value;
	
//	@RequestMapping(value="/get", method=RequestMethod.GET,produces=(MediaType.APPLICATION_JSON_VALUE))
//	public ResponseEntity<?> getSpringText() {
//		
//		DocumentLists documentLists = new DocumentLists();
//		DocumentList documentList = new DocumentList();
//		documentList.setServiceStopTime("2017-06-06");
//		documentList.setTypeCode("100.16644");
//		documentList.setDocumentID("urn:oid:2.25.157598728300360404652072519241668369195");
//		documentList.setRepositoryID("8003640002000043");
//		documentList.setDocumentStatus("Active");
//		documentList.setDocumentAccessLevel("General");
//
//		DocumentList documentList1 = new DocumentList();
//		documentList1.setServiceStopTime("2017-06-30");
//		documentList1.setTypeCode("100.16650");
//		documentList1.setDocumentID("urn:oid:2.25.15759872830036040465207251976938369198");
//		documentList1.setRepositoryID("8003640002000045");
//		documentList1.setDocumentStatus("Deprecated");
//		documentList1.setDocumentAccessLevel("Restricted");
//		documentList1.setDocumentRemovalReason("Incorrect Identity");
//
//		DocumentList documentList2 = new DocumentList();
//		documentList2.setServiceStopTime("2017-03-31");
//		documentList2.setTypeCode("100.16671");
//		documentList2.setDocumentID("urn:oid:2.25.15759872830036040465207251976938369196");
//		documentList2.setRepositoryID("8003640002000045");
//		documentList2.setDocumentStatus("Active");
//		documentList2.setDocumentAccessLevel("Restricted");
//
//		DocumentList documentList3 = new DocumentList();
//		documentList3.setServiceStopTime("2017-01-13");
//		documentList3.setTypeCode("100.17042");
//		documentList3.setDocumentID("urn:oid:2.25.15759872830036040465207251976938369197");
//		documentList3.setRepositoryID("8003640002000045");
//		documentList3.setDocumentStatus("Deprecated");
//		documentList3.setDocumentAccessLevel("Restricted");
//		documentList3.setDocumentRemovalReason("Withdrawn");
//
//		DocumentList documentList4 = new DocumentList();
//		documentList4.setServiceStopTime("2017-06-30");
//		documentList4.setTypeCode("100.16650");
//		documentList4.setDocumentID("urn:oid:2.25.15759872830036040465207251976938369193");
//		documentList4.setRepositoryID("8003640002000045");
//		documentList4.setDocumentStatus("Deprecated");
//		documentList4.setDocumentAccessLevel("Restricted");
//		documentList4.setDocumentRemovalReason("Administrator Action");
//
//		DocumentList documentList5 = new DocumentList();
//		documentList5.setServiceStopTime("2017-06-30");
//		documentList5.setTypeCode("100.16650");
//		documentList5.setDocumentID("urn:oid:2.25.15759872830036040465207251976938369194");
//		documentList5.setRepositoryID("8003640002000045");
//		documentList5.setDocumentStatus("Deprecated");
//		documentList5.setDocumentAccessLevel("General");
//		documentList5.setDocumentRemovalReason("Administrative Action: Untrusted Source");
//
//		List<DocumentList> list = new ArrayList<>();
//		list.add(documentList);
//		list.add(documentList1);
//		list.add(documentList2);
//		list.add(documentList3);
//		list.add(documentList4);
//		list.add(documentList5);
//		documentLists.setCount(list.size());
//		documentLists.setDocumentList(list);
//		return ResponseEntity.ok(documentLists);
//	}
////	
	@RequestMapping(path="/")
	public String getString() {
		return "test";
	}
}
