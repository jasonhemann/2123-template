# Course libraries

Download these two files directly into this folder:

- [tester.jar](https://hemann.pl/26FA-CS2123/files/tester.jar)
- [javalib.jar](https://hemann.pl/26FA-CS2123/files/javalib.jar)

Keep the filenames `tester.jar` and `javalib.jar`. Don't extract the JARs or put
them in a nested folder. The layout should be:

```text
lib/
  README.md
  tester.jar
  javalib.jar
```

The course website is the authoritative download source. This repository keeps
only the library references and instructions; Git ignores downloaded JARs.

IntelliJ users: download the files and run **Setup check** before choosing
**Save Project as Template**. Other IDEs can use these same JARs; VS Code's Java
extensions reference `lib/**/*.jar` by default.
