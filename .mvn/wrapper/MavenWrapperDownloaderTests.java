

import java.io.File;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Properties;

public class MavenWrapperDownloaderTests {

    private File baseDirectory;
    private String url;
    private File outputFile;

    @BeforeEach
    void setUp() {
        baseDirectory = new File("test-directory");
        url = "https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/" + WRAPPER_VERSION + "/maven-wrapper-" + WRAPPER_VERSION + ".jar";
        outputFile = new File(baseDirectory, MAVEN_WRAPPER_JAR_PATH);
    }

    @Test
    void testDownloadFileFromURL() throws Exception {
        // GIVEN a valid URL and output file path
        // WHEN downloadFileFromURL is called with the provided URL and output file path
        MavenWrapperDownloader.downloadFileFromURL(url, outputFile);
        // THEN the output file exists and has a non-zero size
        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0);
    }

    @Test
    void testDownloadFileFromURLWithCustomUrl() throws Exception {
        // GIVEN a custom URL in maven-wrapper.properties file
        Properties mavenWrapperProperties = new Properties();
        mavenWrapperProperties.setProperty(PROPERTY_NAME_WRAPPER_URL, "https://example.com/maven-wrapper-" + WRAPPER_VERSION + ".jar");
        File mavenWrapperPropertyFile = new File(baseDirectory, MAVEN_WRAPPER_PROPERTIES_PATH);
        try (FileOutputStream fos = new FileOutputStream(mavenWrapperPropertyFile)) {
            mavenWrapperProperties.store(fos, "Custom Wrapper URL");
        }
        // WHEN downloadFileFromURL is called with the custom URL from the properties file
        MavenWrapperDownloader.downloadFileFromURL(url, outputFile);
        // THEN the output file exists and has a non-zero size
        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0);
    }

}
