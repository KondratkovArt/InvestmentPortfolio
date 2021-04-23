package portfolio.model;

import java.util.UUID;

public interface Investment { // Пока для объединения всех инвестиций в коллекцию

    public String getInfo();
    public UUID getUid();

}
