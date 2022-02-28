package collections;
public abstract class AbstractCollection implements Collections{
	protected AbstractCollection() {
	}
	public abstract int size();
	public abstract Iterator iterator();
	public boolean add(Object o) {
		throw new UnsupportedOperationException();
	}
	public boolean contains(Object o) {
		Iterator it=iterator();
		if(o==null) {
			while(it.hasNext()) {
				if(it.next()==null) {
//					it.remove();
					return true;
				}
			}
		}
		else {
			while(it.hasNext()) {
				if(o.equals(it.next())) {
//					it.remove();
					return true;
		}
			}
		}
		return false;
	}
		
	public boolean isEmpty() {
		return (size()==0);
	}
	public String toString() {
		if(isEmpty()) {
			return "[]";
		}
		Iterator it =iterator();
		StringBuffer buf=new StringBuffer("["+it.next());
		while(it.hasNext()) {
			buf.append(", "+it.next());
		}
		return (buf+ "]");
	}
	public void clear() {
		for(Iterator it=iterator();it.hasNext();) {
			it.next();
			it.remove();
		}
	}
	public boolean remove(Object o) {
		Iterator it=iterator();
		if(o==null) {
			while(it.hasNext()) {
				if(it.next()==null) {
					it.remove();
					return true;
				}
			}
		}
		else {
			while(it.hasNext()) {
				if(o.equals(it.next())) {
					it.remove();
					return true;
				}
			}
		}
		return false;
	}
}
