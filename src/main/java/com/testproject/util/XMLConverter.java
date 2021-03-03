package com.testproject.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class XMLConverter {

    public static <T> String convertObjectToXML(Class<?> aClass, T t){

        String xml = null;
        try {
            StringWriter stringWriter = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(aClass);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(t, stringWriter);
            xml = stringWriter.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return xml;
    }
}
