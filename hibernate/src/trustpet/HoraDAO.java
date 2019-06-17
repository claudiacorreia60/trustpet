/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Joana(Universidade do Minho)
 * License Type: Academic
 */
package trustpet;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class HoraDAO {
	public static Hora loadHoraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return loadHoraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora getHoraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return getHoraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora loadHoraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return loadHoraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora getHoraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return getHoraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora loadHoraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Hora) session.load(trustpet.Hora.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora getHoraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Hora) session.get(trustpet.Hora.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora loadHoraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hora) session.load(trustpet.Hora.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora getHoraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hora) session.get(trustpet.Hora.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return queryHora(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return queryHora(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora[] listHoraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return listHoraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora[] listHoraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return listHoraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From trustpet.Hora as Hora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From trustpet.Hora as Hora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hora", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora[] listHoraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHora(session, condition, orderBy);
			return (Hora[]) list.toArray(new Hora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora[] listHoraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHora(session, condition, orderBy, lockMode);
			return (Hora[]) list.toArray(new Hora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora loadHoraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return loadHoraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora loadHoraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return loadHoraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora loadHoraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hora[] horas = listHoraByQuery(session, condition, orderBy);
		if (horas != null && horas.length > 0)
			return horas[0];
		else
			return null;
	}
	
	public static Hora loadHoraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hora[] horas = listHoraByQuery(session, condition, orderBy, lockMode);
		if (horas != null && horas.length > 0)
			return horas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHoraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return iterateHoraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHoraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClassPersistentManager.instance().getSession();
			return iterateHoraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHoraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From trustpet.Hora as Hora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHoraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From trustpet.Hora as Hora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hora", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora createHora() {
		return new trustpet.Hora();
	}
	
	public static boolean save(trustpet.Hora hora) throws PersistentException {
		try {
			ClassPersistentManager.instance().saveObject(hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(trustpet.Hora hora) throws PersistentException {
		try {
			ClassPersistentManager.instance().deleteObject(hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(trustpet.Hora hora) throws PersistentException {
		try {
			ClassPersistentManager.instance().getSession().refresh(hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(trustpet.Hora hora) throws PersistentException {
		try {
			ClassPersistentManager.instance().getSession().evict(hora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora loadHoraByCriteria(HoraCriteria horaCriteria) {
		Hora[] horas = listHoraByCriteria(horaCriteria);
		if(horas == null || horas.length == 0) {
			return null;
		}
		return horas[0];
	}
	
	public static Hora[] listHoraByCriteria(HoraCriteria horaCriteria) {
		return horaCriteria.listHora();
	}
}