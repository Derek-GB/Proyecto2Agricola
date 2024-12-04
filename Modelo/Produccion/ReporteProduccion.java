package Modelo.Produccion;

import Modelo.Produccion.Produccion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.draw.LineSeparator;

import java.io.FileOutputStream;

public class ReporteProduccion {

    public static void generarReportePDF(String rutaArchivo, Produccion produccion) {
        try {

            Document document = new Document(PageSize.A4, 50, 50, 50, 50);
            PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));
            document.open();

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD, BaseColor.BLUE);
            Font subTituloFont = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.DARK_GRAY);
            Font textoFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.BLACK);

            Paragraph titulo = new Paragraph("Reporte de Producción", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.setSpacingAfter(20);
            document.add(titulo);

            LineSeparator line = new LineSeparator();
            document.add(line);

            Paragraph ids = new Paragraph();
            ids.add(new Chunk("ID Producción: ", subTituloFont));
            ids.add(new Chunk(String.valueOf(produccion.getId()), textoFont));
            ids.add(Chunk.NEWLINE);
            ids.add(line);
            ids.add(Chunk.NEWLINE);
            ids.add(new Chunk("ID Cultivo: ", subTituloFont));
            ids.add(new Chunk(String.valueOf((Integer)produccion.getCultivo().getId()), textoFont));
            ids.setSpacingAfter(10);
            document.add(ids);

            document.add(line);

            Paragraph fecha = new Paragraph();
            fecha.add(new Chunk("Fecha: ", subTituloFont));
            fecha.add(new Chunk(String.valueOf(produccion.getFecha()), textoFont));
            fecha.setSpacingAfter(10);
            document.add(fecha);

            document.add(line);
            
            Paragraph cantidad = new Paragraph();
            cantidad.add(new Chunk("Cantidad recolectada: ", subTituloFont));
            cantidad.add(new Chunk(produccion.getCantidadRecolectada() + " Kg", textoFont));
            cantidad.setSpacingAfter(10);
            document.add(cantidad);

            document.add(line);

            Paragraph calidad = new Paragraph();
            calidad.add(new Chunk("Calidad del producto: ", subTituloFont));
            calidad.add(new Chunk(produccion.getCalidad(), textoFont));
            calidad.setSpacingAfter(10);
            document.add(calidad);

            document.add(line);

            Paragraph destino = new Paragraph();
            destino.add(new Chunk("Destino: ", subTituloFont));
            destino.add(new Chunk(produccion.getDestino(), textoFont));
            destino.setSpacingAfter(10);
            document.add(destino);
            document.add(line);

            document.close();

            System.out.println("Reporte PDF generado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
