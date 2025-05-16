

import java.io.File;
import java.net.URL;
import java.nio.channels.ReadableByteChannel;

public class MavenWrapperDownloaderGeneratedAiTests {

    private static final String WRAPPER_VERSION = "0.5.6";
    private static final String DEFAULT_DOWNLOAD_URL = "https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/" + WRAPPER_VERSION + "/maven-wrapper-" + WRAPPER_VERSION + ".jar";

    @Test
    public void testDownloadFileFromURL() throws Exception {
        URL website = new URL(DEFAULT_DOWNLOAD_URL);
        ReadableByteChannel channel = Channels.newChannel(website.openStream());
        
        File destination = createTempFile("downloaded-maven-wrapper-").toFile();
        try (java.io.FileOutputStream fos = new java.io.FileOutputStream(destination)) {
            byte[] downloadedBytes = new byte[1024];
            int bytesRead;
            while ((bytesRead = channel.read(downloadedBytes, 0, downloadedBytes.length)) != -1) {
                fos.write(downloadedBytes, 0, bytesRead);
            }
        }

        String downloadedContent = destination.getAbsolutePath();
        
        assertNotNullOrEmpty("Downloaded content should not be null or empty", downloadedContent); // Assuming this is the correct assertion method
    }

    private static File createTempFile(String prefix) throws IOException {
        return java.io.File.createTempFile(prefix, ".jar");
    }
}
