package Q02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AgendaEletronica implements Set<Contato>{
	
	private TreeSet<Contato> agenda = new TreeSet<Contato>();

	public AgendaEletronica() {
		super();
	}
	
	public void addContato(Contato c) {
		agenda.add(c);
	}
	
	public boolean removerContato(Contato c) {
		return agenda.remove(c);
	}
	
	public void removerContato(String id) {
		agenda.removeIf(c -> c.getNome().contains(id));
	}
	
	@SuppressWarnings("null")
	public List<Contato> listarContatos(String id){
		List<Contato> lc = null;
		
		Iterator<Contato> ic = agenda.iterator();
		
		while (ic.hasNext()) {
			Contato c = ic.next();
			if (c.getNome().contains(id)) {
				lc.add(c);
			}
		}
		
		return lc;
	}
	
	@Override
	public int size() {
		return agenda.size();
	}

	@Override
	public boolean isEmpty() {
		return agenda.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return agenda.contains(o);
	}

	@Override
	public Iterator<Contato> iterator() {
		return agenda.iterator();
	}

	@Override
	public Object[] toArray() {
		return agenda.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return agenda.toArray(a);
	}

	@Override
	public boolean add(Contato e) {
		return agenda.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return agenda.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return agenda.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Contato> c) {
		return agenda.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return agenda.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return agenda.removeAll(c);
	}

	@Override
	public void clear() {
		agenda.clear();
	}
}
