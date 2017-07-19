package Space;

import java.io.FileInputStream;
import java.io.IOException;

public interface ConfigSource {

    public boolean read(String file);
}
