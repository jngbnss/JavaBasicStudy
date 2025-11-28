package javaAdv2.network.tcp.autocloseable;

// 이번에는 예외가 발생해도 자원을 정리하도록 해보자
public class ResourceCloseMainV2 {
    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외 처리");
            e.printStackTrace();
        } catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            e.printStackTrace();
        }
    }

    private static void logic() throws CallException, CloseException {
        ResourceV1 resource1 = new ResourceV1("resource1");
        ResourceV1 resource2 = new ResourceV1("resource2");
        try {
            resource1.call();
            resource2.callEx();
            System.out.println("자원 정리");// 호출 안됨
            resource2.closeEx();
            resource1.closeEx();
        } catch (CallException e) {
            System.out.println("Ex : " + e);
            throw e; // CallException 다시 던짐
        } finally {
            if (resource2 != null) {
                resource2.closeEx(); // CloseException 발생!
            }
            if (resource1 != null) {
                resource1.closeEx(); // 이 코드 호출안됨!
            }
        }
    }
}

/**
 * 엥 여기는 문제가 뭐인지 모르겠다
 *
 */

