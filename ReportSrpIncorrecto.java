package principioResponsabilidadUnica;

public class ReportSrpIncorrecto {
    private String title;
    private String body;

    public ReportSrpIncorrecto(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    // Método para generar el reporte
    public void generateReport() {
        // Lógica para generar el reporte
        System.out.println("Generating report: " + title);
    }

    // Método para imprimir el reporte
    public void printReport() {
        // Lógica para imprimir el reporte
        System.out.println("Printing report: " + title);
    }
}
