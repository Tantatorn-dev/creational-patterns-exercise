package creational;

import javax.xml.parsers.ParserConfigurationException;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createFormatter() {
            return new JSONBookMetadataFormatter();
    }

}
