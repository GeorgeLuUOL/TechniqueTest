import java.util.ArrayList;
import java.util.List;

public class MsgMaking {
    public static void main(String[] args) {
        MsgMaking m = new MsgMaking();
        List<String> ids = new ArrayList<>();
        ids.add("3e33f6a5");
        ids.add("f86288e6");
        System.out.println(m.getMsgBody("预警推送消息",ids));
    }

    public String getMsgBody(String content, List<String> ids){
        StringBuilder msgBuilder = new StringBuilder();
        msgBuilder.append("{\n" +
                "\"msg_type\": \"post\",\n" +
                "\"content\": {\n" +
                "\"post\": {\n" +
                "\"zh_cn\": {\n" +
                "\"title\": \"项目更新通知\",\n" +
                "\"content\": [\n" +
                "[\n" +
                "{\n" +
                "\"tag\": \"text\",\n" +
                "\"text\":");
        msgBuilder.append("\""+content+"\"");
        if(ids.size()!=0){
            msgBuilder.append( " },");
        }
        else {
            msgBuilder.append( " }");
        }
        for (int i=0; i<ids.size();i++){
            if(i==(ids.size()-1)){
                msgBuilder.append("{\n" +
                        "\"tag\": \"at\",\n" +
                        "\"user_id\": ");
                msgBuilder.append("\""+ids.get(i)+"\"");
                msgBuilder.append(" }");
            }
            else {
                msgBuilder.append("{\n" +
                        "\"tag\": \"at\",\n" +
                        "\"user_id\": ");
                msgBuilder.append("\""+ids.get(i)+"\"");
                msgBuilder.append(" },\n");
            }
        }
        msgBuilder.append(" ]\n" +
                "]\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "}");
        return msgBuilder.toString();
    }
}
