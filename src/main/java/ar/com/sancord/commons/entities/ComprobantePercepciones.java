package ar.com.sancord.commons.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SMPFACD.C01FPER")
	
public class ComprobantePercepciones implements Serializable {

	
	private static final long serialVersionUID = 943427838883862825L;

	@Id
	@Column(name = "CP1NCA")
	private Long nCarga;
	@Id
	@Column(name = "CP1NRE")
	private int nroRenglon;

	@Column(name = "CP1TIM")
	private int tipoimpuesto;

	@Column(name = "CP1CIM")
	private int codimpuesto;
	
	@Column(name = "CP1TC")
	private String tipoCalculo;

	@Column(name = "CP1IMM")
	private double impMinimocal;
	
	@Column(name = "CP1ALI")
	private double alicPercep;
	
	@Column(name = "CP1BAS")
	private double importeBase;
	
	@Column(name = "CP1CAL")
	private double importeCalc;
	
	@Column(name = "CP1APL")
	private double importeAplic;
	
	@Column(name = "CP1MPE")
	private double percepcionMin;
	
	@Column(name = "CP1USR")
	private String usuario;
	
	@Column(name = "CP1FEC")
	private int fechaCalculo;

	public Long getnCarga() {
		return nCarga;
	}

	public void setnCarga(Long nCarga) {
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

	public String getTipoCalculo() {
		return tipoCalculo;
	}

	public void setTipoCalculo(String tipoCalculo) {
		this.tipoCalculo = tipoCalculo;
	}

	public double getImpMinimocal() {
		return impMinimocal;
	}

	public void setImpMinimocal(double impMinimocal) {
		this.impMinimocal = impMinimocal;
	}

	public double getAlicPercep() {
		return alicPercep;
	}

	public void setAlicPercep(double alicPercep) {
		this.alicPercep = alicPercep;
	}

	public double getImporteBase() {
		return importeBase;
	}

	public void setImporteBase(double importeBase) {
		this.importeBase = importeBase;
	}

	public double getImporteCalc() {
		return importeCalc;
	}

	public void setImporteCalc(double importeCalc) {
		this.importeCalc = importeCalc;
	}

	public double getImporteAplic() {
		return importeAplic;
	}

	public void setImporteAplic(double importeAplic) {
		this.importeAplic = importeAplic;
	}

	public double getPercepcionMin() {
		return percepcionMin;
	}

	public void setPercepcionMin(double percepcionMin) {
		this.percepcionMin = percepcionMin;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getFechaCalculo() {
		return fechaCalculo;
	}

	public void setFechaCalculo(int fechaCalculo) {
		this.fechaCalculo = fechaCalculo;
	}

		
	
}