package javaMid1.exception.ex3;

import javaMid1.exception.ex3.exception.ConnectExceptionV3;
import javaMid1.exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";

//        NetworkClientV2 client = new NetworkClientV2(address);
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } catch(SendExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getSendData() + ", 메시지 : " + e.getMessage());

        }finally{
            client.disconnect();
        }

    }
}
