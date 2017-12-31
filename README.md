# SableCC

SableCC is a parser generator which generates object-oriented frameworks for building compilers, interpreters and other text parsers. SableCC keeps a clean separation between machine and user code which leads to a shorter development cycle.

## To Install

1. Clone/download the source to somewhere in your home directory
2. Add the SableCC bin to your path:
```
export PATH=$HOME/<path-to-sablecc-root>/bin:$PATH
```

## To Use
To generate the Java files from your grammar file, run sablecc:
```
sablecc <grammar-file>
```
See [TinyLang](https://github.com/comp520/TinyLang) to learn how the generated files integrate into your compiler project

*NOTE: this repository includes files from [SableCC 3.7](https://sourceforge.net/projects/sablecc/) with a modified bin for minimal configuration*
