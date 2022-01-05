package thrift;

import com.freeb.Clients.AccountsClients;
import com.freeb.Utils.LockObjectPool;
import org.apache.thrift.TException;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

public class AccountsForeignClients extends AccountsClients implements Closeable {
    private static String host = "benchmark-server";
    private static int port = 8080;
    static {
        System.out.println("in AccountsForeignClients");
    }
    private final LockObjectPool<ThriftSearchClientImpl> clientPool = new LockObjectPool<>(32,()->new ThriftSearchClientImpl(host,port));


    public List<Long> IdealResEfficiencyTest(int totalComputationLoad, int threadName){
        ThriftSearchClientImpl client = clientPool.borrow();
        try{
            List<Long> reults = client.client.IdealResEfficiencyTest(totalComputationLoad,threadName);
        } catch (TException e) {
            e.printStackTrace();
        }finally {
            clientPool.release(client);
        }
        return null;
    }

    @Override
    public void close() throws IOException {
        clientPool.close();
    }

    //Todo Notice if valid
    @Override
    protected AccountsClients getClient() {
        return this;
    }
}