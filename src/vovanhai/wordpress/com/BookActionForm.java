package vovanhai.wordpress.com;public class BookActionForm extends org.apache.struts.action.ActionForm {
private static final long serialVersionUID = -6210614082380637094L;

private String name;

private int age;


public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public int getAge() {

return age;

}

public void setAge(int age) {

this.age = age;

}


public BookActionForm(String name, int age) {

this.name = name;

this.age = age;

}

public BookActionForm() {

this("",1);

}

}