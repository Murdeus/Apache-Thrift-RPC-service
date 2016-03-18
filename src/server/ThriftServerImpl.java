package server;

import org.apache.thrift.TException;

import java.util.List;

/**
 * Created by smile on 18-Mar-16.
 */

public class ThriftServerImpl implements ThriftServer.Iface {

    private DataTransfer dto = new DataTransfer();

    @Override
    public List<String> getContent(){
        return dto.getContent();
    }

    @Override
    public int getColumns(){
        return dto.getColumns();
    }

    @Override
    public void addContent(List<String> listContent){
        dto.addContent(listContent);
    }

    @Override
    public void changeContent(List<String> personList, List<String> changeList){
        dto.changeContent(personList, changeList);
    }

    @Override
    public void deleteContent(List<String> personList){
        dto.deleteContent(personList);
    }

}
