# Watchman

Watchman is a Java project focused on recreating the core ideas behind Git version control using object-oriented programming principles.

The goal of this project is not to replace Git. It is a learning-oriented implementation that models how a version control system can track file changes, create commits, maintain history, and move between repository states using clean Java abstractions.

## Project Goals

- Recreate the essential behavior of a Git-like version control system.
- Practice object-oriented design through clear responsibilities and domain models.
- Build the system incrementally with maintainable Java code.
- Keep the implementation readable enough for learning, debugging, and extension.

## Core Concepts

This project is expected to model version control concepts such as:

- Repository initialization
- File tracking
- Staging changes
- Commit creation
- Commit history
- Branch-like references
- Restoring or checking out previous states

The implementation should keep these concepts separated into focused classes instead of placing all behavior in one large procedural flow.

## Design Direction

Watchman is designed around OOP principles:

- **Encapsulation**: repository internals should be hidden behind clear APIs.
- **Single Responsibility**: each class should own one meaningful part of the version control flow.
- **Abstraction**: storage, hashing, commits, and repository operations should be modeled as separate concerns.
- **Extensibility**: new Git-like features should be addable without rewriting the core system.

Possible domain objects include:

- `Repository`
- `Commit`
- `Blob`
- `Index`
- `Branch`
- `ObjectStore`
- `WorkingTree`

## Expected Flow

A typical version control flow in this project may look like:

1. Initialize a repository.
2. Track files from the working directory.
3. Stage selected changes.
4. Create a commit from the staged snapshot.
5. Store commit and file objects.
6. Read history or restore a previous state.

This mirrors the high-level data flow of Git while keeping the implementation approachable in Java.

## Tech Stack

- Java
- Object-oriented design
- File system based storage
- Hash-based object identity

## Status

This project is under active development. The README describes the intended direction and will evolve as the implementation grows.

