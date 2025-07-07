package _SourceCode;
import java.net.InetAddress;
public class LayDiaChiIP {
    public static void main(String args[]) throws Exception
    {
        InetAddress myIP=InetAddress.getLocalHost();
        System.out.println("Địa chỉ IP là:");
        System.out.println(myIP.getHostAddress());
    }
}
