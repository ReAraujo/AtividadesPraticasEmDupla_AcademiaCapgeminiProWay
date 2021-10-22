package controller;

import java.util.ArrayList;

public class BaseController<T> {
    private ArrayList<T> list;

    public BaseController() {
        this.list = new ArrayList<T>();
    }

    public int tamanhoLista(){
        return this.list.size();
    }

    // CRUD:
    // CREATE 
    public void create(T obj){
        this.list.add(obj);
    }
    // READ
    public ArrayList<T> read(){
        return this.list;
    }
    // UPDATE
    public void update(T obj){
        if(this.list.contains(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }
    // DELETE 
    public void delete(T obj){
        this.list.remove(obj);
    }

    
    
}
