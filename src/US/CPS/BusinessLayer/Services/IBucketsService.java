package US.CPS.BusinessLayer.Services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import US.CPS.entity.buckets.Buckets;

public interface IBucketsService {
 
	@Transactional
	public abstract List<Buckets> GetBucketList();
}
