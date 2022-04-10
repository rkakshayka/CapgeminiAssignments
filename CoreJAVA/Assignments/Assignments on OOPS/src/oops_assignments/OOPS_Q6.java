package oops_assignments;

public class OOPS_Q6 {

	public static void main(String[] args) {
		Persistence file = new FilePersistence();
    	Persistence database = new DatabasePersistence();
    	
    	System.out.println(file.persist());
    	System.out.println(database.persist());
	}
} 

abstract class Persistence {
    abstract public String persist();
}

class FilePersistence extends Persistence {
    @Override public String persist() {
    	return "Data is saved in file";
    }
}

class DatabasePersistence extends Persistence{
    @Override public String persist() {
    	return "Data is saved in database";
    }
}



