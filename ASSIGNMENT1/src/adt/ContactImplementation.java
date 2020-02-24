package adt;

public interface ContactImplementation<E> {
   // create method for add.delete,search,view,exit
public void add(E f_name,E l_name,E mob,E email);

public void delete();

public void search();

public void view();

public void exit();
}
