package com.lokdon.datashield;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.persistence.EntityManager;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String KEY_CLIENT_ID = "client_id";
    public static final String KEY_PLAN = "plan";
    static final String KEY_TABLES_META="tables_meta";
    static final String KEY_API_KEY="api_key";
    static final String KEY_INSTANCE_ID="instance_id";
    static final String KEY_VERSION="version";
    static final String KEY_ROW_COUNT="row_count";
    static final String KEY_DATE_ACTIVATED="date_activated";
    static final String UWA="mocCAqTnl2T1aVkbLvGxGtNz8izZBHAtnFShjedoy0ry1";
    static final String createConfigTable="create table if not exists config(id bigint auto_increment primary key, k varchar(255), value text)";

    public static final JSONArray jsonArray;

    static {
        try {
            jsonArray = null;//(JSONArray)new JSONParser().parse(Files.readString(Path.of("C:/users/nahom/Downloads/exported2.json")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static List<List> partition(List objects, int partition) {
        List<List> chunks=new ArrayList<>();
        int size=objects.size();
        int i=0;
        while (i<size){
            int end=i+partition;
            if(end>size){
                end=size;
            }
            chunks.add(objects.subList(i,end));
            i=end;
        }
        return chunks;
    }

    public static void persistOnNewThread(List subChunk, OnCompleteListener onCompleteListener) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    /*for (Object object : subChunk) {
                        entityManager.persist(object);
                    }*/
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    onCompleteListener.onComplete(subChunk);
                }
            }
        }).start();
    }

    public static interface OnCompleteListener{
        void onComplete(List list);
    }
}
