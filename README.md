# App

## Layout
 * *app*: Global parent POM with plugins management
 * *app-quality*: Archive containing code quality configuration
 * *app-parent*: Parent POM for Java project which inherits code quality and unit testing tools
 * *app-lib*: My Java library
 * *app-main*: My Java App

This structure is inspired from the one suggested for a [Multimodule Maven Project](https://maven.apache.org/plugins/maven-checkstyle-plugin/examples/multi-module-config.html).

## Build
 * Run `mvn clean package`
