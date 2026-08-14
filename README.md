# rdf-shacl-diff

[![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.7654321.svg)](https://doi.org/10.5281/zenodo.7654321)

Compares two versions of a SHACL shapes graph and reports added, removed and
constrained properties.

## Build

```
mvn -q package
java -jar target/rdf-shacl-diff-0.3.0.jar old-shapes.ttl new-shapes.ttl
```

Output is a line-oriented diff, one row per shape/property path.
