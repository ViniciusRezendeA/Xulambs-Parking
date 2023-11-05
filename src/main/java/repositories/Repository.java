package repositories;

import java.util.List;

public abstract class Repository<T, U> {
	protected List<T> list;
	
    public Repository(List<T> list) {
    	this.list = list;
    }

    public T findElementById(U id) {
    	throw new UnsupportedOperationException("Este método não foi implementado ainda.");
    }

    public List<T> findAllElements() {
        return  list;
    }

    public Boolean addElement(T element) {
        try {
            list.add(element);
            return true;
        }catch (Exception e){
            throw new UnsupportedOperationException(e);
        }
    }

    public Boolean removeElement(T element) {
    	list.remove(element);
        return true;
    }

    public void updateElement(T element) {
    	throw new UnsupportedOperationException("Este método não foi implementado ainda.");
    }

    public U getLastId() {
    	throw new UnsupportedOperationException("Este método não foi implementado ainda.");
    }
	
}
