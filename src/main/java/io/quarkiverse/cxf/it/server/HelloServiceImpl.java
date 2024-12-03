package io.quarkiverse.cxf.it.server;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.xml.bind.annotation.XmlElement;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Date;
import java.util.List;

/**
 * The simplest Hello service implementation.
 */
@WebService(serviceName = "HelloService")
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LogManager.getLogger(HelloServiceImpl.class);

    @WebMethod
    @Override
    public String hello(String text, Date date, List<String> list, CustomObject customObject, List<CustomObject> customObjectList) {
        // สร้าง HelloDataBean และบันทึกข้อมูล
        HelloDataBean dataBean = new HelloDataBean();
        dataBean.setText(text);
        dataBean.setDate(date);
        dataBean.setList(list);
        dataBean.setCustomObject(customObject);
        dataBean.setCustomObjectList(customObjectList);

        // Logging เพื่อยืนยันว่า Bean มีข้อมูลครบถ้วน
        logger.info("Data stored in HelloDataBean: {}", dataBean);

        // สร้าง response
        StringBuilder response = new StringBuilder();
        response.append("Hello ").append(text).append("! ");
        response.append("The date is ").append(date.toString()).append(". ");

        if (list != null && !list.isEmpty()) {
            response.append("Items (ArrayList<String>): ").append(String.join(", ", list)).append(". ");
        } else {
            response.append("No items provided. ");
        }

        if (customObject != null) {
            response.append("Custom Object - Field1: ").append(customObject.getField1())
                    .append(", Field2: ").append(customObject.getField2()).append(". ");
        }

        if (customObjectList != null && !customObjectList.isEmpty()) {
            response.append("Custom Objects: ");
            for (CustomObject obj : customObjectList) {
                response.append("{Field1: ").append(obj.getField1())
                        .append(", Field2: ").append(obj.getField2()).append("}, ");
            }
        }

        return response.toString();
    }
}


