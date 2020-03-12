package lawfirm;

public class HarvardLawyer extends Lawyer {
	
    public void applyForVacation() {
        System.out.println("Use the pink vacation form.");
    }
    
    public void showVacation() {
        System.out.println("I receive 3 days more.");
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
    public void showSalary() {
        System.out.println("My salary is 20% more.");
    }
    public String getVacationForm() {
    	return "pinkpinkpinkpink";
    	
    }
}
