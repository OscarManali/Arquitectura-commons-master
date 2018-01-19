package ar.com.sancord.commons.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SMPFACD.C01FCIN")

public class ComprobanteRenglonesIntegrantes implements Serializable {


	private static final long serialVersionUID = -3250243253588672291L;
	@Id
	@Column(name = "CI2NCA")
	private Long nCarga;
	@Id
	@Column(name = "CI2NRE")
	private int nroRenglon;
	@Id
	@Column(name = "CI2NPE")
	private int tipoimpuesto;
	@Id
	@Column(name = "CI2CON")
	private int codimpuesto;
	@Id
	@Column(name = "CI2TIP")
	private int apoBonAdicGto;

	@Column(name = "CI2IMP")
	private double importe;
	
	@Column(name = "CI2PES")
	private double peso;

	public Long getNcarga() {
		return nCarga;
	}

	public void setNcarga(Long nCarga) {
		this.nCarga = nCarga;
	}

	public int getNroRenglon() {
		return nroRenglon;
	}

	public void setNroRenglon(int nroRenglon) {
		this.nroRenglon = nroRenglon;
	}

	public int getTipoimpuesto() {
		return tipoimpuesto;
	}

	public void setTipoimpuesto(int tipoimpuesto) {
		this.tipoimpuesto = tipoimpuesto;
	}

	public int getCodimpuesto() {
		return codimpuesto;
	}

	public void setCodimpuesto(int codimpuesto) {
		this.codimpuesto = codimpuesto;
	}

	public int getApoBonAdicGto() {
		return apoBonAdicGto;
	}

	public void setApoBonAdicGto(int apoBonAdicGto) {
		this.apoBonAdicGto = apoBonAdicGto;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}