package ar.com.sancord.commons.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SMPFACD.C01FOBS")
public class ComprobanteObservaciones implements Serializable {

	private static final long serialVersionUID = -1371009154026587789L;

	@Id
	@Column(name = "CO1NCA")
	private Long nCarga;
	@Id
	@Column(name = "CO1NRE")
	private int nroRenglon;

	@Column(name = "CO1OBS")
	private String observacion;

	@Column(name = "CO1TIM")
	private int tipoimpuesto;

	@Column(name = "CO1CIM")
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public boolean equals(Object object) {
        if (!(object instanceof ComprobanteObservaciones)) {
            return false;
        }
        ComprobanteObservaciones other = (ComprobanteObservaciones) object;
        return !((this.nCarga == 0 && other.nCarga != 0) || 
        		(this.nCarga != 0 && this.nCarga != other.nCarga));
    }
	
}