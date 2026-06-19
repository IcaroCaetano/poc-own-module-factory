# poc-own-module-factory

## Structure

````plantuml
poc-own-module-factory

src

factory-domain
|
├── module-info.java
└── com/project/factory/domain
    ├── Product.java
    └── ProductionOrder.java


factory-service
|
├── module-info.java
└── com/project/factory/service
    └── ProductionService.java


factory-app
|
├── module-info.java
└── com/project/factory/app
    └── FactoryApplication.java
````

## What is module-info.java?

It's a configuration file that defines a Java module.

### It describes:

the module's name;
- which packages it exposes (exports);
- which other modules it depends on (requires);
- which services it provides;
- which services it consumes (uses).

Think of it as a public contract for the module.
