package principioResponsabilidadUnica;

public class ReportSrpCorrecto {
    private String title;
    private String body;

    public ReportSrpCorrecto(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}

// Clase para generar reportes
class ReportGenerator {
    public void generateReport(ReportSrpCorrecto report) {
        System.out.println("Generating report: " + report.getTitle());
    }
}

// Clase para imprimir reportes
class ReportPrinter {
    public void printReport(ReportSrpCorrecto report) {
        System.out.println("Printing report: " + report.getTitle());
    }
}

