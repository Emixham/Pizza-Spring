package pizza.spring.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import pizza.spring.dao.CommandeDao;
import pizza.spring.dao.PizzaDao;
import pizza.spring.dao.RapportDao;
import pizza.spring.modele.Fidelisation;
import pizza.spring.modele.RapportJournalier;



public class RapportServiceTest {
	
private RapportDao rapportDaoMock;
private RapportService rapportServiceMock;
	@Before
	public void initService() {
		rapportDaoMock = mock(RapportDao.class);
		rapportServiceMock = new RapportService();
	}
	
	
	@Test
	public void recuperer_rapport_fidelisation() throws Exception {
		
		
		assertEquals("", "");
	}
//	@Test
//	public void recuperer_rapport_journalier() throws Exception {
		
	//	assertEquals("nom", rapportServiceMock.getRapportJournalier());
	//}
}
