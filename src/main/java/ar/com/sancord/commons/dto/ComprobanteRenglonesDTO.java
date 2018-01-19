package ar.com.sancord.commons.dto;

import java.io.Serializable;
import java.util.Objects;

public class ComprobanteRenglonesDTO implements Serializable {

	
	private static final long serialVersionUID = -3076918431542806607L;
	
	private Long nCarga;
	private int nroRenglon;
	private String ingresoPlanOtros;
	private int empresa;
	private int nroPersona;
	private String apellido;
	private int tipDocum;
	private int nroDocumento;
	private int producto;
	private String plan;
	private int subproducto;
	private String claseProducto;
	private String apBonRecAdicGto;
	private int concepto;
	private String descripcion;
	private String descripcion2;
	private int numeroConcepto;
	private int nroCuota;
	private int cantCuota;
	private int cuentaAfiliado;
	private int subcuentaAfiliado;
	private int codfuenteIngr;
	private int nroCarnetAfiliado;
	private double importeCalculado;
	private double importeIngresado;
	private String refContableMercaderia;
	private double importeIvaCalculado;
	private double importeIvaIngresado;
	private String refcontableIva;
	private double alicutaIva;
	private String  ctaCte;
	private int cantConcepto;
	private int periodo;
	private int cantIntegrante;
	private int edadmayor;
	private int fechaIngSalud;
	private int fechaPrestacion;
	private int fechaIngrPlan;
	private int antigPlan;
	private int estado;
	private int impDetCpto;
	private int hoja;
	private String mayAuxMerc;
	private int espMayAuxMerc;
	private int centroDeCosto;
	private String mayAuxIva;
	private int esoMayAuxIva;
	private int centrodecostoiva;
	private int estadoImprConcepto;
	private String tipoOperaciones;
	private Long codTransaccion;
	private String bonifEspecial;
	private String genenliqui;
	private int nroProvisorio;

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

	public String getIngresoPlanOtros() {
		return ingresoPlanOtros;
	}

	public void setIngresoPlanOtros(String ingresoPlanOtros) {
		this.ingresoPlanOtros = ingresoPlanOtros;
	}

	public int getEmpresa() {
		return empresa;
	}

	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	public int getNroPersona() {
		return nroPersona;
	}

	public void setNroPersona(int nroPersona) {
		this.nroPersona = nroPersona;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTipDocum() {
		return tipDocum;
	}

	public void setTipDocum(int tipDocum) {
		this.tipDocum = tipDocum;
	}

	public int getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public int getProducto() {
		return producto;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public int getSubproducto() {
		return subproducto;
	}

	public void setSubproducto(int subproducto) {
		this.subproducto = subproducto;
	}

	public String getClaseProducto() {
		return claseProducto;
	}

	public void setClaseProducto(String claseProducto) {
		this.claseProducto = claseProducto;
	}

	public String getApBonRecAdicGto() {
		return apBonRecAdicGto;
	}

	public void setApBonRecAdicGto(String apBonRecAdicGto) {
		this.apBonRecAdicGto = apBonRecAdicGto;
	}

	public int getConcepto() {
		return concepto;
	}

	public void setConcepto(int concepto) {
		this.concepto = concepto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion2() {
		return descripcion2;
	}

	public void setDescripcion2(String descripcion2) {
		this.descripcion2 = descripcion2;
	}

	public int getNumeroConcepto() {
		return numeroConcepto;
	}

	public void setNumeroConcepto(int numeroConcepto) {
		this.numeroConcepto = numeroConcepto;
	}

	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public int getCantCuota() {
		return cantCuota;
	}

	public void setCantCuota(int cantCuota) {
		this.cantCuota = cantCuota;
	}

	public int getCuentaAfiliado() {
		return cuentaAfiliado;
	}

	public void setCuentaAfiliado(int cuentaAfiliado) {
		this.cuentaAfiliado = cuentaAfiliado;
	}

	public int getSubcuentaAfiliado() {
		return subcuentaAfiliado;
	}

	public void setSubcuentaAfiliado(int subcuentaAfiliado) {
		this.subcuentaAfiliado = subcuentaAfiliado;
	}

	public int getCodfuenteIngr() {
		return codfuenteIngr;
	}

	public void setCodfuenteIngr(int codfuenteIngr) {
		this.codfuenteIngr = codfuenteIngr;
	}

	public int getNroCarnetAfiliado() {
		return nroCarnetAfiliado;
	}

	public void setNroCarnetAfiliado(int nroCarnetAfiliado) {
		this.nroCarnetAfiliado = nroCarnetAfiliado;
	}

	public double getImporteCalculado() {
		return importeCalculado;
	}

	public void setImporteCalculado(double importeCalculado) {
		this.importeCalculado = importeCalculado;
	}

	public double getImporteIngresado() {
		return importeIngresado;
	}

	public void setImporteIngresado(double importeIngresado) {
		this.importeIngresado = importeIngresado;
	}

	public String getRefContableMercaderia() {
		return refContableMercaderia;
	}

	public void setRefContableMercaderia(String refContableMercaderia) {
		this.refContableMercaderia = refContableMercaderia;
	}

	public double getImporteIvaCalculado() {
		return importeIvaCalculado;
	}

	public void setImporteIvaCalculado(double importeIvaCalculado) {
		this.importeIvaCalculado = importeIvaCalculado;
	}

	public double getImporteIvaIngresado() {
		return importeIvaIngresado;
	}

	public void setImporteIvaIngresado(double importeIvaIngresado) {
		this.importeIvaIngresado = importeIvaIngresado;
	}

	public String getRefcontableIva() {
		return refcontableIva;
	}

	public void setRefcontableIva(String refcontableIva) {
		this.refcontableIva = refcontableIva;
	}

	public double getAlicutaIva() {
		return alicutaIva;
	}

	public void setAlicutaIva(double alicutaIva) {
		this.alicutaIva = alicutaIva;
	}

	public String getCtaCte() {
		return ctaCte;
	}

	public void setCtaCte(String ctaCte) {
		this.ctaCte = ctaCte;
	}

	public int getCantConcepto() {
		return cantConcepto;
	}

	public void setCantConcepto(int cantConcepto) {
		this.cantConcepto = cantConcepto;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getCantIntegrante() {
		return cantIntegrante;
	}

	public void setCantIntegrante(int cantIntegrante) {
		this.cantIntegrante = cantIntegrante;
	}

	public int getEdadmayor() {
		return edadmayor;
	}

	public void setEdadmayor(int edadmayor) {
		this.edadmayor = edadmayor;
	}

	public int getFechaIngSalud() {
		return fechaIngSalud;
	}

	public void setFechaIngSalud(int fechaIngSalud) {
		this.fechaIngSalud = fechaIngSalud;
	}

	public int getFechaPrestacion() {
		return fechaPrestacion;
	}

	public void setFechaPrestacion(int fechaPrestacion) {
		this.fechaPrestacion = fechaPrestacion;
	}

	public int getFechaIngrPlan() {
		return fechaIngrPlan;
	}

	public void setFechaIngrPlan(int fechaIngrPlan) {
		this.fechaIngrPlan = fechaIngrPlan;
	}

	public int getAntigPlan() {
		return antigPlan;
	}

	public void setAntigPlan(int antigPlan) {
		this.antigPlan = antigPlan;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getImpDetCpto() {
		return impDetCpto;
	}

	public void setImpDetCpto(int impDetCpto) {
		this.impDetCpto = impDetCpto;
	}

	public int getHoja() {
		return hoja;
	}

	public void setHoja(int hoja) {
		this.hoja = hoja;
	}

	public String getMayAuxMerc() {
		return mayAuxMerc;
	}

	public void setMayAuxMerc(String mayAuxMerc) {
		this.mayAuxMerc = mayAuxMerc;
	}

	public int getEspMayAuxMerc() {
		return espMayAuxMerc;
	}

	public void setEspMayAuxMerc(int espMayAuxMerc) {
		this.espMayAuxMerc = espMayAuxMerc;
	}

	public int getCentroDeCosto() {
		return centroDeCosto;
	}

	public void setCentroDeCosto(int centroDeCosto) {
		this.centroDeCosto = centroDeCosto;
	}

	public String getMayAuxIva() {
		return mayAuxIva;
	}

	public void setMayAuxIva(String mayAuxIva) {
		this.mayAuxIva = mayAuxIva;
	}

	public int getEsoMayAuxIva() {
		return esoMayAuxIva;
	}

	public void setEsoMayAuxIva(int esoMayAuxIva) {
		this.esoMayAuxIva = esoMayAuxIva;
	}

	public int getCentrodecostoiva() {
		return centrodecostoiva;
	}

	public void setCentrodecostoiva(int centrodecostoiva) {
		this.centrodecostoiva = centrodecostoiva;
	}

	public int getEstadoImprConcepto() {
		return estadoImprConcepto;
	}

	public void setEstadoImprConcepto(int estadoImprConcepto) {
		this.estadoImprConcepto = estadoImprConcepto;
	}

	public String getTipoOperaciones() {
		return tipoOperaciones;
	}

	public void setTipoOperaciones(String tipoOperaciones) {
		this.tipoOperaciones = tipoOperaciones;
	}

	public Long getCodTransaccion() {
		return codTransaccion;
	}

	public void setCodTransaccion(Long codTransaccion) {
		this.codTransaccion = codTransaccion;
	}

	public String getBonifEspecial() {
		return bonifEspecial;
	}

	public void setBonifEspecial(String bonifEspecial) {
		this.bonifEspecial = bonifEspecial;
	}

	public String getGenenliqui() {
		return genenliqui;
	}

	public void setGenenliqui(String genenliqui) {
		this.genenliqui = genenliqui;
	}

	public int getNroProvisorio() {
		return nroProvisorio;
	}

	public void setNroProvisorio(int nroProvisorio) {
		this.nroProvisorio = nroProvisorio;
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
        final ComprobanteRenglonesDTO other = (ComprobanteRenglonesDTO) obj;
        return Objects.equals(this.nCarga, other.nCarga);
    }

    @Override
    public String toString() {
        return "ComprobanteRenglonesDTO{" + "nCarga=" + nCarga + " agregar el resto de las propiedades" + '}';
    }
	
	
	
}