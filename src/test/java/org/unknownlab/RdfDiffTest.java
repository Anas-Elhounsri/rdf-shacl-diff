package org.unknownlab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import org.junit.jupiter.api.Test;

class RdfDiffTest {

    @Test
    void detectsAddedPath() {
        var deltas = RdfDiff.diff(Set.of(), Set.of("ex:name"));
        assertEquals(1, deltas.size());
    }
}
