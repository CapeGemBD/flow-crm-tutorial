 package com.example;

   import org.junit.jupiter.api.*;
   import static org.junit.jupiter.api.Assertions.*;

   public class MavenWrapperDownloaderGeneratedAiTest {

       private MavenWrapperDownloader downloader;
       private File baseDirectory;

       @BeforeEach
       public void setup() {
           this.downloader = new MavenWrapperDownloader();
           this.baseDirectory = new File("testBaseDirectory");
           if (!this.baseDirectory.exists()) {
               this.baseDirectory.mkdirs();
           }
       }

       @Test
       public void givenDefaultDownloadUrl_whenGettingDefaultDownloadUrl_thenCorrectUrlIsReturned() {
           // GIVEN
           String expectedDownloadUrl = "https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar";
           File outputFile = new File(this.baseDirectory, "outputFile");

           // WHEN
           String actualDownloadUrl = downloader.getDefaultDownloadUrl();

           // THEN
           assertEquals(expectedDownloadUrl, actualDownloadUrl);
       }

       @Test
       public void givenValidURL_whenDownloadingFileFromURL_thenFileExists() {
           // GIVEN
           String urlString = "https://example.com/test-file";
           File destination = new File(this.baseDirectory, "destination");

           // WHEN
           downloader.downloadFileFromURL(urlString, destination);

           // THEN
           assertTrue(destination.exists());
       }
   }