package ar.com.sancord.commons.dto;

import java.io.Serializable;
import java.util.Objects;


public class ComprobanteObservacionesDTO implements Serializable {


	private static final long serialVersionUID = 2185208254879514267L;
	
	private Long nCarga;
	private int nroRenglon;
	private String observacion;
	private int tipoimpuesto;
	private int codimpuesto;

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

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
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
        final ComprobanteObservacionesDTO other = (ComprobanteObservacionesDTO) obj;
        return Objects.equals(this.nCarga, other.nCarga);
    }

    @Override
    public String toString() {
        return "ComprobanteObservacionesDTO{" + "nCarga=" + nCarga + " agregar el resto de las propiedades" + '}';
    }
	
}