package US.CPS.BusinessLayer.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import US.CPS.BusinessLayer.Services.IBucketsService;
import US.CPS.dao.impl.BucketsDAO;
import US.CPS.entity.buckets.Buckets;

public class BucketsService implements IBucketsService{

	@Autowired
	private BucketsDAO bucketsDAO;
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Buckets> GetBucketList() {
		// TODO Auto-generated method stub
		return (List<Buckets> )  bucketsDAO.findAll();
	}

}
