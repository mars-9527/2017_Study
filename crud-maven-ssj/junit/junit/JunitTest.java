package junit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import net.cloudsun.entity.Blog;

import org.junit.Before;
import org.junit.Test;

public class JunitTest {

	private EntityManager entityManager;

	@Before
	public void Test1() {

		String persistenceUnitName = "PU";
		// 1获得EntityManagerFactory工厂
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory(persistenceUnitName);
		// 2获得EntityManager
		entityManager = entityManagerFactory.createEntityManager();

	}

	@Test
	public void Test2() {

		Query query = entityManager.createNativeQuery("SELECT * FROM blog",
				Blog.class);

		List<Blog> list = query.getResultList();
		for (Blog blog : list) {

			System.out.println(blog);
		}

	}

}
