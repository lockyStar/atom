package utils;

import model.Field;
import model.Player;
import model.Virus;
import org.jetbrains.annotations.NotNull;
import ticker.Tickable;

/**
 * @author apomosov
 */
public interface VirusGenerator {
  void generate();
}
