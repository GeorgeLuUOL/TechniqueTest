package designPattern;

import java.util.List;
import java.util.Map;

public class Customer {
    private int id;
    private String name;
    private List<String> properties;
    private Map<String,String> extendInfo;

    public void spawn(){
        System.out.println("客户创建了 姓名是: "+name+" id是: "+id);
    }








    //---------------------------------------------------------lombok
    public Customer(){

    }

    public Customer(int id, String name, List<String> properties, Map<String, String> extendInfo) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.extendInfo = extendInfo;
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public Map<String, String> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Map<String, String> extendInfo) {
        this.extendInfo = extendInfo;
    }
}
