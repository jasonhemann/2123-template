# CSAS2123 project template

Use this starter project to set up your course projects. It includes the course
inspection profile, formatting rules, library references, and a setup check.

## Get started

1. Clone the course's private `2123-template` repository to your computer. If you
   downloaded a ZIP instead, extract it first.
2. Download [tester.jar](https://hemann.pl/26FA-CS2123/files/tester.jar) and
   [javalib.jar](https://hemann.pl/26FA-CS2123/files/javalib.jar) from the course site.
   Save both directly in this project's `lib/` folder. Keep their names and
   leave the JARs intact. These downloads are required for any IDE.
3. In IntelliJ IDEA, choose **Open** and select the project folder. Open the
   existing project rather than creating a new project inside it.
4. Open **File > Project Structure > Project** and select an installed **JDK 11**.
   If needed, choose **Download JDK**, select version 11, and use any OpenJDK
   vendor. Each computer selects its own JDK; the template supplies the Java 11
   language level.
5. Select **Setup check** in the run-configuration menu and click Run. The tester
   should report **All tests passed**, with 3 tests run. This checks both libraries
   without opening a graphics window.
6. Choose **File > New Projects Setup > Save Project as Template**. Name the
   template **CSAS2123** and save the whole project.
7. For each assignment, choose **File > New > Project** and select your saved
   **CSAS2123** template. Give the project its assignment name and a new folder.
   Your saved template is local to your IntelliJ installation.
8. Put your assignment's Java files in `src/`. To run its examples, duplicate the
   **Setup check** configuration and change **Program arguments** to your examples
   class name. Keep **Main class** set to `tester.Main`.

Students need access to the private repository before they can clone it. Plugins,
AI accounts, and visible line numbers still use each student's IDE setup.

## Other IDEs

You can use the same `src/` and `lib/` folders in another Java IDE. The `.idea/`
folder and `.iml` file configure IntelliJ and aren't required by other IDEs.
VS Code's Java extensions reference JARs in `lib/` by default. Select JDK 11 and
configure a Java launch with main class `tester.Main` and program argument
`ExamplesSetupCheck`. Set the VM argument `-Djdk.attach.allowAttachSelf=true` for
the tester library. You can choose your own AI tools.

## Course settings

The project selects its own **Project Default** inspection profile:

- Raw use of a parameterized class: **Error**. The inspection checks constructor
  calls and cases where it cannot offer an automatic fix.
- Diamond can be replaced with explicit type arguments: **Weak Warning**.
- Explicit type can be replaced with `<>`: **disabled**.
- Instance field and method access without `this`: **Warning**.

The rule for generics is: **write the type**, including constructor arguments:

```java
List<String> names = new ArrayList<String>();
```

The `.editorconfig` file sets spaces, two-space indentation and continuation
indentation, and a 100-column wrap setting and guide. Leave IntelliJ's EditorConfig
support enabled. These are editor inspection and formatting settings; the template
does not add compiler flags that reject raw types or turn warnings into build errors.

## Libraries and portability

The course website is the source for `tester.jar` and `javalib.jar`. This
repository contains no JAR files; students download them into `lib/`, and Git
ignores those local copies. IntelliJ refers to them relative to this project folder.
You don't need to define global libraries or reproduce the instructor's folders.

Download the libraries before saving your IntelliJ template. See `lib/README.md`
for the download links. Personal workspace files and compiled output are ignored
by Git.

The shared run configurations include `-Djdk.attach.allowAttachSelf=true` so the
tester can attach its own Java agent directly, including in project folders whose
names contain spaces. Keep this VM option when duplicating a test configuration.

For an existing course project, copy `.editorconfig` and
`.idea/inspectionProfiles/` from this template, then close and reopen that project.
Updating this repository does not update projects or IntelliJ templates you
already created. Re-save the IntelliJ template after updating its settings.
