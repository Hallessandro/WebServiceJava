/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Hallessandro
 */
public class CalculadoraClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://127.0.0.1:9876/calc?wsdl");
        QName qname = new QName("http://calc/","CalculadoraServerImplService");
        Service ws = Service.create(url, qname);
        CalculadoraServer calc = ws.getPort(CalculadoraServer.class);
        
        System.out.println("Soma (5+1): " + calc.soma(5, 1));
        System.out.println("Subtração (5-1): " + calc.subtracao(5, 1));
        System.out.println("Multiplicação (5*1): " + calc.multiplicacao(5, 1));
        System.out.println("Divisão (5/1): " + calc.divisao(5, 1));
    }
}
