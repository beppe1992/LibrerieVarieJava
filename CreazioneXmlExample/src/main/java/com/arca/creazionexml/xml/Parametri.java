package com.arca.creazionexml.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Parametri {

	@XStreamAlias("PATHXDP")
	private String pathXdp;
	
	@XStreamAlias("XDP")
	private String xdp;

	public String getPathXdp() {
		return pathXdp;
	}

	public String getXdp() {
		return xdp;
	}

	public void setXdp(String xdp) {
		this.xdp = xdp;
	}

	public void setPathXdp(String pathXdp) {
		this.pathXdp = pathXdp;
	}

	
	
}
