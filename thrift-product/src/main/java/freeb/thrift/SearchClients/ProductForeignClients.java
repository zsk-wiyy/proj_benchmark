package freeb.thrift.SearchClients;

import com.freeb.Clients.ProductClients;
import com.freeb.Utils.LockObjectPool;
import org.apache.thrift.TException;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

public class ProductForeignClients extends ProductClients implements Closeable {

    private static String search_host = "bm-search-server";

    private static int search_port = 8080;

    static {
        System.out.println("in ProductForeignClients");
    }
    // TODO@ high priority port是否可以共用


    private final LockObjectPool<ThriftSearchClientImpl> searchClientPool = new LockObjectPool<>(32,()->new ThriftSearchClientImpl(search_host, search_port));



    @Override
    public void close() throws IOException {
        searchClientPool.close();
    }

    @Override
    public Boolean OfflineUserTagComputation(List<Long> uidLst) {
        ThriftSearchClientImpl client = searchClientPool.borrow();
        try {
            return client.client.OfflineUserTagComputation(uidLst);
        } catch (TException e) {
            e.printStackTrace();
        }

        return null;
    }
}