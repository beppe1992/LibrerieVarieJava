package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Atr {

	@XStreamAlias("CLASSEBMPROV")
	private String classeBmProv;
	
	@XStreamAlias("CLASSEBMASS")
	private String classeBmAss;
	
	@XStreamAlias("CLASSECUPROV")
	private String classeCuProv;
	
	@XStreamAlias("CLASSECUASS")
	private String classeCuAss;
	
	@XStreamAlias("ANNO1")
	private Anno anno1;
	
	@XStreamAlias("ANNO2")
	private Anno anno2;
	
	@XStreamAlias("ANNO3")
	private Anno anno3;
	
	@XStreamAlias("ANNO4")
	private Anno anno4;
	
	@XStreamAlias("ANNO5")
	private Anno anno5;

	public String getClasseBmProv() {
		return classeBmProv;
	}

	public void setClasseBmProv(String classeBmProv) {
		this.classeBmProv = classeBmProv;
	}

	public String getClasseBmAss() {
		return classeBmAss;
	}

	public void setClasseBmAss(String classeBmAss) {
		this.classeBmAss = classeBmAss;
	}

	public String getClasseCuProv() {
		return classeCuProv;
	}

	public void setClasseCuProv(String classeCuProv) {
		this.classeCuProv = classeCuProv;
	}

	public String getClasseCuAss() {
		return classeCuAss;
	}

	public void setClasseCuAss(String classeCuAss) {
		this.classeCuAss = classeCuAss;
	}

	public Anno getAnno1() {
		return anno1;
	}

	public void setAnno1(Anno anno1) {
		this.anno1 = anno1;
	}

	public Anno getAnno2() {
		return anno2;
	}

	public void setAnno2(Anno anno2) {
		this.anno2 = anno2;
	}

	public Anno getAnno3() {
		return anno3;
	}

	public void setAnno3(Anno anno3) {
		this.anno3 = anno3;
	}

	public Anno getAnno4() {
		return anno4;
	}

	public void setAnno4(Anno anno4) {
		this.anno4 = anno4;
	}

	public Anno getAnno5() {
		return anno5;
	}

	public void setAnno5(Anno anno5) {
		this.anno5 = anno5;
	}
	
	
}
