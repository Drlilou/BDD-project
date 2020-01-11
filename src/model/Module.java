package model;

import java.util.List;

public class Module {
	int code;
	String libellé;
	int duree;
	List<Module> pre_requis;
	List<Enseignant> enseignants;
	Titulaire titulaireResponsable;
	List<Formation> formations;
}
