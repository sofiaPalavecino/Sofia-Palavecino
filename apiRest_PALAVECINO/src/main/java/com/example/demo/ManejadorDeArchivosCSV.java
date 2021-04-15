package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@Service
public class ManejadorDeArchivosCSV {

    private String ubicacionArchivo;
    private String nombreDeArchivo;
    private char separador;

    public ManejadorDeArchivosCSV() {
        this.ubicacionArchivo = "src/main/resources/files/";
        this.nombreDeArchivo = "bibliotecas.csv";
        this.separador = ',';
    }

    public CSVParser formatearSeparador(){
        CSVParserBuilder puntoYcomaBuilder = new CSVParserBuilder();
        puntoYcomaBuilder = puntoYcomaBuilder.withSeparator(separador);
        CSVParser parser = puntoYcomaBuilder.build();
        return parser;
    }


    public FileReader obtenerArchivo(){
        FileReader reader = null;
        try {
            reader = new FileReader(ubicacionArchivo + nombreDeArchivo);
        } catch (FileNotFoundException e) {
            String mensaje = "Archivo no encontrado, verifique el nombre y/o la ubicación del mismo";
            System.out.println(mensaje);
            e.printStackTrace();
        }
        return reader;
    }

    public CSVReader obtenerArchivoFormateado(){
        FileReader fileReader = this.obtenerArchivo();
        CSVReaderBuilder readerBuilder = new CSVReaderBuilder(fileReader);
        CSVParser separadorFormateado = this.formatearSeparador();
        readerBuilder = readerBuilder.withCSVParser(separadorFormateado);
        CSVReader reader = readerBuilder.build();
        return reader;
    }

    public Iterator<String[]> obtenerIterador(){
        CSVReader reader = this.obtenerArchivoFormateado();
        Iterator<String[]> iterador = reader.iterator();
        return iterador;
    }

    public void imprimirDatosConEspacios() throws FileNotFoundException {

        CSVReader reader = this.obtenerArchivoFormateado();
        Iterator<String[]> iterador = reader.iterator();

        while (iterador.hasNext()){
            String[] fila = iterador.next();
            String filaInfo = fila[0] + " " + fila[1] + " " + fila[2] + " " + fila[3] + " " + fila[4] + " " + fila[5] + " " + fila[6] + " " + fila[7] + " " + fila[8] + " " + fila[9];
            System.out.println(filaInfo);

        }
    }

    public HashMap<String,Object> obtenerHashMapConInfo(){

        CSVReader reader = this.obtenerArchivoFormateado();
        Iterator<String[]> iterador = reader.iterator();
        HashMap<String,Object> informacion = new HashMap<>();
        ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

        while (iterador.hasNext()){
            String[] fila = iterador.next();

            String provincia = fila[0];
            String localidad = fila[1];
            String nombre  = fila[2];
            String direccion_descripcion = fila[3];
            String piso = fila[4];
            String codigo_postal = fila[5];
            String codigo_indicativo_telefono = fila[6];
            Integer telefono = Integer.parseInt(fila[7]);
            String mail = fila[8];
            String web=fila[9];
            Biblioteca biblioteca = new Biblioteca(provincia,localidad,nombre,direccion_descripcion,piso,codigo_postal,codigo_indicativo_telefono,telefono,mail,web);
            bibliotecas.add(biblioteca);
        }

        informacion.put("casos",bibliotecas);

        return informacion;

    }

    public static void main(String[] args){
        ManejadorDeArchivosCSV m = new ManejadorDeArchivosCSV();


    }

}
