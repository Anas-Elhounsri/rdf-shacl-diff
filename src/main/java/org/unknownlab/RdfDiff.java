package org.unknownlab;

import java.util.Set;
import java.util.TreeSet;

/** Minimal structural diff over shape property paths. */
public final class RdfDiff {

    public record Delta(String shape, String path, String kind) {}

    public static Set<Delta> diff(Set<String> before, Set<String> after) {
        Set<Delta> deltas = new TreeSet<>();
        for (String p : before) {
            if (!after.contains(p)) deltas.add(new Delta("Shape", p, "removed"));
        }
        for (String p : after) {
            if (!before.contains(p)) deltas.add(new Delta("Shape", p, "added"));
        }
        return deltas;
    }
}
