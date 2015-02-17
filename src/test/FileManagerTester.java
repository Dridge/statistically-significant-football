package test;

import com.github.dridge.files.FileManager;
import org.junit.Test;

import java.io.File;

import static junit.framework.TestCase.fail;

/**
 * Created by Richard on 15/02/2015.
 */
public class FileManagerTester {

    @Test
    public void testCreateFile() {
        //use less test
        FileManager fm = new FileManager();
        fm.createFile();
        File f = new File(fm.getFileLocation());
        if (!f.exists()){
            fail();
        }
    }
}