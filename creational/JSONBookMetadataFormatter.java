package creational.creational;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Arrays;


public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jsonObjects;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        jsonObjects = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject newObj = new JSONObject();
        newObj.put("ISBN",b.getISBN());
        newObj.put("Title",b.getTitle());
        newObj.put("Publisher",b.getPublisher());

        String authors = String.join("|", b.getAuthors());
        newObj.put("Authors", authors);

        jsonObjects.add(newObj);
        return this;
    }

    @Override
    public String getMetadataString() {
        return jsonObjects.toJSONString();
    }
}
