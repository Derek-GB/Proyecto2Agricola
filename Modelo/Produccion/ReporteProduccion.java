
import Modelo.Produccion.Produccion;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileOutputStream;

public class ReporteProduccion {


    public void generarReportePDF(String rutaArchivo, Produccion produccion) {
          try {
          
            Document document = new Document();

            
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));

            
            document.open();

          
            document.add(new Paragraph("Reporte de Producción"));
            document.add(new Paragraph("ID: " + produccion.getId()));
            document.add(new Paragraph("Fecha: " + produccion.getFecha()));
            document.add(new Paragraph("Cantidad recolectada: " + produccion.getCantidadRecolectada()));
            document.add(new Paragraph("Calidad del producto: " + produccion.getCalidad()));
            document.add(new Paragraph("Destino: " + produccion.getDestino()));

            
            document.close();
            writer.close();

            System.out.println("Reporte PDF generado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    public void generarReporteXML(String rutaArchivo, Produccion produccion) {
        try {
            
            JAXBContext context = JAXBContext.newInstance(Produccion.class);

           
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            
            marshaller.marshal(produccion, new File(rutaArchivo));
            System.out.println("Reporte XML generado exitosamente en: " + rutaArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}