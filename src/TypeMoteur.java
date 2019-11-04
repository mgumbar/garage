
public enum TypeMoteur {
	  //Objets directement construits
	  DIESEL ("DIESEL"),
	  ESSENCE ("ESSENCE"),
	  HYBRIDE ("HYBRIDE"),
	  ELECTRIQUE ("ELECTRIQUE");
	
	  private String name = "";
	   
	  //Constructor
	  TypeMoteur(String name){
	    this.name = name;
	  }
	   
	  public String toString(){
	    return name;
	  }
}
