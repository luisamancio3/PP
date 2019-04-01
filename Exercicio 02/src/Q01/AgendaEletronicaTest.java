package Q01;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaEletronicaTest {

	AgendaEletronica ag;
	
	@BeforeEach
	void setUp(){
		this.ag = new AgendaEletronica();
	}
	
	@Test
	void addTest(){
		this.ag.addContato(new Contato("nome", "email", 123));
		
		Assert.assertEquals(1, this.ag.size());
	}
	
	@Test
	void removeTest() {
		Contato c1 = new Contato("nome", "email", 123);
		this.ag.addContato(c1);
		
		this.ag.removerContato(c1);
		
		Assert.assertEquals(0, this.ag.size());
		
		this.ag.addContato(c1);
		this.ag.removerContato("no");
		
		Assert.assertEquals(0, this.ag.size());
	}
	
	@Test
	void size() {
		Contato c1 = new Contato("nome", "email", 123);
		Contato c2 = new Contato("nome2", "email", 123);
		
		this.ag.addContato(c1);
		this.ag.addContato(c2);
		
		Assert.assertEquals(2, this.ag.size());
	}
	
	@Test
	void list() {
		Contato c1 = new Contato("nome", "email", 123);
		Contato c2 = new Contato("nome2", "email", 123);
		
		System.out.println(this.ag.listarContatos("no"));
	}
}
