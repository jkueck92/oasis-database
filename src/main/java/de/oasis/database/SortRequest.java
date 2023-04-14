package de.oasis.database;

import de.oasis.database.search.SortDirection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SortRequest implements Serializable {

    private String key;

    private SortDirection direction;

}
