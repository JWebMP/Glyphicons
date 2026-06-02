# JWebMP Glyphicons

[![Maven Central](https://img.shields.io/maven-central/v/com.jwebmp.plugins/glyphicons)](https://central.sonatype.com/artifact/com.jwebmp.plugins/glyphicons)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue)](https://www.apache.org/licenses/LICENSE-2.0)

![Java 25+](https://img.shields.io/badge/Java-25%2B-green)
![Modular](https://img.shields.io/badge/Modular-JPMS-green)
![Angular](https://img.shields.io/badge/Angular-21-DD0031?logo=angular)

<!-- Tech icons row -->
![Glyphicons](https://img.shields.io/badge/Glyphicons-1.9.2-blueviolet)
![JWebMP](https://img.shields.io/badge/JWebMP-2.0-0A7)

250+ monochromatic icons and symbols from Bootstrap 3's Glyphicons Halflings set for JWebMP applications. CSS web font rendering with `glyphicon glyphicon-` class prefix.

Built on [Glyphicons](http://glyphicons.com/) � [Angular 21](https://angular.dev/) � [JWebMP Core](https://jwebmp.com/) � JPMS module `com.jwebmp.plugins.glyphicons` � Java 25+

**Version: 1.9.2** � Classic Bootstrap 3 icon set with type-safe Java enum API.

## Installation

```xml
<dependency>
  <groupId>com.jwebmp.plugins</groupId>
  <artifactId>glyphicons</artifactId>
  <version>2.0.3-SNAPSHOT</version>
</dependency>
```

<details>
<summary>Gradle (Kotlin DSL)</summary>

```kotlin
implementation("com.jwebmp.plugins:glyphicons:2.0.0-SNAPSHOT")
```
</details>

## Features

- **250+ Monochromatic Icons** � Classic Bootstrap 3 Glyphicons Halflings set
- **Type-Safe Java Enum API** � `Glyphicons` enum with compile-time safety and IDE autocomplete
- **CSS Web Font Rendering** � `glyphicon glyphicon-` prefixed CSS classes
- **CRTP Fluent API** � `Glyphicon<J>` component with type-safe method chaining
- **IIcon Interface** � Implements JWebMP's standard icon interface for interoperability
- **Zero Configuration** � Auto-registered via ServiceLoader SPI
- **Modular Architecture** � JPMS module with explicit dependencies

## Quick Start

### Prerequisites

- **Java 25 LTS** (required)
- **Maven 3.8+**
- **Node.js 18+** (for frontend builds)
- **Angular 21+** (auto-integrated via JWebMP)

### Basic Usage

```java
import com.jwebmp.plugins.glyphicons.Glyphicon;
import com.jwebmp.plugins.glyphicons.Glyphicons;

// Create a home icon
var icon = new Glyphicon<>(Glyphicons.home);

// Search icon
var search = new Glyphicon<>(Glyphicons.search);

// Star icon
var star = new Glyphicon<>(Glyphicons.star);
```

---

## Architecture

### Module Structure

```
src/main/java/com/jwebmp/plugins/glyphicons/
+-- Glyphicon.java                      # CRTP icon component (span-based)
+-- Glyphicons.java                     # Enum with 250+ icon constants
+-- GlyphiconsPageConfigurator.java     # Auto-registration via ServiceLoader
+-- implementations/
    +-- GlyphiconInclusionModule.java
    +-- GlyphiconsExclusionsModule.java
```

---

## API Reference

### Glyphicon Component

```java
public class Glyphicon<J extends Glyphicon<J>>
    extends Span<IComponentHierarchyBase<?,?>, NoAttributes, J>
    implements IIcon<IComponentHierarchyBase<?,?>, J>

// Constructor
new Glyphicon<>(Glyphicons.home)

// Methods
.setIcon(Glyphicons icon)  // Fluent setter, returns J
.getIcon()                  // Returns current icon
.getClassName()             // Returns CSS class string
.getIconComponent()         // Returns this component
```

### Glyphicons Enum

```java
Glyphicons.home.toString()    // ? "glyphicon glyphicon-home"
Glyphicons.search.toString()  // ? "glyphicon glyphicon-search"
Glyphicons.star.toString()    // ? "glyphicon glyphicon-star"
```

---

## Configuration

The plugin is automatically configured when present on the classpath via `@TsDependency` and `@NgStyleSheet`.

---

## Module Graph

```
com.jwebmp.plugins.glyphicons
 +-- com.jwebmp.core                    (JWebMP core)
 +-- com.jwebmp.core.base.angular.client (Angular client annotations)
 +-- com.guicedee.guicedinjection       (Guice DI)
```

---

## Project Status

| Aspect | Status |
|--------|--------|
| **Version** | 1.9.2 / 2.0.0-SNAPSHOT |
| **Icons** | 250+ complete |
| **Java** | 25 LTS (required) |
| **Build** | Passing |
| **License** | Apache 2.0 |
| **Maintenance** | Active |

---

## Links

- **GitHub Repository**: https://github.com/JWebMP/JWebMP
- **Glyphicons**: http://glyphicons.com/
- **JWebMP Home**: https://jwebmp.com/

---

## License

Licensed under the [Apache License 2.0](LICENSE).

```
Copyright 2025 JWebMP Contributors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
```

---

## Support

- **GitHub Issues**: https://github.com/JWebMP/JWebMP/issues
- **Discussions**: https://github.com/JWebMP/JWebMP/discussions

---

**Made with JWebMP**
