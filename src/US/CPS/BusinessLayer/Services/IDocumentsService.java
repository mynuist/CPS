package US.CPS.BusinessLayer.Services;

import org.springframework.transaction.annotation.Transactional;

import US.CPS.entity.document.Documents;

public interface IDocumentsService {

	@Transactional
	public abstract boolean RecordUploadEnvent(Documents doc);
	@Transactional
	public abstract Documents FindDocumentById(Long id);
}
