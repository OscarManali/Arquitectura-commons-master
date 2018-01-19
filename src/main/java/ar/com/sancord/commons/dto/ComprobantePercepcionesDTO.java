package ar.com.sancord.commons.dto;

import java.io.Serializable;
import java.util.Objects;
	
public class ComprobantePercepcionesDTO implements Serializable {

	private static final long serialVersionUID = 3964329187693243850L;

	private Long nCarga;
	private int nroRenglon;
	private int tipoimpuesto;
	private int codimpuesto;
	private String tipoCalculo;
	private double impMinimocal;
	private double alicPercep;
	private double importeBase;
	private double importeCalc;
	private double importeAplic;
	private double percepcionMin;
	private String usuario;
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

	@Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nCarga);
        return hash;
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ComprobantePercepcionesDTO other = (ComprobantePercepcionesDTO) obj;
        return Objects.equals(this.nCarga, other.nCarga);
    }

    @Override
    public String toString() {
        return "ComprobantePercepcionesDTO{" + "nCarga=" + nCarga + " agregar el resto de las propiedades" + '}';
    }
	
	
}