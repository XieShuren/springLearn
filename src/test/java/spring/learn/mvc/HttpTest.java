package spring.learn.mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpTest {

	public static void main(String[] args) {
		try {
			httpPostWithJson();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void httpPostWithJson() throws Exception {
		 HttpPost post = null;
		 HttpClient httpClient = new DefaultHttpClient();
		 post = new HttpPost("http://localhost:8080/wx");
	     // 构造消息头
	     post.setHeader("Content-type", "application/xml; charset=utf-8");
	     // 构建消息实体
        StringEntity entity = new StringEntity("<xml> <ToUserName>toUser</ToUserName> <FromUserName>fromUser</FromUserName> <CreateTime>1348831860</CreateTime> <MsgType>text</MsgType><MsgId>1234567890123456</MsgId><Content>你好</Content> </xml>", Charset.forName("UTF-8"));
        entity.setContentEncoding("UTF-8");
        // 发送Json格式的数据请求
        entity.setContentType("application/xml");
        post.setEntity(entity);
        HttpResponse response = httpClient.execute(post);
        HttpEntity responseEntity = response.getEntity();
        BufferedReader reader = new BufferedReader(new InputStreamReader(responseEntity.getContent(), "utf-8"));
        StringBuilder stringBuilder = new StringBuilder();
        String buff = null;
        while((buff = reader.readLine()) != null) {
        	stringBuilder.append(buff);
        }
        System.out.println(stringBuilder.toString());
	}
}
