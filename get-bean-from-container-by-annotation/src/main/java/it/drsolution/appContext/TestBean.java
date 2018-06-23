package it.drsolution.appContext;

public class TestBean {
  private String message;
  
  public TestBean(String message) {
	  this.message=message;
  }

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public void printYourMessage() {
	System.out.println(this.message);
}
  
  
}
