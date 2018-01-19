package ar.com.sancord.commons.dto;

import java.io.Serializable;
import java.util.Objects;


public class ComprobanteCabeceraDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4061484646691969748L;
	private long nCarga;
	private String tipoCompr;
	private String tipoFormulario;
	private int talonario;
	private int nComprobante;
	private String modFacturacion;
	private String tipCompr;
	private String ctaDeudora;
	private int empFactura;
	private String factA;
	private int nroFacA;
	private String codFormaPago;
	private int nroFormPago;
	private int codIVA;
	private long numeroCuit;
	private int nroCuenta;
	private int numeroPersona;
	private String apellido;
	private String calle;
	private int nroPta;
	private int piso;
	private String depto;
	private int codPostal;
	private int SubCodPostal;
	private String barrio;
	private String localidad;
	private String letProv;
	private String desProv;
	private int fcoCompro;
	private int periodo;
	private int fecAlic;
	private int fecVtoNeto;
	private int moneda;
	private Double cotizacion;
	private int nroEmpresa;
	private int impresion;
	private String incDec;
	private String operador;
	private int fecIngreso;
	private int horaIngreso;
	private double total;
	private String texto1;
	private String texto2;
	private int estado;
	private String resFacNada;
// 0= no 1= si
	private int seFactura;
	private int CondVta;
	private String numeraAutSN;
	private int cantiCopia;
	private String impresora;
	private String formulario;
	private int noroCompDesde;
	private int noroCompHasta;
	private int cantHojas;
	private int norSecImpre;
	private int cantHojaImpr;
	private String imprimeCai;
	private int codCai;
	private int talcobimpro;
	private int nroSecCobimpro;
	private int norTambo;
	private int codEntidad;
	private int canal;
	private long nroAfiliado;
	private String modImpresion;
	private String monoblock;
	private String codBarrio;
	private String codModHab;
	private String tipoemprRes;
	private int codTipoEnvio;
	private String descTipEnvCorr;
	private String envio;
	private String comunicaciones;
	private String tipoCodAut;
	private long codAutorizacion;
	private String codPostalArg;
	private int impTalPag;
	private String telefono;
	private int genComprCancelado;
	private String facporMail;
	private String mail;
	private String excenIVA;
	private String zonaOca;
	private String orientazion;
	private int otrosdatos1;
	private int otrosdatos2;
	private String otrosdatos3;
	private String otrosdatos4;
	private int codoperacion;
	private String modLiqVto;
	private long nroprocesogencarga;
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
        final ComprobanteCabeceraDTO other = (ComprobanteCabeceraDTO) obj;
        return Objects.equals(this.nCarga, other.nCarga);
    }

    @Override
    public String toString() {
        return "ComprobanteCabeceraDTO{" + "nCarga=" + nCarga + " agregar el resto de las propiedades" + '}';
    }
	
}