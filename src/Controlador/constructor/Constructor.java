package Controlador.constructor;

/**
 *
 * @author Oscar Fonseca
 */
public class Constructor {
    
    private String Nombre;
    private String Direccion;
    private String Nºmedidor;
    private int NIS;
    private int Diasfacturados;
    private String Mesfacturado;
    private String Fechaemicion;
    private String Fechavencimiento;
    private int kWh;
    private double EnergiaC$;
    private double Alumbradopublico;
    private double Comercializacion;
    private double Subsidio;
    private double Subsidiocomercial;
    private double INE;
    private String Periodoinicio;
    private String Periodofinal;
    private double Totalpagar;
    private double Totaldeuda;
    private byte[] foto;
    
    public Constructor(){}

    public Constructor(String Nombre, String Direccion, String Nºmedidor, int NIS, int Diasfacturados, String Mesfacturado, String Fechaemicion, String Fechavencimiento, int kWh, double EnergiaC$, double Alumbradopublico, double Comercializacion, double Subsidio, double Subsidiocomercial, double INE, String Periodoinicio, String Periodofinal, double Totalpagar, double Totaldeuda) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Nºmedidor = Nºmedidor;
        this.NIS = NIS;
        this.Diasfacturados = Diasfacturados;
        this.Mesfacturado = Mesfacturado;
        this.Fechaemicion = Fechaemicion;
        this.Fechavencimiento = Fechavencimiento;
        this.kWh = kWh;
        this.EnergiaC$ = EnergiaC$;
        this.Alumbradopublico = Alumbradopublico;
        this.Comercializacion = Comercializacion;
        this.Subsidio = Subsidio;
        this.Subsidiocomercial = Subsidiocomercial;
        this.INE = INE;
        this.Periodoinicio = Periodoinicio;
        this.Periodofinal = Periodofinal;
        this.Totalpagar = Totalpagar;
        this.Totaldeuda = Totaldeuda;
        this.foto = foto;
    }

    public Constructor(String nombre, String direccion, String nºmemidor, int nis) {}

    public Constructor(String nombre, String direccion, String nºmedidor, String nis, String diasfacturados,
            String mesfacturado, String fechaemicion, String fechavencimiento, String kwh, String periodoinicial,
            String periodofinal, String energiac$, String alumbradopublico, String comercializacion, String subcidio,
            String ine, String totalpagar) {}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNºmedidor() {
        return Nºmedidor;
    }

    public void setNºmedidor(String Nºmedidor) {
        this.Nºmedidor = Nºmedidor;
    }

    public int getNIS() {
        return NIS;
    }

    public void setNIS(int NIS) {
        this.NIS = NIS;
    }

    public int getDiasfacturados() {
        return Diasfacturados;
    }

    public void setDiasfacturados(int Diasfacturados) {
        this.Diasfacturados = Diasfacturados;
    }

    public String getMesfacturado() {
        return Mesfacturado;
    }

    public void setMesfacturado(String Mesfacturado) {
        this.Mesfacturado = Mesfacturado;
    }

    public String getFechaemicion() {
        return Fechaemicion;
    }

    public void setFechaemicion(String Fechaemicion) {
        this.Fechaemicion = Fechaemicion;
    }

    public String getFechavencimiento() {
        return Fechavencimiento;
    }

    public void setFechavencimiento(String Fechavencimiento) {
        this.Fechavencimiento = Fechavencimiento;
    }

    public int getkWh() {
        return kWh;
    }

    public void setkWh(int kWh) {
        this.kWh = kWh;
    }

    public double getEnergiaC$() {
        return EnergiaC$;
    }

    public void setEnergiaC$(double EnergiaC$) {
        this.EnergiaC$ = EnergiaC$;
    }

    public double getAlumbradopublico() {
        return Alumbradopublico;
    }

    public void setAlumbradopublico(double Alumbradopublico) {
        this.Alumbradopublico = Alumbradopublico;
    }

    public double getComercializacion() {
        return Comercializacion;
    }

    public void setComercializacion(double Comercializacion) {
        this.Comercializacion = Comercializacion;
    }

    public double getSubsidio() {
        return Subsidio;
    }

    public void setSubsidio(double Subsidio) {
        this.Subsidio = Subsidio;
    }

    public double getSubsidiocomercial() {
        return Subsidiocomercial;
    }

    public void setSubsidiocomercial(double Subsidiocomercial) {
        this.Subsidiocomercial = Subsidiocomercial;
    }

    public double getINE() {
        return INE;
    }

    public void setINE(double INE) {
        this.INE = INE;
    }

    public String getPeriodoinicio() {
        return Periodoinicio;
    }

    public void setPeriodoinicio(String Periodoinicio) {
        this.Periodoinicio = Periodoinicio;
    }

    public String getPeriodofinal() {
        return Periodofinal;
    }

    public void setPeriodofinal(String Periodofinal) {
        this.Periodofinal = Periodofinal;
    }

    public double getTotalpagar() {
        return Totalpagar;
    }

    public void setTotalpagar(double Totalpagar) {
        this.Totalpagar = Totalpagar;
    }

    public double getTotaldeuda() {
        return Totaldeuda;
    }

    public void setTotaldeuda(double Totaldeuda) {
        this.Totaldeuda = Totaldeuda;
    }
    
    public byte[] getFoto() {
        return foto;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
