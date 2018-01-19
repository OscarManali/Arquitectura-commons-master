package ar.com.sancord.commons.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SMPFACD.C02FREN")
public class ComprobanteRenglones implements Serializable {

	
	private static final long serialVersionUID = 8235452832557180555L;

	@Id
	@Column(name = "C02NCA")
	private Long nCarga;
	@Id
	@Column(name = "C02NRE")
	private int nroRenglon;

	@Column(name = "C02ING")
	private String ingresoPlanOtros;

	@Column(name = "C02NEM")
	private int empresa;

	@Column(name = "C02NPE")
	private int nroPersona;

	@Column(name = "C02APE")
	private String apellido;
    
	@Column(name = "C02TD")
	private int tipDocum;
 
	@Column(name = "C02ND")
	private int nroDocumento;

	@Column(name = "C02PRO")
	private int producto;

	@Column(name = "C02PLA")
	private String plan;
	
	@Column(name = "C02SPR")
	private int subproducto;
	
	@Column(name = "C02CPR")
	private String claseProducto;

	@Column(name = "C02TIP")
	private String apBonRecAdicGto;

	@Column(name = "C02CON")
	private int concepto;

	@Column(name = "C02DES")
	private String descripcion;

	@Column(name = "C02DE2")
	private String descripcion2;

	@Column(name = "C02NCO")
	private int numeroConcepto;

	@Column(name = "C02CUO")
	private int nroCuota;

	@Column(name = "C02CCU")
	private int cantCuota;

	@Column(name = "C02NAF")
	private int cuentaAfiliado;

	@Column(name = "C02SAF")
	private int subcuentaAfiliado;

	@Column(name = "C02COD")
	private int codfuenteIngr;

	@Column(name = "C02NRO")
	private int nroCarnetAfiliado;

	@Column(name = "C02IMP")
	private double importeCalculado;
	
	@Column(name = "C02IMI")
	private double importeIngresado;
	
	@Column(name = "C02REF")
	private String refContableMercaderia;
	
	@Column(name = "C02IVA")
	private double importeIvaCalculado;
	
	@Column(name = "C02IVI")
	private double importeIvaIngresado;
	
	@Column(name = "C02RIV")
	private String refcontableIva;

	@Column(name = "C02ALI")
	private double alicutaIva;
	
	@Column(name = "C02CCT")
	private String  ctaCte;

	@Column(name = "C02CAN")
	private int cantConcepto;

	@Column(name = "C02PER")
	private int periodo;
	
	@Column(name = "C02CIN")
	private int cantIntegrante;

	@Column(name = "C02EDA")
	private int edadmayor;
	
	@Column(name = "C02FIS")
	private int fechaIngSalud;
	
	@Column(name = "C02FPR")
	private int fechaPrestacion;
	
	@Column(name = "C02FIP")
	private int fechaIngrPlan;
	
	@Column(name = "C02ANT")
	private int antigPlan;
	
	@Column(name = "C02EST")
	private int estado;
	
	@Column(name = "C02DET")
	private int impDetCpto;
	
	@Column(name = "C02HOJ")
	private int hoja;
	
	@Column(name = "C02AUM")
	private String mayAuxMerc;
	
	@Column(name = "C02EMA")
	private int espMayAuxMerc;
	
	@Column(name = "C02CCO")
	private int centroDeCosto;
	
	@Column(name = "C02AUI")
	private String mayAuxIva;
	
	@Column(name = "C02EMI")
	private int esoMayAuxIva;
	
	@Column(name = "C02CCI")
	private int centrodecostoiva;
	
	@Column(name = "C02EIM")
	private int estadoImprConcepto;
	
	@Column(name = "C02TOP")
	private String tipoOperaciones;
	
	@Column(name = "C02CNU")
	private Long codTransaccion;
	
	@Column(name = "C02BOE")
	private String bonifEspecial;
	
	@Column(name = "C02GEL")
	private String genenliqui;
	
	@Column(name = "C02NRP")
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

	
	
	
}