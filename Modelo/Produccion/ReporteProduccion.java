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


    public void generarReportePDF(String rutaArchivo, Produccion produccion) {
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

       
        Paragraph idFecha = new Paragraph();
        idFecha.add(new Chunk("ID: ", subTituloFont));
        idFecha.add(new Chunk(String.valueOf(produccion.getId()), textoFont));
        idFecha.add(Chunk.NEWLINE);
        idFecha.add(new Chunk("Fecha: ", subTituloFont));
        idFecha.add(new Chunk(String.valueOf(produccion.getFecha()), textoFont));
        idFecha.setSpacingAfter(10);
        document.add(idFecha);

        
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

        
        document.close();

        System.out.println("Reporte PDF generado exitosamente.");
    } catch (Exception e) {
        e.printStackTrace();
    }


}}