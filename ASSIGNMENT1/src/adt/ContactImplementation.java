package adt;

public interface ContactImplementation<E> {
   // create method for add.delete,search,view,exit
public void add(String firstName,String lastName,long mob,String emailId);

public void delete();

public void search();

public void view();

public void exit();
}
