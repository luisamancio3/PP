package Q01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaEletronica {

	private List<Contato> agenda = new ArrayList<Contato>();
	
	public AgendaEletronica() {
		super();
	}

	public void addContato(Contato c) {
		this.agenda.add(c);
	}
	
	public boolean removerContato(Contato c) {
		return this.agenda.remove(c);
	}
	
	public void removerContato(String id) {
		this.agenda.removeIf(x -> x.getNome().contains(id));
	}
	
	@SuppressWarnings("null")
	public List<Contato> listarContatos(String id){
		List<Contato> lc = null;
		
		Iterator<Contato> ic = agenda.iterator();
		
		while (ic.hasNext()) {
			Contato contato = (Contato) ic.next();
			
			if (contato.getNome().contains(id)) {
				lc.add(contato);
			}
		}
		
		return lc;
	}
	
	public int size() {
		return this.agenda.size();
	}
}
