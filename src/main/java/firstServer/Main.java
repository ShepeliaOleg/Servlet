package firstServer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by New on 27.07.14.
 */
public class Main {
    public static void main (String []a) throws JAXBException, FileNotFoundException {
        Student student = new Student();
        student.setName("Oleg");
        student.setAge(25);
        student.setScholarships(5.25);

        JAXBContext context = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(student,System.out);

/*        Main main = new Main();
        main.reader();*/
    }

    public void reader () throws JAXBException, FileNotFoundException {

        JAXBContext context = JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        InputStream inputStream = new FileInputStream("E:\\ProjectJava\\TwoCourse\\src\\main\\java\\firstServer\\x");

        Student student = (Student) unmarshaller.unmarshal(inputStream);

        System.out.println("student: " + student.getName() + " " + student.getAge() + " " + student.getScholarships());




    }
}
