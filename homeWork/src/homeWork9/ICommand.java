package homeWork9;

import java.io.FileNotFoundException;

/**
 * Created by tish on 12.03.14.
 */
public interface ICommand {

    void help();

    void price() throws FileNotFoundException;

    void basket();

    void buy(int id);

    void commit();

    void clean();

    void exit();
}
