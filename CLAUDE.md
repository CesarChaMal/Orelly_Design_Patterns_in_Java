# CLAUDE.md - AI Assistant Guide for Design Patterns in Java

## Repository Overview

This repository contains example code for **"Design Patterns in Java"** by Petter Graff, published by O'Reilly Media. It demonstrates classic Gang of Four (GoF) design patterns implemented in Java across 14 chapters.

**Key Information:**
- **Publisher:** O'Reilly Media, Inc.
- **ISBN:** 9781771374040
- **Purpose:** Educational examples for learning design patterns
- **License:** O'Reilly example code usage terms (see README.md)
- **Code Status:** Examples are NOT production code and have not been carefully tested

## Repository Structure

### Directory Organization

```
Orelly_Design_Patterns_in_Java/
├── README.md                        # Usage rights and attribution
├── Working Files - README.txt       # Additional notes
├── .gitignore                       # Git exclusions
├── logo.png                         # O'Reilly logo
├── Chapter 1/                       # No code examples
├── Chapter 2/                       # No code examples
├── Chapter 3/                       # Composite Pattern
│   └── src/com/scispike/composite/
├── Chapter 4/                       # Proxy Pattern
│   └── src/com/scispike/proxy/
├── Chapter 5/                       # Adapter Pattern (Maven)
│   └── adapter/
│       ├── pom.xml
│       ├── log4j.properties
│       └── src/main/java/com/scispike/adapter/
├── Chapter 6/                       # Decorator Pattern
│   └── src/com/scispike/decorator/
├── Chapter 7/                       # No code examples
├── Chapter 8/                       # No code examples
├── Chapter 9/                       # Factory & Singleton Patterns
│   └── src/com/scispike/creational/
├── Chapter 10/                      # Observer Pattern
│   └── src/com/scispike/observer/
│       ├── library/
│       └── client/
├── Chapter 11/                      # Command Pattern
│   └── src/com/scispike/command/
├── Chapter 12/                      # Template Method Pattern
│   └── src/com/scispike/template/
├── Chapter 13/                      # Strategy Pattern
│   └── src/com/inferdata/strategy/
└── Chapter 14/                      # No code examples
```

### Chapters with Code Examples

| Chapter | Pattern | Package | Entry Point | Dependencies |
|---------|---------|---------|-------------|--------------|
| 3 | **Composite** | `com.scispike.composite` | `CompositeTest.java` | None |
| 4 | **Proxy** | `com.scispike.proxy` | `Main.java` | None |
| 5 | **Adapter** | `com.scispike.adapter` | `Main.java` | Maven, commons-logging, log4j |
| 6 | **Decorator** | `com.scispike.decorator` | `Main.java` | java.awt.* |
| 9 | **Factory/Singleton** | `com.scispike.creational` | `Main.java`, `Client.java` | None |
| 10 | **Observer** | `com.scispike.observer` | `Driver.java`, `Setup.java` | None |
| 11 | **Command** | `com.scispike.command` | `Demo.java` | None |
| 12 | **Template Method** | `com.scispike.template` | `Main.java` | java.awt.* |
| 13 | **Strategy** | `com.inferdata.strategy` | `Main.java` | None |

### Chapters without Code

Chapters 1, 2, 7, 8, and 14 contain only reading materials (marked as "No Work Files").

## Design Patterns Reference

### Structural Patterns

#### Chapter 3: Composite Pattern
**Purpose:** Compose objects into tree structures to represent part-whole hierarchies

**Key Classes:**
- `Expression` - Component interface
- `BinaryExpression` - Composite abstract class
- `Constant` - Leaf class
- `Adder`, `Subtracter`, `Multiplier`, `Divider` - Concrete composites

**Location:** `/Chapter 3/src/com/scispike/composite/`

#### Chapter 4: Proxy Pattern
**Purpose:** Provide a surrogate or placeholder for another object

**Key Classes:**
- `BusinessObject` - Subject interface
- `BusinessObjectImplementation` - Real subject
- `BusinessObjectProxy` - Proxy

**Location:** `/Chapter 4/src/com/scispike/proxy/`

#### Chapter 5: Adapter Pattern
**Purpose:** Convert the interface of a class into another interface clients expect

**Key Classes:**
- `Logger` - Target interface
- `LoggerImpl` - Adaptee
- `ApacheCommonsLogAdapter` - Adapter

**Location:** `/Chapter 5/adapter/src/main/java/com/scispike/adapter/`
**Build:** Maven (requires commons-logging 1.1.3, log4j 1.2.17)

#### Chapter 6: Decorator Pattern
**Purpose:** Attach additional responsibilities to an object dynamically

**Key Classes:**
- `GraphicalComponent` - Component interface
- `TextField` - Concrete component
- `BorderDecorator`, `ScrollBarDecorator` - Decorators

**Location:** `/Chapter 6/src/com/scispike/decorator/`

### Creational Patterns

#### Chapter 9: Factory & Singleton Patterns
**Purpose:** Define an interface for creating objects; ensure a class has only one instance

**Key Classes:**
- Shape hierarchy (Factory pattern)
- `LogManager` (Singleton pattern)

**Location:** `/Chapter 9/src/com/scispike/creational/`

### Behavioral Patterns

#### Chapter 10: Observer Pattern
**Purpose:** Define a one-to-many dependency between objects

**Key Classes:**
- `Observable` - Subject
- `Observer` - Observer interface
- `Thermometer` - Concrete observable
- Client implementations

**Location:** `/Chapter 10/src/com/scispike/observer/`

#### Chapter 11: Command Pattern
**Purpose:** Encapsulate a request as an object

**Key Classes:**
- `Function` - Command interface
- `Demo` - Invoker

**Location:** `/Chapter 11/src/com/scispike/command/`

#### Chapter 12: Template Method Pattern
**Purpose:** Define the skeleton of an algorithm in an operation

**Key Classes:**
- `Game` - Template class
- `BasicRecipeJ2D` - Concrete implementation

**Location:** `/Chapter 12/src/com/scispike/template/`

#### Chapter 13: Strategy Pattern
**Purpose:** Define a family of algorithms, encapsulate each one, and make them interchangeable

**Key Classes:**
- `PrinterQueue` - Context interface
- `SimpleFIFOPrinterQueue` - Concrete strategy
- `JobPriorityPrinterQueue` - Concrete strategy
- `Job`, `User`, `Printer` - Supporting classes

**Location:** `/Chapter 13/src/com/inferdata/strategy/`

## Development Workflows

### Working with Individual Chapters

Each chapter is **self-contained** and can be worked on independently.

#### For Plain Java Chapters (3, 4, 6, 9, 10, 11, 12, 13)

**Compile:**
```bash
cd "Chapter X"
javac -d bin src/com/company/pattern/*.java
```

**Run:**
```bash
java -cp bin com.company.pattern.Main
```

**Example for Chapter 3:**
```bash
cd "Chapter 3"
javac -d bin src/com/scispike/composite/*.java src/com/scispike/composite/test/*.java
java -cp bin com.scispike.composite.test.CompositeTest
```

#### For Maven Chapter (5)

**Build:**
```bash
cd "Chapter 5/adapter"
mvn clean compile
```

**Run:**
```bash
mvn exec:java -Dexec.mainClass="com.scispike.adapter.Main"
```

**Dependencies:**
- commons-logging 1.1.3
- log4j 1.2.17

### Git Workflow

**Current Branch:** `claude/claude-md-mhy21pqg52u502hy-011zijg87iJujLGbSKy1MQSo`

**Important Git Rules:**
- Always develop on the designated `claude/` branch
- Commit with clear, descriptive messages
- Push to the specified branch when complete
- Never push to different branches without permission

**Committing Changes:**
```bash
git add .
git commit -m "Description of changes"
git push -u origin claude/claude-md-mhy21pqg52u502hy-011zijg87iJujLGbSKy1MQSo
```

### IDE Configuration

**Recommended Settings:**
- Source level: Java 8 or higher
- Encoding: UTF-8
- Indentation: Spaces (varies by chapter, observe existing code)

**IDE Files (gitignored):**
- `.idea/` - IntelliJ IDEA
- `.project`, `.classpath` - Eclipse
- `*.iml` - IntelliJ module files

## Key Conventions

### Package Naming

**Primary Convention:**
```
com.scispike.<pattern-name>
```

**Examples:**
- `com.scispike.composite` - Composite pattern
- `com.scispike.proxy` - Proxy pattern
- `com.scispike.adapter` - Adapter pattern
- `com.scispike.decorator` - Decorator pattern
- `com.scispike.creational` - Creational patterns
- `com.scispike.observer` - Observer pattern
- `com.scispike.command` - Command pattern
- `com.scispike.template` - Template Method pattern

**Exception:**
- `com.inferdata.strategy` - Strategy pattern (different organization)

### Code Organization

**Sub-packages:**
- `.test` - Test classes (e.g., Chapter 3)
- `.library` - Library/framework code (e.g., Observer)
- `.client` - Client/consumer code (e.g., Observer)

### Entry Points

**Common Patterns:**
- `Main.java` - Most common entry point
- `Demo.java` - Demonstration class (Chapter 11)
- `*Test.java` - Test classes (Chapter 3)
- `Driver.java`, `Setup.java` - Multi-class entry points (Chapter 10)

### Code Style

**Observations:**
- Mixed indentation (tabs and spaces) across chapters
- Minimal comments (focus on pattern implementation)
- Simple, educational-focused implementations
- Not production-ready (as stated in README)

## AI Assistant Guidelines

### When Analyzing Code

1. **Understand the Pattern First:** Each chapter implements a specific design pattern. Review the pattern's intent before suggesting changes.

2. **Preserve Educational Value:** Code is intentionally simple to demonstrate patterns. Don't over-engineer or add unnecessary complexity.

3. **Respect Chapter Isolation:** Each chapter is independent. Don't create cross-chapter dependencies.

4. **Acknowledge Limitations:** This is example code, not production code. Don't expect:
   - Comprehensive error handling
   - Production-grade testing
   - Performance optimizations
   - Security considerations

### When Making Changes

1. **Match Existing Style:** Each chapter may have different conventions. Observe and match:
   - Indentation (tabs vs spaces)
   - Naming conventions
   - File organization

2. **Preserve Pattern Implementation:** Don't refactor in ways that obscure the design pattern being demonstrated.

3. **Keep It Simple:** If adding code, maintain the educational, straightforward style.

4. **Test Before Committing:** Compile and run the example to ensure it still works.

### When Adding Features

1. **Create New Examples:** Rather than modifying existing examples, consider creating variant implementations.

2. **Document Pattern Usage:** If adding code, add comments explaining how it relates to the design pattern.

3. **Maintain Independence:** Don't introduce dependencies between chapters unless absolutely necessary.

### When Explaining Code

1. **Pattern-Focused Explanations:** Relate code elements to their roles in the design pattern:
   - "This is the Subject interface in the Observer pattern"
   - "This class acts as the Proxy for the real BusinessObject"

2. **Reference GoF Terminology:** Use standard Gang of Four terminology:
   - Component, Composite, Leaf
   - Subject, Observer, ConcreteObserver
   - Strategy, Context
   - Template Method, Concrete Class

3. **Provide Pattern Context:** Explain when and why to use each pattern.

### Common Tasks

#### Adding a New Pattern Example

1. Determine appropriate chapter number
2. Create directory: `Chapter X/src/com/scispike/<pattern>/`
3. Implement pattern classes following GoF structure
4. Create `Main.java` or `Demo.java` entry point
5. Keep dependencies minimal (plain Java preferred)
6. Update this CLAUDE.md if adding a new chapter

#### Fixing Compilation Issues

1. Check Java version compatibility
2. Verify package declarations match directory structure
3. For Chapter 5: Ensure Maven dependencies are resolved
4. Check for missing imports

#### Enhancing Existing Examples

1. Read the pattern implementation first
2. Identify the core pattern elements
3. Make enhancements that reinforce the pattern
4. Don't add features that obscure the pattern
5. Test thoroughly

## Build and Dependencies

### Build Systems

**Maven (Chapter 5 only):**
- Location: `/Chapter 5/adapter/pom.xml`
- Dependencies: commons-logging 1.1.3, log4j 1.2.17
- Standard Maven directory structure

**Plain Java (All other chapters):**
- No build configuration files
- Direct compilation with `javac`
- Standard `src/` directories

### External Dependencies

**Chapter 5 (Adapter):**
```xml
<dependency>
    <groupId>commons-logging</groupId>
    <artifactId>commons-logging</artifactId>
    <version>1.1.3</version>
</dependency>
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>
```

**Standard Library Usage:**
- `java.util.*` - Collections, utilities
- `java.awt.*` - GUI components (Chapters 6, 12)
- `java.awt.event.*` - Event handling (Chapter 12)

### No Root-Level Build

**Important:** There is no root-level `pom.xml` or `build.gradle`. Each chapter is compiled and run independently.

## Testing

### Current State

- **Limited Testing:** Most chapters have `Main` classes that demonstrate functionality
- **Chapter 3:** Has `CompositeTest.java` in a test subdirectory
- **No Unit Test Framework:** No JUnit or TestNG dependencies

### Running Examples

Each example demonstrates its pattern through a main method. Expected behavior:
- **Console Output:** Most examples print results to stdout
- **GUI Windows:** Chapters 6 and 12 may display graphical components
- **No Persistent State:** Examples don't save data or maintain state between runs

## Important Notes for AI Assistants

### Code Quality Expectations

**Remember from README.md:**
> "Please note that the examples are not production code and have not been carefully tested. They are provided 'as-is' and come with no warranty of any kind."

**Implications:**
- Don't expect comprehensive error handling
- Don't expect security considerations
- Don't expect performance optimizations
- Don't expect extensive testing
- Focus on pattern demonstration clarity

### Copyright and Attribution

**From README.md:**
- Content published by O'Reilly Media, Inc.
- Usage permitted for learning and small-scale integration
- Attribution appreciated: Title, Author, Publisher, ISBN
- Don't redistribute as a collection without permission

**When suggesting code:**
- Keep examples educational
- Don't create products from this code
- Maintain attribution if sharing

### Pattern Purity vs. Practicality

**Educational Focus:** These examples prioritize:
1. Clear demonstration of pattern structure
2. Simplicity and readability
3. Minimal dependencies
4. Standalone execution

**They do NOT prioritize:**
1. Production-ready code
2. Comprehensive error handling
3. Performance optimization
4. Real-world complexity

**AI Guidance:** When working with this code, maintain the educational focus. Don't suggest "production-ready" improvements unless specifically asked.

## Quick Reference

### File Counts
- **Total Java Files:** 49
- **Chapters with Code:** 9
- **Chapters without Code:** 5
- **Patterns Demonstrated:** 9

### Most Common Entry Points
- `Main.java` - Chapters 4, 5, 6, 9, 12, 13
- `Demo.java` - Chapter 11
- `CompositeTest.java` - Chapter 3
- `Driver.java` / `Setup.java` - Chapter 10

### Package Namespaces
- `com.scispike.*` - 8 patterns
- `com.inferdata.*` - 1 pattern (Strategy)

## Resources

- **Book:** Design Patterns in Java by Petter Graff
- **Safari Books:** https://www.safaribooksonline.com/library/view/title/9781771374040/
- **O'Reilly Permissions:** permissions@oreilly.com

---

**Last Updated:** 2025-11-13
**Repository:** Orelly_Design_Patterns_in_Java
**Branch:** claude/claude-md-mhy21pqg52u502hy-011zijg87iJujLGbSKy1MQSo
