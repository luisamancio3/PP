package Q03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AgendaEletronica implements Map<String, Contato>{
	
	private HashMap<String, Contato> agenda = new HashMap<String, Contato>();

	public AgendaEletronica() {
		super();
	}
	
	public void addContato(String nome,Contato c) {
		agenda.put(nome, c);
	}

	public boolean removerContato(Contato c) {
		return agenda.values().remove(c);
	}
	
	public void removerContato(String id) {
		agenda.keySet().remove(id);
	}

	@SuppressWarnings("null")
	public List<Contato> listarContatos(String id){
		List<Contato> lc = null;
		
		Iterator<String> ic =  agenda.keySet().iterator();
		
		while (ic.hasNext()) {
			String s = (String) ic.next();
			
			if (s.contains(id)) {
				lc.add(agenda.get(id));
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
	public boolean containsKey(Object key) {
		return agenda.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return agenda.containsValue(value);
	}

	@Override
	public Contato get(Object key) {
		return agenda.get(key);
	}

	@Override
	public Contato put(String key, Contato value) {
		return agenda.put(key, value);
	}

	@Override
	public Contato remove(Object key) {
		return agenda.remove(key);
	}

	@Override
	public void putAll(Map<? extends String, ? extends Contato> m) {
		agenda.putAll(m);
	}

	@Override
	public void clear() {
		agenda.clear();
	}

	@Override
	public Set<String> keySet() {
		return agenda.keySet();
	}

	@Override
	public Collection<Contato> values() {
		return agenda.values();
	}

	@Override
	public Set<Entry<String, Contato>> entrySet() {
		return agenda.entrySet();
	}
}
