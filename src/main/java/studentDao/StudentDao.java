package studentDao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import studentDto.StudentDto;

public class StudentDao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();


public String insert(StudentDto dto) {
	et.begin();
	em.persist(dto);
	et.commit();
	
	return "Succusfully Added";
}


	public List<StudentDto> fetchAll() {
		Query q=em.createQuery("select data from StudentForm data");
		List<StudentDto> l=q.getResultList();
		return l;
	}


	public String Update(int id,StudentDto dto) {
		StudentDto d=em.find(StudentDto.class, id);
		if(d!=null) {
			et.begin();
			em.merge(dto);
			et.commit();
			return "succufully Updated";
		}else
		{
			return "Invlide Data";
		}
	}


	public String delete(int id) {
	StudentDto dto=	em.find(StudentDto.class, id);
		if(dto!=null) {
			et.begin();
			em.remove(dto);
			et.commit();
			return "Succusfully Deleted";
		}else
		return null;

	}

	




}
