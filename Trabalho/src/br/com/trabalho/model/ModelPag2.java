package br.com.trabalho.model;

public class ModelPag2 {
	private String curso_box;
	private String campus_box;
	private boolean matutino_boolean;
	private boolean vespertino_boolean;
	private boolean noturno_boolean;
	public boolean isNoturno_boolean() {
		return noturno_boolean;
	}
	public void setNoturno_boolean(boolean noturno_boolean) {
		this.noturno_boolean = noturno_boolean;
	}
	public String getCurso_box() {
		return curso_box;
	}
	public void setCurso_box(String curso_box) {
		this.curso_box = curso_box;
	}
	public boolean isVespertino_boolean() {
		return vespertino_boolean;
	}
	public void setVespertino_boolean(boolean vespertino_boolean) {
		this.vespertino_boolean = vespertino_boolean;
	}
	public String getCampus_box() {
		return campus_box;
	}
	public void setCampus_box(String campus_box) {
		this.campus_box = campus_box;
	}
	public boolean isMatutino_boolean() {
		return matutino_boolean;
	}
	public void setMatutino_boolean(boolean matutino_boolean) {
		this.matutino_boolean = matutino_boolean;
	}
	
}
