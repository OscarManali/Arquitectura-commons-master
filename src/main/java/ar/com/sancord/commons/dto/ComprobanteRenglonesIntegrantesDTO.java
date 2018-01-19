package ar.com.sancord.commons.dto;

import java.io.Serializable;
import java.util.Objects;

public class ComprobanteRenglonesIntegrantesDTO implements Serializable {
	
	private static final long serialVersionUID = -5223906894877286869L;

	private Long nCarga;
	private int nroRenglon;
	private int tipoimpuesto;
	private int codimpuesto;
	private int apoBonAdicGto;
	private double importe;
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
        final ComprobanteRenglonesIntegrantesDTO other = (ComprobanteRenglonesIntegrantesDTO) obj;
        return Objects.equals(this.nCarga, other.nCarga);
    }

    @Override
    public String toString() {
        return "ComprobanteRenglonesIntegrantesDTO{" + "nCarga=" + nCarga + " agregar el resto de las propiedades" + '}';
    }
	
	
	
}