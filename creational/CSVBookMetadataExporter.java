package creational.creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createFormatter() {
        try {
            return new CSVBookMetadataFormatter();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
