
import Modelo.Produccion.Produccion;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileOutputStream;

public class ReporteProduccion {

    // Método para generar un reporte en PDF
    public void generarReportePDF(String rutaArchivo, Produccion produccion) {
          try {
            // Crear un documento de iText
            Document document = new Document();

            // Crear PdfWriter y enlazarlo con el documento
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));

            // Abrir el documento para añadir contenido
            document.open();

            // Añadir contenido al PDF
            document.add(new Paragraph("Reporte de Producción"));
            document.add(new Paragraph("ID: " + produccion.getId()));
            document.add(new Paragraph("Fecha: " + produccion.getFecha()));
            document.add(new Paragraph("Cantidad recolectada: " + produccion.getCantidadRecolectada()));
            document.add(new Paragraph("Calidad del producto: " + produccion.getCalidad()));
            document.add(new Paragraph("Destino: " + produccion.getDestino()));

            // Cerrar el documento
            document.close();
            writer.close();

            System.out.println("Reporte PDF generado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para generar un reporte en XML
    public void generarReporteXML(String rutaArchivo, Produccion produccion) {
        try {
            // Crear el contexto JAXB para la clase Produccion
            JAXBContext context = JAXBContext.newInstance(Produccion.class);

            // Crear el Marshaller (serializador)
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Escribir el objeto en un archivo XML
            marshaller.marshal(produccion, new File(rutaArchivo));
            System.out.println("Reporte XML generado exitosamente en: " + rutaArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}