package ar.com.sancord.commons.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SMPFACD.C01FCAB")
public class ComprobanteCabecera implements Serializable {

	private static final long serialVersionUID = -7671491272448572267L;

	@Id
	@Column(name = "C01NCA")
	private long nCarga;

	@Column(name = "C01TCO")
	private String tipoCompr;

	@Column(name = "C01TIP")
	private String tipoFormulario;

	@Column(name = "C01TAL")
	private int talonario;

	@Column(name = "C01NCO")
	private int nComprobante;

	@Column(name = "C01MFA")
	private String modFacturacion;
    
	@Column(name = "C01TIC")
	private String tipCompr;
 
	@Column(name = "C01LG")
	private String ctaDeudora;

	@Column(name = "C01EFA")
	private int empFactura;

	@Column(name = "C01PFA")
	private String factA;
	
	@Column(name = "C01CPF")
	private int nroFacA;
	
	@Column(name = "C01FPA")
	private String codFormaPago;

	@Column(name = "C01NPP")
	private int nroFormPago;

	@Column(name = "C01CIV")
	private int codIVA;

	@Column(name = "C01CUI")
	private long numeroCuit;

	@Column(name = "C01CTA")
	private int nroCuenta;

	@Column(name = "C01NPE")
	private int numeroPersona;

	@Column(name = "C01APE")
	private String apellido;

	@Column(name = "C01CAL")
	private String calle;

	@Column(name = "C01NRO")
	private int nroPta;

	@Column(name = "C01PIS")
	private int piso;

	@Column(name = "C01DTO")
	private String depto;

	@Column(name = "C01COP")
	private int codPostal;

	@Column(name = "C01SCO")
	private int SubCodPostal;
	
	@Column(name = "C01BAR")
	private String barrio;
	
	@Column(name = "C01LOC")
	private String localidad;
	
	@Column(name = "C01PCI")
	private String letProv;
	
	@Column(name = "C01DPC")
	private String desProv;
	
	@Column(name = "C01FCO")
	private int fcoCompro;

	@Column(name = "C01PER")
	private int periodo;
	
	@Column(name = "C01FAL")
	private int fecAlic;

	@Column(name = "C01FNE")
	private int fecVtoNeto;

	@Column(name = "C01MON")
	private int moneda;
	
	@Column(name = "C01COT")
	private Double cotizacion;

	@Column(name = "C01EMP")
	private int nroEmpresa;
	
	@Column(name = "C01IMP")
	private int impresion;
	
	@Column(name = "C01CCT")
	private String incDec;
	
	@Column(name = "C01OPE")
	private String operador;
	
	@Column(name = "C01FIN")
	private int fecIngreso;
	
	@Column(name = "C01HIN")
	private int horaIngreso;
	
	@Column(name = "C01TOT")
	private double total;
	
	@Column(name = "C01TX1")
	private String texto1;
	
	@Column(name = "C01TX2")
	private String texto2;

	@Column(name = "C01EST")
	private int estado;
	
	@Column(name = "C01RES")
	private String resFacNada;
	
// 0= no 1= si
	@Column(name = "C01FAC")
	private int seFactura;
	
	@Column(name = "C01CVT")
	private int CondVta;
	
	@Column(name = "C01NAU")
	private String numeraAutSN;
	
	@Column(name = "C01CCO")
	private int cantiCopia;
	
	@Column(name = "C01DSP")
	private String impresora;
	
	@Column(name = "C01FRM")
	private String formulario;
	
	@Column(name = "C01NCD")
	private int noroCompDesde;
	
	@Column(name = "C01NCH")
	private int noroCompHasta;
	
	@Column(name = "C01CHC")
	private int cantHojas;
	
	@Column(name = "C01NSE")
	private int norSecImpre;
	
	@Column(name = "C01CHI")
	private int cantHojaImpr;
	
	@Column(name = "C01ICA")
	private String imprimeCai;
	
	@Column(name = "C01CCA")
	private int codCai;
	
	@Column(name = "C01TAC")
	private int talcobimpro;
	
	@Column(name = "C01NSC")
	private int nroSecCobimpro;
	
	@Column(name = "C01TAM")
	private int norTambo;
	
	@Column(name = "C01ENT")
	private int codEntidad;
	
	@Column(name = "C01CAN")
	private int canal;
	
	@Column(name = "C01NRA")
	private long nroAfiliado;
	
	@Column(name = "C01MDI")
	private String modImpresion;
	
	@Column(name = "C01MNB")
	private String monoblock;
	
	@Column(name = "C01CBA")
	private String codBarrio;
	
	@Column(name = "C01CMH")
	private String codModHab;
	
	@Column(name = "C01TIE")
	private String tipoemprRes;
	
	@Column(name = "C01CTE")
	private int codTipoEnvio;
	
	@Column(name = "C01TEN")
	private String descTipEnvCorr;
	
	@Column(name = "C01ENV")
	private String envio;
	
	@Column(name = "C01COM")
	private String comunicaciones;
	
	@Column(name = "C01TAU")
	private String tipoCodAut;
	
	@Column(name = "C01CAU")
	private long codAutorizacion;
	
	@Column(name = "C01CPA")
	private String codPostalArg;
	
	@Column(name = "C01ITP")
	private int impTalPag;
	
	@Column(name = "C01TEL")
	private String telefono;
	
	@Column(name = "C01GEN")
	private int genComprCancelado;
	
	@Column(name = "C01FEL")
	private String facporMail;
	
	@Column(name = "C01MAI")
	private String mail;
	
	@Column(name = "C01EXC")
	private String excenIVA;
	
	@Column(name = "C01ZOC")
	private String zonaOca;
	
	@Column(name = "C01ORT")
	private String orientazion;
	
	@Column(name = "C01OT1")
	private int otrosdatos1;
	
	@Column(name = "C01OT2")
	private int otrosdatos2;
	
	@Column(name = "C01OT3")
	private String otrosdatos3;
	
	@Column(name = "C01OT4")
	private String otrosdatos4;
	
	@Column(name = "C01ERE")
	private int codoperacion;
	
	@Column(name = "C01MLV")
	private String modLiqVto;
	
	@Column(name = "C01PRC")
	private long nroprocesogencarga;
	
	@Column(name = "C01ASI")
	private int pendienteOk;

	
	
	
	    public long getnCarga() {
			return nCarga;
		}

		public void setnCarga(long nCarga) {
			this.nCarga = nCarga;
		}

		public String getTipoCompr() {
			return tipoCompr;
		}

		public void setTipoCompr(String tipoCompr) {
			this.tipoCompr = tipoCompr;
		}

		public String getTipoFormulario() {
			return tipoFormulario;
		}

		public void setTipoFormulario(String tipoFormulario) {
			this.tipoFormulario = tipoFormulario;
		}

		public int getTalonario() {
			return talonario;
		}

		public void setTalonario(int talonario) {
			this.talonario = talonario;
		}

		public int getnComprobante() {
			return nComprobante;
		}

		public void setnComprobante(int nComprobante) {
			this.nComprobante = nComprobante;
		}

		public String getModFacturacion() {
			return modFacturacion;
		}

		public void setModFacturacion(String modFacturacion) {
			this.modFacturacion = modFacturacion;
		}

		public String getTipCompr() {
			return tipCompr;
		}

		public void setTipCompr(String tipCompr) {
			this.tipCompr = tipCompr;
		}

		public String getCtaDeudora() {
			return ctaDeudora;
		}

		public void setCtaDeudora(String ctaDeudora) {
			this.ctaDeudora = ctaDeudora;
		}

		public int getEmpFactura() {
			return empFactura;
		}

		public void setEmpFactura(int empFactura) {
			this.empFactura = empFactura;
		}

		public String getFactA() {
			return factA;
		}

		public void setFactA(String factA) {
			this.factA = factA;
		}

		public int getNroFacA() {
			return nroFacA;
		}

		public void setNroFacA(int nroFacA) {
			this.nroFacA = nroFacA;
		}

		public String getCodFormaPago() {
			return codFormaPago;
		}

		public void setCodFormaPago(String codFormaPago) {
			this.codFormaPago = codFormaPago;
		}

		public int getNroFormPago() {
			return nroFormPago;
		}

		public void setNroFormPago(int nroFormPago) {
			this.nroFormPago = nroFormPago;
		}

		public int getCodIVA() {
			return codIVA;
		}

		public void setCodIVA(int codIVA) {
			this.codIVA = codIVA;
		}

		public long getNumeroCuit() {
			return numeroCuit;
		}

		public void setNumeroCuit(long numeroCuit) {
			this.numeroCuit = numeroCuit;
		}

		public int getNroCuenta() {
			return nroCuenta;
		}

		public void setNroCuenta(int nroCuenta) {
			this.nroCuenta = nroCuenta;
		}

		public int getNumeroPersona() {
			return numeroPersona;
		}

		public void setNumeroPersona(int numeroPersona) {
			this.numeroPersona = numeroPersona;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCalle() {
			return calle;
		}

		public void setCalle(String calle) {
			this.calle = calle;
		}

		public int getNroPta() {
			return nroPta;
		}

		public void setNroPta(int nroPta) {
			this.nroPta = nroPta;
		}

		public int getPiso() {
			return piso;
		}

		public void setPiso(int piso) {
			this.piso = piso;
		}

		public String getDepto() {
			return depto;
		}

		public void setDepto(String depto) {
			this.depto = depto;
		}

		public int getCodPostal() {
			return codPostal;
		}

		public void setCodPostal(int codPostal) {
			this.codPostal = codPostal;
		}

		public int getSubCodPostal() {
			return SubCodPostal;
		}

		public void setSubCodPostal(int subCodPostal) {
			SubCodPostal = subCodPostal;
		}

		public String getBarrio() {
			return barrio;
		}

		public void setBarrio(String barrio) {
			this.barrio = barrio;
		}

		@Override
	    public String toString() {
	        return "ComprobanteCabecera[ c01nca=" + nCarga + " ]";
	    }
	    


	    public String getLocalidad() {
			return localidad;
		}

		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}

		public String getLetProv() {
			return letProv;
		}

		public void setLetProv(String letProv) {
			this.letProv = letProv;
		}

		public String getDesProv() {
			return desProv;
		}

		public void setDesProv(String desProv) {
			this.desProv = desProv;
		}

		public int getFcoCompro() {
			return fcoCompro;
		}

		public void setFcoCompro(int fcoCompro) {
			this.fcoCompro = fcoCompro;
		}

		public int getPeriodo() {
			return periodo;
		}

		public void setPeriodo(int periodo) {
			this.periodo = periodo;
		}

		public int getFecAlic() {
			return fecAlic;
		}

		public void setFecAlic(int fecAlic) {
			this.fecAlic = fecAlic;
		}

		public int getFecVtoNeto() {
			return fecVtoNeto;
		}

		public void setFecVtoNeto(int fecVtoNeto) {
			this.fecVtoNeto = fecVtoNeto;
		}

		public int getMoneda() {
			return moneda;
		}

		public void setMoneda(int moneda) {
			this.moneda = moneda;
		}

		public Double getCotizacion() {
			return cotizacion;
		}

		public void setCotizacion(Double cotizacion) {
			this.cotizacion = cotizacion;
		}

		public int getNroEmpresa() {
			return nroEmpresa;
		}

		public void setNroEmpresa(int nroEmpresa) {
			this.nroEmpresa = nroEmpresa;
		}

		public int getImpresion() {
			return impresion;
		}

		public void setImpresion(int impresion) {
			this.impresion = impresion;
		}

		public String getIncDec() {
			return incDec;
		}

		public void setIncDec(String incDec) {
			this.incDec = incDec;
		}

		public String getOperador() {
			return operador;
		}

		public void setOperador(String operador) {
			this.operador = operador;
		}

		public int getFecIngreso() {
			return fecIngreso;
		}

		public void setFecIngreso(int fecIngreso) {
			this.fecIngreso = fecIngreso;
		}

		public int getHoraIngreso() {
			return horaIngreso;
		}

		public void setHoraIngreso(int horaIngreso) {
			this.horaIngreso = horaIngreso;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public String getTexto1() {
			return texto1;
		}

		public void setTexto1(String texto1) {
			this.texto1 = texto1;
		}

		public String getTexto2() {
			return texto2;
		}

		public void setTexto2(String texto2) {
			this.texto2 = texto2;
		}

		public int getEstado() {
			return estado;
		}

		public void setEstado(int estado) {
			this.estado = estado;
		}

		public String getResFacNada() {
			return resFacNada;
		}

		public void setResFacNada(String resFacNada) {
			this.resFacNada = resFacNada;
		}

		public int getSeFactura() {
			return seFactura;
		}

		public void setSeFactura(int seFactura) {
			this.seFactura = seFactura;
		}

		public int getCondVta() {
			return CondVta;
		}

		public void setCondVta(int condVta) {
			CondVta = condVta;
		}

		public String getNumeraAutSN() {
			return numeraAutSN;
		}

		public void setNumeraAutSN(String numeraAutSN) {
			this.numeraAutSN = numeraAutSN;
		}

		public int getCantiCopia() {
			return cantiCopia;
		}

		public void setCantiCopia(int cantiCopia) {
			this.cantiCopia = cantiCopia;
		}

		public String getImpresora() {
			return impresora;
		}

		public void setImpresora(String impresora) {
			this.impresora = impresora;
		}

		public String getFormulario() {
			return formulario;
		}

		public void setFormulario(String formulario) {
			this.formulario = formulario;
		}

		public int getNoroCompDesde() {
			return noroCompDesde;
		}

		public void setNoroCompDesde(int noroCompDesde) {
			this.noroCompDesde = noroCompDesde;
		}

		public int getNoroCompHasta() {
			return noroCompHasta;
		}

		public void setNoroCompHasta(int noroCompHasta) {
			this.noroCompHasta = noroCompHasta;
		}

		public int getCantHojas() {
			return cantHojas;
		}

		public void setCantHojas(int cantHojas) {
			this.cantHojas = cantHojas;
		}

		public int getNorSecImpre() {
			return norSecImpre;
		}

		public void setNorSecImpre(int norSecImpre) {
			this.norSecImpre = norSecImpre;
		}

		public int getCantHojaImpr() {
			return cantHojaImpr;
		}

		public void setCantHojaImpr(int cantHojaImpr) {
			this.cantHojaImpr = cantHojaImpr;
		}

		public String getImprimeCai() {
			return imprimeCai;
		}

		public void setImprimeCai(String imprimeCai) {
			this.imprimeCai = imprimeCai;
		}

		public int getCodCai() {
			return codCai;
		}

		public void setCodCai(int codCai) {
			this.codCai = codCai;
		}

		public int getTalcobimpro() {
			return talcobimpro;
		}

		public void setTalcobimpro(int talcobimpro) {
			this.talcobimpro = talcobimpro;
		}

		public int getNroSecCobimpro() {
			return nroSecCobimpro;
		}

		public void setNroSecCobimpro(int nroSecCobimpro) {
			this.nroSecCobimpro = nroSecCobimpro;
		}

		public int getNorTambo() {
			return norTambo;
		}

		public void setNorTambo(int norTambo) {
			this.norTambo = norTambo;
		}

		public int getCodEntidad() {
			return codEntidad;
		}

		public void setCodEntidad(int codEntidad) {
			this.codEntidad = codEntidad;
		}

		public int getCanal() {
			return canal;
		}

		public void setCanal(int canal) {
			this.canal = canal;
		}

		public long getNroAfiliado() {
			return nroAfiliado;
		}

		public void setNroAfiliado(long nroAfiliado) {
			this.nroAfiliado = nroAfiliado;
		}

		public String getModImpresion() {
			return modImpresion;
		}

		public void setModImpresion(String modImpresion) {
			this.modImpresion = modImpresion;
		}

		public String getMonoblock() {
			return monoblock;
		}

		public void setMonoblock(String monoblock) {
			this.monoblock = monoblock;
		}

		public String getCodBarrio() {
			return codBarrio;
		}

		public void setCodBarrio(String codBarrio) {
			this.codBarrio = codBarrio;
		}

		public String getCodModHab() {
			return codModHab;
		}

		public void setCodModHab(String codModHab) {
			this.codModHab = codModHab;
		}

		public String getTipoemprRes() {
			return tipoemprRes;
		}

		public void setTipoemprRes(String tipoemprRes) {
			this.tipoemprRes = tipoemprRes;
		}

		public int getCodTipoEnvio() {
			return codTipoEnvio;
		}

		public void setCodTipoEnvio(int codTipoEnvio) {
			this.codTipoEnvio = codTipoEnvio;
		}

		public String getDescTipEnvCorr() {
			return descTipEnvCorr;
		}

		public void setDescTipEnvCorr(String descTipEnvCorr) {
			this.descTipEnvCorr = descTipEnvCorr;
		}

		public String getEnvio() {
			return envio;
		}

		public void setEnvio(String envio) {
			this.envio = envio;
		}

		public String getComunicaciones() {
			return comunicaciones;
		}

		public void setComunicaciones(String comunicaciones) {
			this.comunicaciones = comunicaciones;
		}

		public String getTipoCodAut() {
			return tipoCodAut;
		}

		public void setTipoCodAut(String tipoCodAut) {
			this.tipoCodAut = tipoCodAut;
		}

		public long getCodAutorizacion() {
			return codAutorizacion;
		}

		public void setCodAutorizacion(long codAutorizacion) {
			this.codAutorizacion = codAutorizacion;
		}

		public String getCodPostalArg() {
			return codPostalArg;
		}

		public void setCodPostalArg(String codPostalArg) {
			this.codPostalArg = codPostalArg;
		}

		public int getImpTalPag() {
			return impTalPag;
		}

		public void setImpTalPag(int impTalPag) {
			this.impTalPag = impTalPag;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public int getGenComprCancelado() {
			return genComprCancelado;
		}

		public void setGenComprCancelado(int genComprCancelado) {
			this.genComprCancelado = genComprCancelado;
		}

		public String getFacporMail() {
			return facporMail;
		}

		public void setFacporMail(String facporMail) {
			this.facporMail = facporMail;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getExcenIVA() {
			return excenIVA;
		}

		public void setExcenIVA(String excenIVA) {
			this.excenIVA = excenIVA;
		}

		public String getZonaOca() {
			return zonaOca;
		}

		public void setZonaOca(String zonaOca) {
			this.zonaOca = zonaOca;
		}

		public String getOrientazion() {
			return orientazion;
		}

		public void setOrientazion(String orientazion) {
			this.orientazion = orientazion;
		}

		public int getOtrosdatos1() {
			return otrosdatos1;
		}

		public void setOtrosdatos1(int otrosdatos1) {
			this.otrosdatos1 = otrosdatos1;
		}

		public int getOtrosdatos2() {
			return otrosdatos2;
		}

		public void setOtrosdatos2(int otrosdatos2) {
			this.otrosdatos2 = otrosdatos2;
		}

		public String getOtrosdatos3() {
			return otrosdatos3;
		}

		public void setOtrosdatos3(String otrosdatos3) {
			this.otrosdatos3 = otrosdatos3;
		}

		public String getOtrosdatos4() {
			return otrosdatos4;
		}

		public void setOtrosdatos4(String otrosdatos4) {
			this.otrosdatos4 = otrosdatos4;
		}

		public int getCodoperacion() {
			return codoperacion;
		}

		public void setCodoperacion(int codoperacion) {
			this.codoperacion = codoperacion;
		}

		public String getModLiqVto() {
			return modLiqVto;
		}

		public void setModLiqVto(String modLiqVto) {
			this.modLiqVto = modLiqVto;
		}

		public long getNroprocesogencarga() {
			return nroprocesogencarga;
		}

		public void setNroprocesogencarga(long nroprocesogencarga) {
			this.nroprocesogencarga = nroprocesogencarga;
		}

		public int getPendienteOk() {
			return pendienteOk;
		}

		public void setPendienteOk(int pendienteOk) {
			this.pendienteOk = pendienteOk;
		}

		@Override
	    public boolean equals(Object object) {
	        if (!(object instanceof ComprobanteCabecera)) {
	            return false;
	        }
	        ComprobanteCabecera other = (ComprobanteCabecera) object;
	        return !((this.nCarga == 0 && other.nCarga != 0) || 
	        		(this.nCarga != 0 && this.nCarga != other.nCarga));
	    }

	
}