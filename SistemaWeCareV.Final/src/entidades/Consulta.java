package entidades;

public class Consulta {
    
    // Atributos
    private int consultaID;
    private int expedienteID;
    private String fechaConsulta;
    private String nombreMedico;
    private String tratamiento;
    private float peso;
    private String estadoSaludGeneral;
    private String diagnostico;
    private String seguimiento;
    private String resultadosExamenes;

    
    // Cpnstructores
    public Consulta() {
    }

    public Consulta(int consultaID, int expedienteID, String fechaConsulta, String nombreMedico, String tratamiento, float peso, String estadoSaludGeneral, String diagnostico, String seguimiento, String resultadosExamenes) {
        this.consultaID = consultaID;
        this.expedienteID = expedienteID;
        this.fechaConsulta = fechaConsulta;
        this.nombreMedico = nombreMedico;
        this.tratamiento = tratamiento;
        this.peso = peso;
        this.estadoSaludGeneral = estadoSaludGeneral;
        this.diagnostico = diagnostico;
        this.seguimiento = seguimiento;
        this.resultadosExamenes = resultadosExamenes;
    }
    
    
    // Metodos especificos de los atributos
    public int getConsultaID() {
        return consultaID;
    }

    public void setConsultaID(int consultaID) {
        this.consultaID = consultaID;
    }

    public int getExpedienteID() {
        return expedienteID;
    }

    public void setExpedienteID(int expedienteID) {
        this.expedienteID = expedienteID;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getEstadoSaludGeneral() {
        return estadoSaludGeneral;
    }

    public void setEstadoSaludGeneral(String estadoSaludGeneral) {
        this.estadoSaludGeneral = estadoSaludGeneral;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(String seguimiento) {
        this.seguimiento = seguimiento;
    }

    public String getResultadosExamenes() {
        return resultadosExamenes;
    }

    public void setResultadosExamenes(String resultadosExamenes) {
        this.resultadosExamenes = resultadosExamenes;
    }
}
