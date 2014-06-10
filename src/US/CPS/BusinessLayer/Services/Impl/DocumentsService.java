package US.CPS.BusinessLayer.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import US.CPS.BusinessLayer.Services.IDocumentsService;
import US.CPS.dao.impl.DocumentsDAO;
import US.CPS.entity.document.Documents;

public class DocumentsService implements IDocumentsService {

	@Autowired
	private DocumentsDAO docDAO;
	
	@Override
	@Transactional
	public boolean RecordUploadEnvent(Documents doc) {
		// TODO Auto-generated method stub
		
		docDAO.save(doc);	
		return false;
	}

	@Override
	@Transactional
	public Documents FindDocumentById(Long id) {
		// TODO Auto-generated method stub
		return docDAO.findById(id);
	}

}
