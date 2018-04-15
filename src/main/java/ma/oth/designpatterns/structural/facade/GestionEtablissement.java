package ma.oth.designpatterns.structural.facade;

public class GestionEtablissement {
	
	private GestionEtudiant ge;
	private GestionProf gp;
	private GestionSalle gs;
	
	
	public void emploiDuTemp() {
		ge.service1();
		gp.service3();
		gs.service2();
	}
	
}
