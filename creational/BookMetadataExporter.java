package creational.creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit
        BookMetadataFormatter bookMetadataFormatter = createFormatter();
        for (Book book: books) {
            bookMetadataFormatter.append(book);
        }
        stream.println(bookMetadataFormatter.getMetadataString());
    }

    public abstract BookMetadataFormatter createFormatter();
}
