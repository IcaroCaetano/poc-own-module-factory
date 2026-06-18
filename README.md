# poc-own-module-factory

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