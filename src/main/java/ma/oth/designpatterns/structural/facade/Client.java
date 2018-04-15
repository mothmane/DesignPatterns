package ma.oth.designpatterns.structural.facade;

public class Client {
	
	private GestionEtudiant ge;
	private GestionProf gp;
	private GestionSalle gs;

	private GestionEtablissement etab;

	// sans facade
	public void exp01() {
		ge.service1();
		gp.service3();
		gs.service2();
	}
	
	
	// avec facade
	public void exp02() {
		etab.emploiDuTemp();
	}

}
