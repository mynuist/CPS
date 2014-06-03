package US.CPS.dao;

import java.util.List;

import US.CPS.entity.paycard.Paycard;

public interface IPaycardDAO {

	// property constants
	public static final String CARD_NUM = "cardNum";
	public static final String CARD_PASSWORD = "cardPassword";
	public static final String CARD_COUNT = "cardCount";
	public static final String CARD_STATUS = "cardStatus";

	public abstract void save(Paycard transientInstance);

	public abstract void delete(Paycard persistentInstance);

	public abstract Paycard findById(java.lang.Integer id);

	public abstract List findByExample(Paycard instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByCardNum(Object cardNum);

	public abstract List findByCardPassword(Object cardPassword);

	public abstract List findByCardCount(Object cardCount);

	public abstract List findByCardStatus(Object cardStatus);

	public abstract List findAll();

	public abstract Paycard merge(Paycard detachedInstance);

	public abstract void attachDirty(Paycard instance);

	public abstract void attachClean(Paycard instance);

}