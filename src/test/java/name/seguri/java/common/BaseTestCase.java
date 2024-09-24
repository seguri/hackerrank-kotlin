package name.seguri.java.common;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

/**
 * This class was suggested by {@link MockitoAnnotations} javadoc. Seems like a good workaround to
 * the absence of the Spring context, usually doing these things for me.
 */
public class BaseTestCase {

  private AutoCloseable closeable;

  @BeforeEach
  public void openMocks() {
    closeable = MockitoAnnotations.openMocks(this);
  }

  @AfterEach
  public void releaseMocks() throws Exception {
    closeable.close();
  }
}
