

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

class MavenWrapperDownloaderGeneratedAiTests {

    private MavenWrapperDownloader downloader;

    @BeforeEach
    void setUp() {
        downloader = new MavenWrapperDownloader();
    }

    @Test
    void main_baseDirectory_downloadsFile() {
        // GIVEN: Setup the base directory
        File baseDirectory = new File(".");

        // WHEN: Call the main method with the base directory
        downloader.main(new File(baseDirectory.getAbsolutePath()));

        // THEN: Verify that the file was downloaded
        File outputFile = new File(baseDirectory.getAbsolutePath(), "maven-wrapper.jar");
        assertTrue(outputFile.exists());
    }

    @Test
    void main_customUrl_downloadsFile() {
        // GIVEN: Set a custom download URL
        String customUrl = "https://example.com/maven-wrapper.jar";

        // WHEN: Call the main method with the custom URL
        downloader.main(new File(baseDirectory.getAbsolutePath()), customUrl);

        // THEN: Verify that the file was downloaded
        File outputFile = new File(baseDirectory.getAbsolutePath(), "maven-wrapper.jar");
        assertTrue(outputFile.exists());
    }

    @Test
    void main_noUrl_downloadsFile() {
        // GIVEN: No URL provided
        File baseDirectory = new File(".");

        // WHEN: Call the main method with the base directory
        downloader.main(new File(baseDirectory.getAbsolutePath()));

        // THEN: Verify that the file was downloaded
        File outputFile = new File(baseDirectory.getAbsolutePath(), "maven-wrapper.jar");
        assertTrue(outputFile.exists());
    }
}
