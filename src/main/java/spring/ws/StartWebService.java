package spring.ws;

import java.io.ByteArrayInputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class StartWebService {

	public static void main(String[] args) throws Exception {
		String s = "<xml> <ToUserName>toUser</ToUserName> <FromUserName>fromUser</FromUserName> <CreateTime>1348831860</CreateTime> <MsgType>image</MsgType><MsgId>1234567890123456</MsgId> </xml>";
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new ByteArrayInputStream(s.getBytes("UTF-8")));
		Element rootElement = document.getRootElement();
		Element element = rootElement.element("ToUserName");
		System.out.println(element.getText());
	}
}
